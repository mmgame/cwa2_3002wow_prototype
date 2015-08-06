package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.HeroProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class HeroGradePrototype implements IPrototype{
	private HeroProbuf.HeroGrade.Builder builder;
    //------------------------------------------
    public HeroGradePrototype() {
		builder = HeroProbuf.HeroGrade.newBuilder();
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
 	
  	public int getQuality() {
		return builder.getQuality();
  	}	

  	public void setQuality(int quality) {
		builder.setQuality(quality);
 	}
 	
  	public int getStartLevel() {
		return builder.getStartLevel();
  	}	

  	public void setStartLevel(int startLevel) {
		builder.setStartLevel(startLevel);
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
  	public int getNextLevel() {
		return builder.getNextLevel();
  	}	

  	public void setNextLevel(int nextLevel) {
		builder.setNextLevel(nextLevel);
 	}
 	
	public List<Integer> getNeedItemList() {
		return builder.getNeedItemListList();
	}

	public void setNeedItemList(List<Integer> needItemList) {
		builder.addAllNeedItemList(needItemList);
	}
	public List<Integer> getNeedCountList() {
		return builder.getNeedCountListList();
	}

	public void setNeedCountList(List<Integer> needCountList) {
		builder.addAllNeedCountList(needCountList);
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
  	public int getNeedLevel() {
		return builder.getNeedLevel();
  	}	

  	public void setNeedLevel(int needLevel) {
		builder.setNeedLevel(needLevel);
 	}
 	
  	public int getPatiencesMax() {
		return builder.getPatiencesMax();
  	}	

  	public void setPatiencesMax(int patiencesMax) {
		builder.setPatiencesMax(patiencesMax);
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
 	
 	public HeroGradePrototype(int keyId,int quality,int startLevel,List<Integer> basicAttributeList,List<Integer> attributesGrowthList,List<Integer> resistanceList,List<Integer> commonAttackList,List<Integer> initAssiveSkillList,int nextLevel,List<Integer> needItemList,List<Integer> needCountList,List<Integer> elementMasterList,List<Integer> raceRestrainList,List<Integer> debuffPatienceList,int needLevel,int patiencesMax,int requireMoneyId,int requireMoneyCount) {
		builder = HeroProbuf.HeroGrade.newBuilder();
		builder.setKeyId(keyId);
		builder.setQuality(quality);
		builder.setStartLevel(startLevel);
		builder.addAllBasicAttributeList(basicAttributeList); 
		builder.addAllAttributesGrowthList(attributesGrowthList); 
		builder.addAllResistanceList(resistanceList); 
		builder.addAllCommonAttackList(commonAttackList); 
		builder.addAllInitAssiveSkillList(initAssiveSkillList); 
		builder.setNextLevel(nextLevel);
		builder.addAllNeedItemList(needItemList); 
		builder.addAllNeedCountList(needCountList); 
		builder.addAllElementMasterList(elementMasterList); 
		builder.addAllRaceRestrainList(raceRestrainList); 
		builder.addAllDebuffPatienceList(debuffPatienceList); 
		builder.setNeedLevel(needLevel);
		builder.setPatiencesMax(patiencesMax);
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
		HeroProbuf.HeroGrade pb;
		try {
			pb = HeroProbuf.HeroGrade.parseFrom(in);
			builder = HeroProbuf.HeroGrade.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setQuality(pb.getQuality());
			builder.setStartLevel(pb.getStartLevel());
			builder.addAllBasicAttributeList(pb.getBasicAttributeListList()); 
			builder.addAllAttributesGrowthList(pb.getAttributesGrowthListList()); 
			builder.addAllResistanceList(pb.getResistanceListList()); 
			builder.addAllCommonAttackList(pb.getCommonAttackListList()); 
			builder.addAllInitAssiveSkillList(pb.getInitAssiveSkillListList()); 
			builder.setNextLevel(pb.getNextLevel());
			builder.addAllNeedItemList(pb.getNeedItemListList()); 
			builder.addAllNeedCountList(pb.getNeedCountListList()); 
			builder.addAllElementMasterList(pb.getElementMasterListList()); 
			builder.addAllRaceRestrainList(pb.getRaceRestrainListList()); 
			builder.addAllDebuffPatienceList(pb.getDebuffPatienceListList()); 
			builder.setNeedLevel(pb.getNeedLevel());
			builder.setPatiencesMax(pb.getPatiencesMax());
			builder.setRequireMoneyId(pb.getRequireMoneyId());
			builder.setRequireMoneyCount(pb.getRequireMoneyCount());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}