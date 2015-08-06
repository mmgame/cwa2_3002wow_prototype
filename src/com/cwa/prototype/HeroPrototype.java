package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.HeroProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class HeroPrototype implements IPrototype{
	private HeroProbuf.Hero.Builder builder;
    //------------------------------------------
    public HeroPrototype() {
		builder = HeroProbuf.Hero.newBuilder();
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
 	
  	public int getType() {
		return builder.getType();
  	}	

  	public void setType(int type) {
		builder.setType(type);
 	}
 	
  	public String getGrade() {
		return builder.getGrade();
  	}	

  	public void setGrade(String grade) {
		builder.setGrade(grade);
 	}
 	
  	public int getHeroSize() {
		return builder.getHeroSize();
  	}	

  	public void setHeroSize(int heroSize) {
		builder.setHeroSize(heroSize);
 	}
 	
  	public int getRequireItem() {
		return builder.getRequireItem();
  	}	

  	public void setRequireItem(int requireItem) {
		builder.setRequireItem(requireItem);
 	}
 	
  	public int getItemCount() {
		return builder.getItemCount();
  	}	

  	public void setItemCount(int itemCount) {
		builder.setItemCount(itemCount);
 	}
 	
	public List<Integer> getEquipmentList() {
		return builder.getEquipmentListList();
	}

	public void setEquipmentList(List<Integer> equipmentList) {
		builder.addAllEquipmentList(equipmentList);
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
  	public int getHeroScale() {
		return builder.getHeroScale();
  	}	

  	public void setHeroScale(int heroScale) {
		builder.setHeroScale(heroScale);
 	}
 	
 	public HeroPrototype(int keyId,String heroName,int heroClass,int type,String grade,int heroSize,int requireItem,int itemCount,List<Integer> equipmentList,String resource,List<Integer> effectTimeList,List<Integer> actionTimeList,int heroScale) {
		builder = HeroProbuf.Hero.newBuilder();
		builder.setKeyId(keyId);
		builder.setHeroName(heroName);
		builder.setHeroClass(heroClass);
		builder.setType(type);
		builder.setGrade(grade);
		builder.setHeroSize(heroSize);
		builder.setRequireItem(requireItem);
		builder.setItemCount(itemCount);
		builder.addAllEquipmentList(equipmentList); 
		builder.setResource(resource);
		builder.addAllEffectTimeList(effectTimeList); 
		builder.addAllActionTimeList(actionTimeList); 
		builder.setHeroScale(heroScale);
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
		HeroProbuf.Hero pb;
		try {
			pb = HeroProbuf.Hero.parseFrom(in);
			builder = HeroProbuf.Hero.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setHeroName(pb.getHeroName());
			builder.setHeroClass(pb.getHeroClass());
			builder.setType(pb.getType());
			builder.setGrade(pb.getGrade());
			builder.setHeroSize(pb.getHeroSize());
			builder.setRequireItem(pb.getRequireItem());
			builder.setItemCount(pb.getItemCount());
			builder.addAllEquipmentList(pb.getEquipmentListList()); 
			builder.setResource(pb.getResource());
			builder.addAllEffectTimeList(pb.getEffectTimeListList()); 
			builder.addAllActionTimeList(pb.getActionTimeListList()); 
			builder.setHeroScale(pb.getHeroScale());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}