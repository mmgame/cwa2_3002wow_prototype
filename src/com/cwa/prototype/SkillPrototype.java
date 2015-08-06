package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.SkillProbuf;
import com.cwa.util.prototype.JsonUtil;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class SkillPrototype implements IPrototype{
	private SkillProbuf.Skill.Builder builder;
	private List<List<Integer>> incidentalEffectListss;
    //------------------------------------------
    public SkillPrototype() {
		builder = SkillProbuf.Skill.newBuilder();
	}
	@SuppressWarnings("unchecked")
	@Override
	public void obtainAfter() {
	incidentalEffectListss = JsonUtil.string2ArrayObj(builder.getIncidentalEffectLists());
	}

	public List<List<Integer>> gotIncidentalEffectListsList(){
		return incidentalEffectListss;
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
 	
  	public String getDescribe() {
		return builder.getDescribe();
  	}	

  	public void setDescribe(String describe) {
		builder.setDescribe(describe);
 	}
 	
  	public int getShootingDistance() {
		return builder.getShootingDistance();
  	}	

  	public void setShootingDistance(int shootingDistance) {
		builder.setShootingDistance(shootingDistance);
 	}
 	
  	public int getReleaseType() {
		return builder.getReleaseType();
  	}	

  	public void setReleaseType(int releaseType) {
		builder.setReleaseType(releaseType);
 	}
 	
  	public int getReleaseRule() {
		return builder.getReleaseRule();
  	}	

  	public void setReleaseRule(int releaseRule) {
		builder.setReleaseRule(releaseRule);
 	}
 	
  	public int getCdTime() {
		return builder.getCdTime();
  	}	

  	public void setCdTime(int cdTime) {
		builder.setCdTime(cdTime);
 	}
 	
	public List<Integer> getMpList() {
		return builder.getMpListList();
	}

	public void setMpList(List<Integer> mpList) {
		builder.addAllMpList(mpList);
	}
  	public int getElements() {
		return builder.getElements();
  	}	

  	public void setElements(int elements) {
		builder.setElements(elements);
 	}
 	
  	public String getIncidentalEffectLists() {
		return builder.getIncidentalEffectLists();
  	}	

  	public void setIncidentalEffectLists(String incidentalEffectLists) {
		builder.setIncidentalEffectLists(incidentalEffectLists);
 	}
 	
  	public int getPlaySequence() {
		return builder.getPlaySequence();
  	}	

  	public void setPlaySequence(int playSequence) {
		builder.setPlaySequence(playSequence);
 	}
 	
  	public int getCommonAttack() {
		return builder.getCommonAttack();
  	}	

  	public void setCommonAttack(int commonAttack) {
		builder.setCommonAttack(commonAttack);
 	}
 	
  	public int getCount() {
		return builder.getCount();
  	}	

  	public void setCount(int count) {
		builder.setCount(count);
 	}
 	
  	public int getType() {
		return builder.getType();
  	}	

  	public void setType(int type) {
		builder.setType(type);
 	}
 	
  	public String getIcon() {
		return builder.getIcon();
  	}	

  	public void setIcon(String icon) {
		builder.setIcon(icon);
 	}
 	
  	public int getActionTime() {
		return builder.getActionTime();
  	}	

  	public void setActionTime(int actionTime) {
		builder.setActionTime(actionTime);
 	}
 	
 	public SkillPrototype(int keyId,String name,String describe,int shootingDistance,int releaseType,int releaseRule,int cdTime,List<Integer> mpList,int elements,String incidentalEffectLists,int playSequence,int commonAttack,int count,int type,String icon,int actionTime) {
		builder = SkillProbuf.Skill.newBuilder();
		builder.setKeyId(keyId);
		builder.setName(name);
		builder.setDescribe(describe);
		builder.setShootingDistance(shootingDistance);
		builder.setReleaseType(releaseType);
		builder.setReleaseRule(releaseRule);
		builder.setCdTime(cdTime);
		builder.addAllMpList(mpList); 
		builder.setElements(elements);
		builder.setIncidentalEffectLists(incidentalEffectLists);
		builder.setPlaySequence(playSequence);
		builder.setCommonAttack(commonAttack);
		builder.setCount(count);
		builder.setType(type);
		builder.setIcon(icon);
		builder.setActionTime(actionTime);
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
		SkillProbuf.Skill pb;
		try {
			pb = SkillProbuf.Skill.parseFrom(in);
			builder = SkillProbuf.Skill.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setName(pb.getName());
			builder.setDescribe(pb.getDescribe());
			builder.setShootingDistance(pb.getShootingDistance());
			builder.setReleaseType(pb.getReleaseType());
			builder.setReleaseRule(pb.getReleaseRule());
			builder.setCdTime(pb.getCdTime());
			builder.addAllMpList(pb.getMpListList()); 
			builder.setElements(pb.getElements());
			builder.setIncidentalEffectLists(pb.getIncidentalEffectLists());
			builder.setPlaySequence(pb.getPlaySequence());
			builder.setCommonAttack(pb.getCommonAttack());
			builder.setCount(pb.getCount());
			builder.setType(pb.getType());
			builder.setIcon(pb.getIcon());
			builder.setActionTime(pb.getActionTime());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}