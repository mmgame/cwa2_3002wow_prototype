package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.GamecdProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class GameCDPrototype implements IPrototype{
	private GamecdProbuf.GameCD.Builder builder;
    //------------------------------------------
    public GameCDPrototype() {
		builder = GamecdProbuf.GameCD.newBuilder();
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
 	
  	public String getName() {
		return builder.getName();
  	}	

  	public void setName(String name) {
		builder.setName(name);
 	}
 	
  	public String getDescribe() {
		return builder.getDescribe();
  	}	

  	public void setDescribe(String describe) {
		builder.setDescribe(describe);
 	}
 	
  	public int getCdTime() {
		return builder.getCdTime();
  	}	

  	public void setCdTime(int cdTime) {
		builder.setCdTime(cdTime);
 	}
 	
  	public int getStartTime() {
		return builder.getStartTime();
  	}	

  	public void setStartTime(int startTime) {
		builder.setStartTime(startTime);
 	}
 	
  	public int getIsSave() {
		return builder.getIsSave();
  	}	

  	public void setIsSave(int isSave) {
		builder.setIsSave(isSave);
 	}
 	
  	public int getCdHandlerType() {
		return builder.getCdHandlerType();
  	}	

  	public void setCdHandlerType(int cdHandlerType) {
		builder.setCdHandlerType(cdHandlerType);
 	}
 	
 	public GameCDPrototype(int keyId,String name,String describe,int cdTime,int startTime,int isSave,int cdHandlerType) {
		builder = GamecdProbuf.GameCD.newBuilder();
		builder.setKeyId(keyId);
		builder.setName(name);
		builder.setDescribe(describe);
		builder.setCdTime(cdTime);
		builder.setStartTime(startTime);
		builder.setIsSave(isSave);
		builder.setCdHandlerType(cdHandlerType);
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
		GamecdProbuf.GameCD pb;
		try {
			pb = GamecdProbuf.GameCD.parseFrom(in);
			builder = GamecdProbuf.GameCD.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setName(pb.getName());
			builder.setDescribe(pb.getDescribe());
			builder.setCdTime(pb.getCdTime());
			builder.setStartTime(pb.getStartTime());
			builder.setIsSave(pb.getIsSave());
			builder.setCdHandlerType(pb.getCdHandlerType());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}