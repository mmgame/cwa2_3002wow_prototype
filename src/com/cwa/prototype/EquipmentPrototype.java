package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.EquipmentProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class EquipmentPrototype implements IPrototype{
	private EquipmentProbuf.Equipment.Builder builder;
    //------------------------------------------
    public EquipmentPrototype() {
		builder = EquipmentProbuf.Equipment.newBuilder();
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
 	
  	public String getDesc() {
		return builder.getDesc();
  	}	

  	public void setDesc(String desc) {
		builder.setDesc(desc);
 	}
 	
  	public int getEquipmentposition() {
		return builder.getEquipmentposition();
  	}	

  	public void setEquipmentposition(int equipmentposition) {
		builder.setEquipmentposition(equipmentposition);
 	}
 	
	public List<Integer> getSlotTypeList() {
		return builder.getSlotTypeListList();
	}

	public void setSlotTypeList(List<Integer> slotTypeList) {
		builder.addAllSlotTypeList(slotTypeList);
	}
  	public int getUpdateGoldRatio() {
		return builder.getUpdateGoldRatio();
  	}	

  	public void setUpdateGoldRatio(int updateGoldRatio) {
		builder.setUpdateGoldRatio(updateGoldRatio);
 	}
 	
  	public String getEquipmentIcon() {
		return builder.getEquipmentIcon();
  	}	

  	public void setEquipmentIcon(String equipmentIcon) {
		builder.setEquipmentIcon(equipmentIcon);
 	}
 	
 	public EquipmentPrototype(int keyId,String name,String desc,int equipmentposition,List<Integer> slotTypeList,int updateGoldRatio,String equipmentIcon) {
		builder = EquipmentProbuf.Equipment.newBuilder();
		builder.setKeyId(keyId);
		builder.setName(name);
		builder.setDesc(desc);
		builder.setEquipmentposition(equipmentposition);
		builder.addAllSlotTypeList(slotTypeList); 
		builder.setUpdateGoldRatio(updateGoldRatio);
		builder.setEquipmentIcon(equipmentIcon);
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
		EquipmentProbuf.Equipment pb;
		try {
			pb = EquipmentProbuf.Equipment.parseFrom(in);
			builder = EquipmentProbuf.Equipment.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setName(pb.getName());
			builder.setDesc(pb.getDesc());
			builder.setEquipmentposition(pb.getEquipmentposition());
			builder.addAllSlotTypeList(pb.getSlotTypeListList()); 
			builder.setUpdateGoldRatio(pb.getUpdateGoldRatio());
			builder.setEquipmentIcon(pb.getEquipmentIcon());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}