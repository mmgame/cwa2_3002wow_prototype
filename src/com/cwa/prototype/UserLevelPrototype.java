package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.UserProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class UserLevelPrototype implements IPrototype{
	private UserProbuf.UserLevel.Builder builder;
    //------------------------------------------
    public UserLevelPrototype() {
		builder = UserProbuf.UserLevel.newBuilder();
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
 	
  	public int getExperience() {
		return builder.getExperience();
  	}	

  	public void setExperience(int experience) {
		builder.setExperience(experience);
 	}
 	
  	public int getExperienceCount() {
		return builder.getExperienceCount();
  	}	

  	public void setExperienceCount(int experienceCount) {
		builder.setExperienceCount(experienceCount);
 	}
 	
  	public int getPowerMax() {
		return builder.getPowerMax();
  	}	

  	public void setPowerMax(int powerMax) {
		builder.setPowerMax(powerMax);
 	}
 	
 	public UserLevelPrototype(int keyId,int experience,int experienceCount,int powerMax) {
		builder = UserProbuf.UserLevel.newBuilder();
		builder.setKeyId(keyId);
		builder.setExperience(experience);
		builder.setExperienceCount(experienceCount);
		builder.setPowerMax(powerMax);
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
		UserProbuf.UserLevel pb;
		try {
			pb = UserProbuf.UserLevel.parseFrom(in);
			builder = UserProbuf.UserLevel.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setExperience(pb.getExperience());
			builder.setExperienceCount(pb.getExperienceCount());
			builder.setPowerMax(pb.getPowerMax());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}