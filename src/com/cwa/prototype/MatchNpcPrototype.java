package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.MatchProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class MatchNpcPrototype implements IPrototype{
	private MatchProbuf.MatchNpc.Builder builder;
    //------------------------------------------
    public MatchNpcPrototype() {
		builder = MatchProbuf.MatchNpc.newBuilder();
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
 	
  	public int getQuality() {
		return builder.getQuality();
  	}	

  	public void setQuality(int quality) {
		builder.setQuality(quality);
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
  	public int getBasicAdvance() {
		return builder.getBasicAdvance();
  	}	

  	public void setBasicAdvance(int basicAdvance) {
		builder.setBasicAdvance(basicAdvance);
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
  	public int getHeroSize() {
		return builder.getHeroSize();
  	}	

  	public void setHeroSize(int heroSize) {
		builder.setHeroSize(heroSize);
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
 	public MatchNpcPrototype(int keyId,String heroName,int quality,int heroClass,List<Integer> basicAttributeList,int basicAdvance,List<Integer> resistanceList,List<Integer> commonAttackList,List<Integer> elementMasterList,List<Integer> raceRestrainList,List<Integer> debuffPatienceList,int heroSize,String resource,List<Integer> effectTimeList,List<Integer> actionTimeList) {
		builder = MatchProbuf.MatchNpc.newBuilder();
		builder.setKeyId(keyId);
		builder.setHeroName(heroName);
		builder.setQuality(quality);
		builder.setHeroClass(heroClass);
		builder.addAllBasicAttributeList(basicAttributeList); 
		builder.setBasicAdvance(basicAdvance);
		builder.addAllResistanceList(resistanceList); 
		builder.addAllCommonAttackList(commonAttackList); 
		builder.addAllElementMasterList(elementMasterList); 
		builder.addAllRaceRestrainList(raceRestrainList); 
		builder.addAllDebuffPatienceList(debuffPatienceList); 
		builder.setHeroSize(heroSize);
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
		MatchProbuf.MatchNpc pb;
		try {
			pb = MatchProbuf.MatchNpc.parseFrom(in);
			builder = MatchProbuf.MatchNpc.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setHeroName(pb.getHeroName());
			builder.setQuality(pb.getQuality());
			builder.setHeroClass(pb.getHeroClass());
			builder.addAllBasicAttributeList(pb.getBasicAttributeListList()); 
			builder.setBasicAdvance(pb.getBasicAdvance());
			builder.addAllResistanceList(pb.getResistanceListList()); 
			builder.addAllCommonAttackList(pb.getCommonAttackListList()); 
			builder.addAllElementMasterList(pb.getElementMasterListList()); 
			builder.addAllRaceRestrainList(pb.getRaceRestrainListList()); 
			builder.addAllDebuffPatienceList(pb.getDebuffPatienceListList()); 
			builder.setHeroSize(pb.getHeroSize());
			builder.setResource(pb.getResource());
			builder.addAllEffectTimeList(pb.getEffectTimeListList()); 
			builder.addAllActionTimeList(pb.getActionTimeListList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}