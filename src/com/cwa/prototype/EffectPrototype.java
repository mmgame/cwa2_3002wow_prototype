package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.SkillProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class EffectPrototype implements IPrototype{
	private SkillProbuf.Effect.Builder builder;
    //------------------------------------------
    public EffectPrototype() {
		builder = SkillProbuf.Effect.newBuilder();
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
 	
  	public int getElement() {
		return builder.getElement();
  	}	

  	public void setElement(int element) {
		builder.setElement(element);
 	}
 	
  	public int getType() {
		return builder.getType();
  	}	

  	public void setType(int type) {
		builder.setType(type);
 	}
 	
  	public int getTargetRule() {
		return builder.getTargetRule();
  	}	

  	public void setTargetRule(int targetRule) {
		builder.setTargetRule(targetRule);
 	}
 	
  	public int getRange() {
		return builder.getRange();
  	}	

  	public void setRange(int range) {
		builder.setRange(range);
 	}
 	
  	public int getFlySpeed() {
		return builder.getFlySpeed();
  	}	

  	public void setFlySpeed(int flySpeed) {
		builder.setFlySpeed(flySpeed);
 	}
 	
	public List<Integer> getRateList() {
		return builder.getRateListList();
	}

	public void setRateList(List<Integer> rateList) {
		builder.addAllRateList(rateList);
	}
	public List<Integer> getIncidentalParamList() {
		return builder.getIncidentalParamListList();
	}

	public void setIncidentalParamList(List<Integer> incidentalParamList) {
		builder.addAllIncidentalParamList(incidentalParamList);
	}
	public List<Integer> getSummonHeroList() {
		return builder.getSummonHeroListList();
	}

	public void setSummonHeroList(List<Integer> summonHeroList) {
		builder.addAllSummonHeroList(summonHeroList);
	}
	public List<Integer> getSummonProbabilityList() {
		return builder.getSummonProbabilityListList();
	}

	public void setSummonProbabilityList(List<Integer> summonProbabilityList) {
		builder.addAllSummonProbabilityList(summonProbabilityList);
	}
	public List<Integer> getFrameNum() {
		return builder.getFrameNumList();
	}

	public void setFrameNum(List<Integer> frameNum) {
		builder.addAllFrameNum(frameNum);
	}
	public List<Integer> getEffectPosition() {
		return builder.getEffectPositionList();
	}

	public void setEffectPosition(List<Integer> effectPosition) {
		builder.addAllEffectPosition(effectPosition);
	}
	public List<String> getVisualEffects() {
		return builder.getVisualEffectsList();
	}

	public void setVisualEffects(List<String> visualEffects) {
		builder.addAllVisualEffects(visualEffects);
	}
 	public EffectPrototype(int keyId,String name,int element,int type,int targetRule,int range,int flySpeed,List<Integer> rateList,List<Integer> incidentalParamList,List<Integer> summonHeroList,List<Integer> summonProbabilityList,List<Integer> frameNum,List<Integer> effectPosition,List<String> visualEffects) {
		builder = SkillProbuf.Effect.newBuilder();
		builder.setKeyId(keyId);
		builder.setName(name);
		builder.setElement(element);
		builder.setType(type);
		builder.setTargetRule(targetRule);
		builder.setRange(range);
		builder.setFlySpeed(flySpeed);
		builder.addAllRateList(rateList); 
		builder.addAllIncidentalParamList(incidentalParamList); 
		builder.addAllSummonHeroList(summonHeroList); 
		builder.addAllSummonProbabilityList(summonProbabilityList); 
		builder.addAllFrameNum(frameNum); 
		builder.addAllEffectPosition(effectPosition); 
		builder.addAllVisualEffects(visualEffects); 
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
		SkillProbuf.Effect pb;
		try {
			pb = SkillProbuf.Effect.parseFrom(in);
			builder = SkillProbuf.Effect.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setName(pb.getName());
			builder.setElement(pb.getElement());
			builder.setType(pb.getType());
			builder.setTargetRule(pb.getTargetRule());
			builder.setRange(pb.getRange());
			builder.setFlySpeed(pb.getFlySpeed());
			builder.addAllRateList(pb.getRateListList()); 
			builder.addAllIncidentalParamList(pb.getIncidentalParamListList()); 
			builder.addAllSummonHeroList(pb.getSummonHeroListList()); 
			builder.addAllSummonProbabilityList(pb.getSummonProbabilityListList()); 
			builder.addAllFrameNum(pb.getFrameNumList()); 
			builder.addAllEffectPosition(pb.getEffectPositionList()); 
			builder.addAllVisualEffects(pb.getVisualEffectsList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}