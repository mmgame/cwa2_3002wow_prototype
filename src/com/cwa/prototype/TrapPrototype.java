package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.SkillProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class TrapPrototype implements IPrototype{
	private SkillProbuf.Trap.Builder builder;
    //------------------------------------------
    public TrapPrototype() {
		builder = SkillProbuf.Trap.newBuilder();
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
 	
	public List<Integer> getIncidentalBuffList() {
		return builder.getIncidentalBuffListList();
	}

	public void setIncidentalBuffList(List<Integer> incidentalBuffList) {
		builder.addAllIncidentalBuffList(incidentalBuffList);
	}
 	public TrapPrototype(int keyId,int type,int buffOrDebuff,List<Integer> damageAmountList,int valueType,int effectiveTime,int intervalTime,List<Integer> incidentalBuffList) {
		builder = SkillProbuf.Trap.newBuilder();
		builder.setKeyId(keyId);
		builder.setType(type);
		builder.setBuffOrDebuff(buffOrDebuff);
		builder.addAllDamageAmountList(damageAmountList); 
		builder.setValueType(valueType);
		builder.setEffectiveTime(effectiveTime);
		builder.setIntervalTime(intervalTime);
		builder.addAllIncidentalBuffList(incidentalBuffList); 
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
		SkillProbuf.Trap pb;
		try {
			pb = SkillProbuf.Trap.parseFrom(in);
			builder = SkillProbuf.Trap.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setType(pb.getType());
			builder.setBuffOrDebuff(pb.getBuffOrDebuff());
			builder.addAllDamageAmountList(pb.getDamageAmountListList()); 
			builder.setValueType(pb.getValueType());
			builder.setEffectiveTime(pb.getEffectiveTime());
			builder.setIntervalTime(pb.getIntervalTime());
			builder.addAllIncidentalBuffList(pb.getIncidentalBuffListList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}