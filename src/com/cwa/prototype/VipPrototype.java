package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.VipProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class VipPrototype implements IPrototype{
	private VipProbuf.Vip.Builder builder;
    //------------------------------------------
    public VipPrototype() {
		builder = VipProbuf.Vip.newBuilder();
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
 	
  	public String getDesc() {
		return builder.getDesc();
  	}	

  	public void setDesc(String desc) {
		builder.setDesc(desc);
 	}
 	
  	public int getRequireMoneyId() {
		return builder.getRequireMoneyId();
  	}	

  	public void setRequireMoneyId(int requireMoneyId) {
		builder.setRequireMoneyId(requireMoneyId);
 	}
 	
  	public int getRequireMoneyCount() {
		return builder.getRequireMoneyCount();
  	}	

  	public void setRequireMoneyCount(int requireMoneyCount) {
		builder.setRequireMoneyCount(requireMoneyCount);
 	}
 	
 	public VipPrototype(int keyId,String name,String desc,int requireMoneyId,int requireMoneyCount) {
		builder = VipProbuf.Vip.newBuilder();
		builder.setKeyId(keyId);
		builder.setName(name);
		builder.setDesc(desc);
		builder.setRequireMoneyId(requireMoneyId);
		builder.setRequireMoneyCount(requireMoneyCount);
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
		VipProbuf.Vip pb;
		try {
			pb = VipProbuf.Vip.parseFrom(in);
			builder = VipProbuf.Vip.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setName(pb.getName());
			builder.setDesc(pb.getDesc());
			builder.setRequireMoneyId(pb.getRequireMoneyId());
			builder.setRequireMoneyCount(pb.getRequireMoneyCount());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}