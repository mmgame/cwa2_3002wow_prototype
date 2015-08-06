package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.MatchProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class ConcealConditionPrototype implements IPrototype{
	private MatchProbuf.ConcealCondition.Builder builder;
    //------------------------------------------
    public ConcealConditionPrototype() {
		builder = MatchProbuf.ConcealCondition.newBuilder();
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
 	public ConcealConditionPrototype(int keyId,int condition,List<String> conditionParamList) {
		builder = MatchProbuf.ConcealCondition.newBuilder();
		builder.setKeyId(keyId);
		builder.setCondition(condition);
		builder.addAllConditionParamList(conditionParamList); 
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
		MatchProbuf.ConcealCondition pb;
		try {
			pb = MatchProbuf.ConcealCondition.parseFrom(in);
			builder = MatchProbuf.ConcealCondition.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setCondition(pb.getCondition());
			builder.addAllConditionParamList(pb.getConditionParamListList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}