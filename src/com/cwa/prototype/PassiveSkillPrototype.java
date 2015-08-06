package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.SkillProbuf;
import com.cwa.util.prototype.JsonUtil;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class PassiveSkillPrototype implements IPrototype{
	private SkillProbuf.PassiveSkill.Builder builder;
	private List<List<Integer>> effectionTypeListss;
	private List<List<Integer>> damageAmountListss;
    //------------------------------------------
    public PassiveSkillPrototype() {
		builder = SkillProbuf.PassiveSkill.newBuilder();
	}
	@SuppressWarnings("unchecked")
	@Override
	public void obtainAfter() {
	effectionTypeListss = JsonUtil.string2ArrayObj(builder.getEffectionTypeLists());
	damageAmountListss = JsonUtil.string2ArrayObj(builder.getDamageAmountLists());
	}

	public List<List<Integer>> gotEffectionTypeListsList(){
		return effectionTypeListss;
	}
	public List<List<Integer>> gotDamageAmountListsList(){
		return damageAmountListss;
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
 	
  	public String getEffectionTypeLists() {
		return builder.getEffectionTypeLists();
  	}	

  	public void setEffectionTypeLists(String effectionTypeLists) {
		builder.setEffectionTypeLists(effectionTypeLists);
 	}
 	
  	public String getDamageAmountLists() {
		return builder.getDamageAmountLists();
  	}	

  	public void setDamageAmountLists(String damageAmountLists) {
		builder.setDamageAmountLists(damageAmountLists);
 	}
 	
  	public int getValueType() {
		return builder.getValueType();
  	}	

  	public void setValueType(int valueType) {
		builder.setValueType(valueType);
 	}
 	
  	public String getIcon() {
		return builder.getIcon();
  	}	

  	public void setIcon(String icon) {
		builder.setIcon(icon);
 	}
 	
 	public PassiveSkillPrototype(int keyId,String name,String desc,int type,int buffOrDebuff,String effectionTypeLists,String damageAmountLists,int valueType,String icon) {
		builder = SkillProbuf.PassiveSkill.newBuilder();
		builder.setKeyId(keyId);
		builder.setName(name);
		builder.setDesc(desc);
		builder.setType(type);
		builder.setBuffOrDebuff(buffOrDebuff);
		builder.setEffectionTypeLists(effectionTypeLists);
		builder.setDamageAmountLists(damageAmountLists);
		builder.setValueType(valueType);
		builder.setIcon(icon);
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
		SkillProbuf.PassiveSkill pb;
		try {
			pb = SkillProbuf.PassiveSkill.parseFrom(in);
			builder = SkillProbuf.PassiveSkill.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setName(pb.getName());
			builder.setDesc(pb.getDesc());
			builder.setType(pb.getType());
			builder.setBuffOrDebuff(pb.getBuffOrDebuff());
			builder.setEffectionTypeLists(pb.getEffectionTypeLists());
			builder.setDamageAmountLists(pb.getDamageAmountLists());
			builder.setValueType(pb.getValueType());
			builder.setIcon(pb.getIcon());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}