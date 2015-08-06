package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.VipProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class VipgiftPrototype implements IPrototype{
	private VipProbuf.Vipgift.Builder builder;
    //------------------------------------------
    public VipgiftPrototype() {
		builder = VipProbuf.Vipgift.newBuilder();
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
 	
	public List<Integer> getAwardList() {
		return builder.getAwardListList();
	}

	public void setAwardList(List<Integer> awardList) {
		builder.addAllAwardList(awardList);
	}
	public List<Integer> getAwardCountList() {
		return builder.getAwardCountListList();
	}

	public void setAwardCountList(List<Integer> awardCountList) {
		builder.addAllAwardCountList(awardCountList);
	}
  	public int getFrameId() {
		return builder.getFrameId();
  	}	

  	public void setFrameId(int frameId) {
		builder.setFrameId(frameId);
 	}
 	
  	public String getDesc() {
		return builder.getDesc();
  	}	

  	public void setDesc(String desc) {
		builder.setDesc(desc);
 	}
 	
 	public VipgiftPrototype(int keyId,List<Integer> awardList,List<Integer> awardCountList,int frameId,String desc) {
		builder = VipProbuf.Vipgift.newBuilder();
		builder.setKeyId(keyId);
		builder.addAllAwardList(awardList); 
		builder.addAllAwardCountList(awardCountList); 
		builder.setFrameId(frameId);
		builder.setDesc(desc);
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
		VipProbuf.Vipgift pb;
		try {
			pb = VipProbuf.Vipgift.parseFrom(in);
			builder = VipProbuf.Vipgift.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.addAllAwardList(pb.getAwardListList()); 
			builder.addAllAwardCountList(pb.getAwardCountListList()); 
			builder.setFrameId(pb.getFrameId());
			builder.setDesc(pb.getDesc());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}