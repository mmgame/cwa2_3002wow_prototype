package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.HeroProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class HeroTrainPrototype implements IPrototype{
	private HeroProbuf.HeroTrain.Builder builder;
    //------------------------------------------
    public HeroTrainPrototype() {
		builder = HeroProbuf.HeroTrain.newBuilder();
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
 	
  	public int getMoneyType() {
		return builder.getMoneyType();
  	}	

  	public void setMoneyType(int moneyType) {
		builder.setMoneyType(moneyType);
 	}
 	
  	public int getMoneyCount() {
		return builder.getMoneyCount();
  	}	

  	public void setMoneyCount(int moneyCount) {
		builder.setMoneyCount(moneyCount);
 	}
 	
  	public int getScale() {
		return builder.getScale();
  	}	

  	public void setScale(int scale) {
		builder.setScale(scale);
 	}
 	
  	public int getMaxraise() {
		return builder.getMaxraise();
  	}	

  	public void setMaxraise(int maxraise) {
		builder.setMaxraise(maxraise);
 	}
 	
  	public int getMaxreduce() {
		return builder.getMaxreduce();
  	}	

  	public void setMaxreduce(int maxreduce) {
		builder.setMaxreduce(maxreduce);
 	}
 	
  	public int getRandom() {
		return builder.getRandom();
  	}	

  	public void setRandom(int random) {
		builder.setRandom(random);
 	}
 	
 	public HeroTrainPrototype(int keyId,String name,String desc,int moneyType,int moneyCount,int scale,int maxraise,int maxreduce,int random) {
		builder = HeroProbuf.HeroTrain.newBuilder();
		builder.setKeyId(keyId);
		builder.setName(name);
		builder.setDesc(desc);
		builder.setMoneyType(moneyType);
		builder.setMoneyCount(moneyCount);
		builder.setScale(scale);
		builder.setMaxraise(maxraise);
		builder.setMaxreduce(maxreduce);
		builder.setRandom(random);
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
		HeroProbuf.HeroTrain pb;
		try {
			pb = HeroProbuf.HeroTrain.parseFrom(in);
			builder = HeroProbuf.HeroTrain.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setName(pb.getName());
			builder.setDesc(pb.getDesc());
			builder.setMoneyType(pb.getMoneyType());
			builder.setMoneyCount(pb.getMoneyCount());
			builder.setScale(pb.getScale());
			builder.setMaxraise(pb.getMaxraise());
			builder.setMaxreduce(pb.getMaxreduce());
			builder.setRandom(pb.getRandom());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}