package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.ItemProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class BoxItemRatePrototype implements IPrototype{
	private ItemProbuf.BoxItemRate.Builder builder;
    //------------------------------------------
    public BoxItemRatePrototype() {
		builder = ItemProbuf.BoxItemRate.newBuilder();
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
 	
	public List<Integer> getItemKeyIdsList() {
		return builder.getItemKeyIdsListList();
	}

	public void setItemKeyIdsList(List<Integer> itemKeyIdsList) {
		builder.addAllItemKeyIdsList(itemKeyIdsList);
	}
	public List<Integer> getItemRatiosList() {
		return builder.getItemRatiosListList();
	}

	public void setItemRatiosList(List<Integer> itemRatiosList) {
		builder.addAllItemRatiosList(itemRatiosList);
	}
	public List<Integer> getCountList() {
		return builder.getCountListList();
	}

	public void setCountList(List<Integer> countList) {
		builder.addAllCountList(countList);
	}
	public List<Integer> getCountMultiply() {
		return builder.getCountMultiplyList();
	}

	public void setCountMultiply(List<Integer> countMultiply) {
		builder.addAllCountMultiply(countMultiply);
	}
	public List<Integer> getCountRatiosList() {
		return builder.getCountRatiosListList();
	}

	public void setCountRatiosList(List<Integer> countRatiosList) {
		builder.addAllCountRatiosList(countRatiosList);
	}
 	public BoxItemRatePrototype(int keyId,List<Integer> itemKeyIdsList,List<Integer> itemRatiosList,List<Integer> countList,List<Integer> countMultiply,List<Integer> countRatiosList) {
		builder = ItemProbuf.BoxItemRate.newBuilder();
		builder.setKeyId(keyId);
		builder.addAllItemKeyIdsList(itemKeyIdsList); 
		builder.addAllItemRatiosList(itemRatiosList); 
		builder.addAllCountList(countList); 
		builder.addAllCountMultiply(countMultiply); 
		builder.addAllCountRatiosList(countRatiosList); 
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
		ItemProbuf.BoxItemRate pb;
		try {
			pb = ItemProbuf.BoxItemRate.parseFrom(in);
			builder = ItemProbuf.BoxItemRate.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.addAllItemKeyIdsList(pb.getItemKeyIdsListList()); 
			builder.addAllItemRatiosList(pb.getItemRatiosListList()); 
			builder.addAllCountList(pb.getCountListList()); 
			builder.addAllCountMultiply(pb.getCountMultiplyList()); 
			builder.addAllCountRatiosList(pb.getCountRatiosListList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}