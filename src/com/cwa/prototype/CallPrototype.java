package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.HeroProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class CallPrototype implements IPrototype{
	private HeroProbuf.Call.Builder builder;
    //------------------------------------------
    public CallPrototype() {
		builder = HeroProbuf.Call.newBuilder();
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
 	
  	public String getHeroName() {
		return builder.getHeroName();
  	}	

  	public void setHeroName(String heroName) {
		builder.setHeroName(heroName);
 	}
 	
  	public int getHeroClass() {
		return builder.getHeroClass();
  	}	

  	public void setHeroClass(int heroClass) {
		builder.setHeroClass(heroClass);
 	}
 	
	public List<Integer> getBasicAttributeList() {
		return builder.getBasicAttributeListList();
	}

	public void setBasicAttributeList(List<Integer> basicAttributeList) {
		builder.addAllBasicAttributeList(basicAttributeList);
	}
	public List<Integer> getAttributesGrowthList() {
		return builder.getAttributesGrowthListList();
	}

	public void setAttributesGrowthList(List<Integer> attributesGrowthList) {
		builder.addAllAttributesGrowthList(attributesGrowthList);
	}
	public List<Integer> getResistanceList() {
		return builder.getResistanceListList();
	}

	public void setResistanceList(List<Integer> resistanceList) {
		builder.addAllResistanceList(resistanceList);
	}
	public List<Integer> getCommonAttackList() {
		return builder.getCommonAttackListList();
	}

	public void setCommonAttackList(List<Integer> commonAttackList) {
		builder.addAllCommonAttackList(commonAttackList);
	}
	public List<Integer> getInitAssiveSkillList() {
		return builder.getInitAssiveSkillListList();
	}

	public void setInitAssiveSkillList(List<Integer> initAssiveSkillList) {
		builder.addAllInitAssiveSkillList(initAssiveSkillList);
	}
  	public int getHeroSize() {
		return builder.getHeroSize();
  	}	

  	public void setHeroSize(int heroSize) {
		builder.setHeroSize(heroSize);
 	}
 	
	public List<Integer> getElementMasterList() {
		return builder.getElementMasterListList();
	}

	public void setElementMasterList(List<Integer> elementMasterList) {
		builder.addAllElementMasterList(elementMasterList);
	}
	public List<Integer> getRaceRestrainList() {
		return builder.getRaceRestrainListList();
	}

	public void setRaceRestrainList(List<Integer> raceRestrainList) {
		builder.addAllRaceRestrainList(raceRestrainList);
	}
	public List<Integer> getDebuffPatienceList() {
		return builder.getDebuffPatienceListList();
	}

	public void setDebuffPatienceList(List<Integer> debuffPatienceList) {
		builder.addAllDebuffPatienceList(debuffPatienceList);
	}
  	public String getResource() {
		return builder.getResource();
  	}	

  	public void setResource(String resource) {
		builder.setResource(resource);
 	}
 	
	public List<Integer> getEffectTimeList() {
		return builder.getEffectTimeListList();
	}

	public void setEffectTimeList(List<Integer> effectTimeList) {
		builder.addAllEffectTimeList(effectTimeList);
	}
	public List<Integer> getActionTimeList() {
		return builder.getActionTimeListList();
	}

	public void setActionTimeList(List<Integer> actionTimeList) {
		builder.addAllActionTimeList(actionTimeList);
	}
 	public CallPrototype(int keyId,String heroName,int heroClass,List<Integer> basicAttributeList,List<Integer> attributesGrowthList,List<Integer> resistanceList,List<Integer> commonAttackList,List<Integer> initAssiveSkillList,int heroSize,List<Integer> elementMasterList,List<Integer> raceRestrainList,List<Integer> debuffPatienceList,String resource,List<Integer> effectTimeList,List<Integer> actionTimeList) {
		builder = HeroProbuf.Call.newBuilder();
		builder.setKeyId(keyId);
		builder.setHeroName(heroName);
		builder.setHeroClass(heroClass);
		builder.addAllBasicAttributeList(basicAttributeList); 
		builder.addAllAttributesGrowthList(attributesGrowthList); 
		builder.addAllResistanceList(resistanceList); 
		builder.addAllCommonAttackList(commonAttackList); 
		builder.addAllInitAssiveSkillList(initAssiveSkillList); 
		builder.setHeroSize(heroSize);
		builder.addAllElementMasterList(elementMasterList); 
		builder.addAllRaceRestrainList(raceRestrainList); 
		builder.addAllDebuffPatienceList(debuffPatienceList); 
		builder.setResource(resource);
		builder.addAllEffectTimeList(effectTimeList); 
		builder.addAllActionTimeList(actionTimeList); 
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
		HeroProbuf.Call pb;
		try {
			pb = HeroProbuf.Call.parseFrom(in);
			builder = HeroProbuf.Call.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setHeroName(pb.getHeroName());
			builder.setHeroClass(pb.getHeroClass());
			builder.addAllBasicAttributeList(pb.getBasicAttributeListList()); 
			builder.addAllAttributesGrowthList(pb.getAttributesGrowthListList()); 
			builder.addAllResistanceList(pb.getResistanceListList()); 
			builder.addAllCommonAttackList(pb.getCommonAttackListList()); 
			builder.addAllInitAssiveSkillList(pb.getInitAssiveSkillListList()); 
			builder.setHeroSize(pb.getHeroSize());
			builder.addAllElementMasterList(pb.getElementMasterListList()); 
			builder.addAllRaceRestrainList(pb.getRaceRestrainListList()); 
			builder.addAllDebuffPatienceList(pb.getDebuffPatienceListList()); 
			builder.setResource(pb.getResource());
			builder.addAllEffectTimeList(pb.getEffectTimeListList()); 
			builder.addAllActionTimeList(pb.getActionTimeListList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}