package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.GameinitProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class GameInitPrototype implements IPrototype{
	private GameinitProbuf.GameInit.Builder builder;
    //------------------------------------------
    public GameInitPrototype() {
		builder = GameinitProbuf.GameInit.newBuilder();
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
 	
  	public int getInitType() {
		return builder.getInitType();
  	}	

  	public void setInitType(int initType) {
		builder.setInitType(initType);
 	}
 	
  	public int getInitSubType() {
		return builder.getInitSubType();
  	}	

  	public void setInitSubType(int initSubType) {
		builder.setInitSubType(initSubType);
 	}
 	
	public List<Integer> getInitParamList() {
		return builder.getInitParamListList();
	}

	public void setInitParamList(List<Integer> initParamList) {
		builder.addAllInitParamList(initParamList);
	}
 	public GameInitPrototype(int keyId,String desc,int initType,int initSubType,List<Integer> initParamList) {
		builder = GameinitProbuf.GameInit.newBuilder();
		builder.setKeyId(keyId);
		builder.setDesc(desc);
		builder.setInitType(initType);
		builder.setInitSubType(initSubType);
		builder.addAllInitParamList(initParamList); 
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
		GameinitProbuf.GameInit pb;
		try {
			pb = GameinitProbuf.GameInit.parseFrom(in);
			builder = GameinitProbuf.GameInit.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setDesc(pb.getDesc());
			builder.setInitType(pb.getInitType());
			builder.setInitSubType(pb.getInitSubType());
			builder.addAllInitParamList(pb.getInitParamListList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}