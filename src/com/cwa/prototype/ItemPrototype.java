package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.ItemProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class ItemPrototype implements IPrototype{
	private ItemProbuf.Item.Builder builder;
    //------------------------------------------
    public ItemPrototype() {
		builder = ItemProbuf.Item.newBuilder();
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
 	
  	public int getItemType() {
		return builder.getItemType();
  	}	

  	public void setItemType(int itemType) {
		builder.setItemType(itemType);
 	}
 	
  	public int getIsUse() {
		return builder.getIsUse();
  	}	

  	public void setIsUse(int isUse) {
		builder.setIsUse(isUse);
 	}
 	
  	public int getRequireRoleLevel() {
		return builder.getRequireRoleLevel();
  	}	

  	public void setRequireRoleLevel(int requireRoleLevel) {
		builder.setRequireRoleLevel(requireRoleLevel);
 	}
 	
  	public int getHoldMaxCount() {
		return builder.getHoldMaxCount();
  	}	

  	public void setHoldMaxCount(int holdMaxCount) {
		builder.setHoldMaxCount(holdMaxCount);
 	}
 	
  	public int getQualit() {
		return builder.getQualit();
  	}	

  	public void setQualit(int qualit) {
		builder.setQualit(qualit);
 	}
 	
  	public int getPrice() {
		return builder.getPrice();
  	}	

  	public void setPrice(int price) {
		builder.setPrice(price);
 	}
 	
  	public String getItemImage() {
		return builder.getItemImage();
  	}	

  	public void setItemImage(String itemImage) {
		builder.setItemImage(itemImage);
 	}
 	
 	public ItemPrototype(int keyId,String name,String desc,int itemType,int isUse,int requireRoleLevel,int holdMaxCount,int qualit,int price,String itemImage) {
		builder = ItemProbuf.Item.newBuilder();
		builder.setKeyId(keyId);
		builder.setName(name);
		builder.setDesc(desc);
		builder.setItemType(itemType);
		builder.setIsUse(isUse);
		builder.setRequireRoleLevel(requireRoleLevel);
		builder.setHoldMaxCount(holdMaxCount);
		builder.setQualit(qualit);
		builder.setPrice(price);
		builder.setItemImage(itemImage);
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
		ItemProbuf.Item pb;
		try {
			pb = ItemProbuf.Item.parseFrom(in);
			builder = ItemProbuf.Item.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setName(pb.getName());
			builder.setDesc(pb.getDesc());
			builder.setItemType(pb.getItemType());
			builder.setIsUse(pb.getIsUse());
			builder.setRequireRoleLevel(pb.getRequireRoleLevel());
			builder.setHoldMaxCount(pb.getHoldMaxCount());
			builder.setQualit(pb.getQualit());
			builder.setPrice(pb.getPrice());
			builder.setItemImage(pb.getItemImage());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}