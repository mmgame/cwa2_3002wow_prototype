package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.ItemProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class ItemCombinePrototype implements IPrototype{
	private ItemProbuf.ItemCombine.Builder builder;
    //------------------------------------------
    public ItemCombinePrototype() {
		builder = ItemProbuf.ItemCombine.newBuilder();
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
 	
  	public int getShowLevel() {
		return builder.getShowLevel();
  	}	

  	public void setShowLevel(int showLevel) {
		builder.setShowLevel(showLevel);
 	}
 	
	public List<Integer> getSpendGoodsList() {
		return builder.getSpendGoodsListList();
	}

	public void setSpendGoodsList(List<Integer> spendGoodsList) {
		builder.addAllSpendGoodsList(spendGoodsList);
	}
	public List<Integer> getSpendCountList() {
		return builder.getSpendCountListList();
	}

	public void setSpendCountList(List<Integer> spendCountList) {
		builder.addAllSpendCountList(spendCountList);
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
 	
 	public ItemCombinePrototype(int keyId,int showLevel,List<Integer> spendGoodsList,List<Integer> spendCountList,int requireMoneyId,int requireMoneyCount) {
		builder = ItemProbuf.ItemCombine.newBuilder();
		builder.setKeyId(keyId);
		builder.setShowLevel(showLevel);
		builder.addAllSpendGoodsList(spendGoodsList); 
		builder.addAllSpendCountList(spendCountList); 
		builder.setRequireMoneyId(requireMoneyId);
		builder.setRequireMoneyCount(requireMoneyCount);
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
		ItemProbuf.ItemCombine pb;
		try {
			pb = ItemProbuf.ItemCombine.parseFrom(in);
			builder = ItemProbuf.ItemCombine.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setShowLevel(pb.getShowLevel());
			builder.addAllSpendGoodsList(pb.getSpendGoodsListList()); 
			builder.addAllSpendCountList(pb.getSpendCountListList()); 
			builder.setRequireMoneyId(pb.getRequireMoneyId());
			builder.setRequireMoneyCount(pb.getRequireMoneyCount());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}