package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.EquipmentProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class SlotTypePrototype implements IPrototype{
	private EquipmentProbuf.SlotType.Builder builder;
    //------------------------------------------
    public SlotTypePrototype() {
		builder = EquipmentProbuf.SlotType.newBuilder();
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
 	
  	public String getDesc() {
		return builder.getDesc();
  	}	

  	public void setDesc(String desc) {
		builder.setDesc(desc);
 	}
 	
	public List<Integer> getPluginTypeList() {
		return builder.getPluginTypeListList();
	}

	public void setPluginTypeList(List<Integer> pluginTypeList) {
		builder.addAllPluginTypeList(pluginTypeList);
	}
 	public SlotTypePrototype(int keyId,String desc,List<Integer> pluginTypeList) {
		builder = EquipmentProbuf.SlotType.newBuilder();
		builder.setKeyId(keyId);
		builder.setDesc(desc);
		builder.addAllPluginTypeList(pluginTypeList); 
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
		EquipmentProbuf.SlotType pb;
		try {
			pb = EquipmentProbuf.SlotType.parseFrom(in);
			builder = EquipmentProbuf.SlotType.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setDesc(pb.getDesc());
			builder.addAllPluginTypeList(pb.getPluginTypeListList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}