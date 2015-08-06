package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.UserProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class UserIconPrototype implements IPrototype{
	private UserProbuf.UserIcon.Builder builder;
    //------------------------------------------
    public UserIconPrototype() {
		builder = UserProbuf.UserIcon.newBuilder();
	}
	@Override
	public void obtainAfter() {
	}


  	public int getKeyId() {
		return builder.getKeyId();
  	}	

  	public void setKeyId(int keyId) {
		builder.setKeyId(keyId);
 	}
 	
  	public String getDesc() {
		return builder.getDesc();
  	}	

  	public void setDesc(String desc) {
		builder.setDesc(desc);
 	}
 	
  	public String getConditionsDesc() {
		return builder.getConditionsDesc();
  	}	

  	public void setConditionsDesc(String conditionsDesc) {
		builder.setConditionsDesc(conditionsDesc);
 	}
 	
  	public int getRequireMoneyType() {
		return builder.getRequireMoneyType();
  	}	

  	public void setRequireMoneyType(int requireMoneyType) {
		builder.setRequireMoneyType(requireMoneyType);
 	}
 	
  	public int getRequireMoneyCount() {
		return builder.getRequireMoneyCount();
  	}	

  	public void setRequireMoneyCount(int requireMoneyCount) {
		builder.setRequireMoneyCount(requireMoneyCount);
 	}
 	
  	public int getCondition() {
		return builder.getCondition();
  	}	

  	public void setCondition(int condition) {
		builder.setCondition(condition);
 	}
 	
	public List<String> getConditionParamList() {
		return builder.getConditionParamListList();
	}

	public void setConditionParamList(List<String> conditionParamList) {
		builder.addAllConditionParamList(conditionParamList);
	}
  	public String getIconFilename() {
		return builder.getIconFilename();
  	}	

  	public void setIconFilename(String iconFilename) {
		builder.setIconFilename(iconFilename);
 	}
 	
 	public UserIconPrototype(int keyId,String desc,String conditionsDesc,int requireMoneyType,int requireMoneyCount,int condition,List<String> conditionParamList,String iconFilename) {
		builder = UserProbuf.UserIcon.newBuilder();
		builder.setKeyId(keyId);
		builder.setDesc(desc);
		builder.setConditionsDesc(conditionsDesc);
		builder.setRequireMoneyType(requireMoneyType);
		builder.setRequireMoneyCount(requireMoneyCount);
		builder.setCondition(condition);
		builder.addAllConditionParamList(conditionParamList); 
		builder.setIconFilename(iconFilename);
	}
	
  	public byte[] toBytes() {
		return builder.build().toByteArray();
	}

	@Override
	public void write(OutputStream out) throws IOException {
		builder.build().writeTo(out);
	}
	
	@Override
	public void readFields(InputStream in) throws IOException {
		UserProbuf.UserIcon pb;
		try {
			pb = UserProbuf.UserIcon.parseFrom(in);
			builder = UserProbuf.UserIcon.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setDesc(pb.getDesc());
			builder.setConditionsDesc(pb.getConditionsDesc());
			builder.setRequireMoneyType(pb.getRequireMoneyType());
			builder.setRequireMoneyCount(pb.getRequireMoneyCount());
			builder.setCondition(pb.getCondition());
			builder.addAllConditionParamList(pb.getConditionParamListList()); 
			builder.setIconFilename(pb.getIconFilename());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}