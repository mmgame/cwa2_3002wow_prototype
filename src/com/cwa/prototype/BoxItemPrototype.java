package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.ItemProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class BoxItemPrototype implements IPrototype{
	private ItemProbuf.BoxItem.Builder builder;
    //------------------------------------------
    public BoxItemPrototype() {
		builder = ItemProbuf.BoxItem.newBuilder();
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
 	
	public List<Integer> getCountList() {
		return builder.getCountListList();
	}

	public void setCountList(List<Integer> countList) {
		builder.addAllCountList(countList);
	}
	public List<Integer> getCountRatiosList() {
		return builder.getCountRatiosListList();
	}

	public void setCountRatiosList(List<Integer> countRatiosList) {
		builder.addAllCountRatiosList(countRatiosList);
	}
	public List<Integer> getItemBooksList() {
		return builder.getItemBooksListList();
	}

	public void setItemBooksList(List<Integer> itemBooksList) {
		builder.addAllItemBooksList(itemBooksList);
	}
	public List<Integer> getItemBooksRatiosList() {
		return builder.getItemBooksRatiosListList();
	}

	public void setItemBooksRatiosList(List<Integer> itemBooksRatiosList) {
		builder.addAllItemBooksRatiosList(itemBooksRatiosList);
	}
 	public BoxItemPrototype(int keyId,String name,String desc,List<Integer> countList,List<Integer> countRatiosList,List<Integer> itemBooksList,List<Integer> itemBooksRatiosList) {
		builder = ItemProbuf.BoxItem.newBuilder();
		builder.setKeyId(keyId);
		builder.setName(name);
		builder.setDesc(desc);
		builder.addAllCountList(countList); 
		builder.addAllCountRatiosList(countRatiosList); 
		builder.addAllItemBooksList(itemBooksList); 
		builder.addAllItemBooksRatiosList(itemBooksRatiosList); 
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
		ItemProbuf.BoxItem pb;
		try {
			pb = ItemProbuf.BoxItem.parseFrom(in);
			builder = ItemProbuf.BoxItem.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setName(pb.getName());
			builder.setDesc(pb.getDesc());
			builder.addAllCountList(pb.getCountListList()); 
			builder.addAllCountRatiosList(pb.getCountRatiosListList()); 
			builder.addAllItemBooksList(pb.getItemBooksListList()); 
			builder.addAllItemBooksRatiosList(pb.getItemBooksRatiosListList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}