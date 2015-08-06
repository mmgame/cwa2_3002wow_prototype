package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.EquipmentProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class EquipmentGradePrototype implements IPrototype{
	private EquipmentProbuf.EquipmentGrade.Builder builder;
    //------------------------------------------
    public EquipmentGradePrototype() {
		builder = EquipmentProbuf.EquipmentGrade.newBuilder();
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
 	
  	public int getLevelMax() {
		return builder.getLevelMax();
  	}	

  	public void setLevelMax(int levelMax) {
		builder.setLevelMax(levelMax);
 	}
 	
	public List<Integer> getAttributeIdList() {
		return builder.getAttributeIdListList();
	}

	public void setAttributeIdList(List<Integer> attributeIdList) {
		builder.addAllAttributeIdList(attributeIdList);
	}
	public List<Integer> getCoefficientList() {
		return builder.getCoefficientListList();
	}

	public void setCoefficientList(List<Integer> coefficientList) {
		builder.addAllCoefficientList(coefficientList);
	}
	public List<Integer> getRequireItemList() {
		return builder.getRequireItemListList();
	}

	public void setRequireItemList(List<Integer> requireItemList) {
		builder.addAllRequireItemList(requireItemList);
	}
	public List<Integer> getRequireCountList() {
		return builder.getRequireCountListList();
	}

	public void setRequireCountList(List<Integer> requireCountList) {
		builder.addAllRequireCountList(requireCountList);
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
 	
  	public int getNextLevel() {
		return builder.getNextLevel();
  	}	

  	public void setNextLevel(int nextLevel) {
		builder.setNextLevel(nextLevel);
 	}
 	
 	public EquipmentGradePrototype(int keyId,int quality,int levelMax,List<Integer> attributeIdList,List<Integer> coefficientList,List<Integer> requireItemList,List<Integer> requireCountList,int requireMoneyId,int requireMoneyCount,int nextLevel) {
		builder = EquipmentProbuf.EquipmentGrade.newBuilder();
		builder.setKeyId(keyId);
		builder.setQuality(quality);
		builder.setLevelMax(levelMax);
		builder.addAllAttributeIdList(attributeIdList); 
		builder.addAllCoefficientList(coefficientList); 
		builder.addAllRequireItemList(requireItemList); 
		builder.addAllRequireCountList(requireCountList); 
		builder.setRequireMoneyId(requireMoneyId);
		builder.setRequireMoneyCount(requireMoneyCount);
		builder.setNextLevel(nextLevel);
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
		EquipmentProbuf.EquipmentGrade pb;
		try {
			pb = EquipmentProbuf.EquipmentGrade.parseFrom(in);
			builder = EquipmentProbuf.EquipmentGrade.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setQuality(pb.getQuality());
			builder.setLevelMax(pb.getLevelMax());
			builder.addAllAttributeIdList(pb.getAttributeIdListList()); 
			builder.addAllCoefficientList(pb.getCoefficientListList()); 
			builder.addAllRequireItemList(pb.getRequireItemListList()); 
			builder.addAllRequireCountList(pb.getRequireCountListList()); 
			builder.setRequireMoneyId(pb.getRequireMoneyId());
			builder.setRequireMoneyCount(pb.getRequireMoneyCount());
			builder.setNextLevel(pb.getNextLevel());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}