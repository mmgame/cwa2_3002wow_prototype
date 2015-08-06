package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.SkillProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class BuffPrototype implements IPrototype{
	private SkillProbuf.Buff.Builder builder;
	private String buffTypeKeyId;
    //------------------------------------------
	public BuffPrototype() {
		builder = SkillProbuf.Buff.newBuilder();
	}
	@Override
	public void obtainAfter() {
		buffTypeKeyId = getType() + "_" + getBuffOrDebuff();
		for (Integer i : getEffectionTypeList()) {
			buffTypeKeyId += "_" + i;
		}
	}

	public String getBuffTypeKeyId() {
		return buffTypeKeyId;
	}
  	public int getKeyId() {
		return builder.getKeyId();
  	}	

  	public void setKeyId(int keyId) {
		builder.setKeyId(keyId);
 	}
 	
  	public int getType() {
		return builder.getType();
  	}	

  	public void setType(int type) {
		builder.setType(type);
 	}
 	
  	public int getBuffOrDebuff() {
		return builder.getBuffOrDebuff();
  	}	

  	public void setBuffOrDebuff(int buffOrDebuff) {
		builder.setBuffOrDebuff(buffOrDebuff);
 	}
 	
  	public int getRate() {
		return builder.getRate();
  	}	

  	public void setRate(int rate) {
		builder.setRate(rate);
 	}
 	
	public List<Integer> getEffectionTypeList() {
		return builder.getEffectionTypeListList();
	}

	public void setEffectionTypeList(List<Integer> effectionTypeList) {
		builder.addAllEffectionTypeList(effectionTypeList);
	}
	public List<Integer> getDamageAmountList() {
		return builder.getDamageAmountListList();
	}

	public void setDamageAmountList(List<Integer> damageAmountList) {
		builder.addAllDamageAmountList(damageAmountList);
	}
  	public int getValueType() {
		return builder.getValueType();
  	}	

  	public void setValueType(int valueType) {
		builder.setValueType(valueType);
 	}
 	
  	public int getEffectiveTime() {
		return builder.getEffectiveTime();
  	}	

  	public void setEffectiveTime(int effectiveTime) {
		builder.setEffectiveTime(effectiveTime);
 	}
 	
  	public int getIntervalTime() {
		return builder.getIntervalTime();
  	}	

  	public void setIntervalTime(int intervalTime) {
		builder.setIntervalTime(intervalTime);
 	}
 	
  	public int getPriority() {
		return builder.getPriority();
  	}	

  	public void setPriority(int priority) {
		builder.setPriority(priority);
 	}
 	
  	public int getDisperse() {
		return builder.getDisperse();
  	}	

  	public void setDisperse(int disperse) {
		builder.setDisperse(disperse);
 	}
 	
  	public int getFrameNum() {
		return builder.getFrameNum();
  	}	

  	public void setFrameNum(int frameNum) {
		builder.setFrameNum(frameNum);
 	}
 	
  	public int getBuffPosition() {
		return builder.getBuffPosition();
  	}	

  	public void setBuffPosition(int buffPosition) {
		builder.setBuffPosition(buffPosition);
 	}
 	
  	public int getPlayType() {
		return builder.getPlayType();
  	}	

  	public void setPlayType(int playType) {
		builder.setPlayType(playType);
 	}
 	
  	public String getIcon() {
		return builder.getIcon();
  	}	

  	public void setIcon(String icon) {
		builder.setIcon(icon);
 	}
 	
  	public String getVisualEffects() {
		return builder.getVisualEffects();
  	}	

  	public void setVisualEffects(String visualEffects) {
		builder.setVisualEffects(visualEffects);
 	}
 	
 	public BuffPrototype(int keyId,int type,int buffOrDebuff,int rate,List<Integer> effectionTypeList,List<Integer> damageAmountList,int valueType,int effectiveTime,int intervalTime,int priority,int disperse,int frameNum,int buffPosition,int playType,String icon,String visualEffects) {
		builder = SkillProbuf.Buff.newBuilder();
		builder.setKeyId(keyId);
		builder.setType(type);
		builder.setBuffOrDebuff(buffOrDebuff);
		builder.setRate(rate);
		builder.addAllEffectionTypeList(effectionTypeList); 
		builder.addAllDamageAmountList(damageAmountList); 
		builder.setValueType(valueType);
		builder.setEffectiveTime(effectiveTime);
		builder.setIntervalTime(intervalTime);
		builder.setPriority(priority);
		builder.setDisperse(disperse);
		builder.setFrameNum(frameNum);
		builder.setBuffPosition(buffPosition);
		builder.setPlayType(playType);
		builder.setIcon(icon);
		builder.setVisualEffects(visualEffects);
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
		SkillProbuf.Buff pb;
		try {
			pb = SkillProbuf.Buff.parseFrom(in);
			builder = SkillProbuf.Buff.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setType(pb.getType());
			builder.setBuffOrDebuff(pb.getBuffOrDebuff());
			builder.setRate(pb.getRate());
			builder.addAllEffectionTypeList(pb.getEffectionTypeListList()); 
			builder.addAllDamageAmountList(pb.getDamageAmountListList()); 
			builder.setValueType(pb.getValueType());
			builder.setEffectiveTime(pb.getEffectiveTime());
			builder.setIntervalTime(pb.getIntervalTime());
			builder.setPriority(pb.getPriority());
			builder.setDisperse(pb.getDisperse());
			builder.setFrameNum(pb.getFrameNum());
			builder.setBuffPosition(pb.getBuffPosition());
			builder.setPlayType(pb.getPlayType());
			builder.setIcon(pb.getIcon());
			builder.setVisualEffects(pb.getVisualEffects());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}