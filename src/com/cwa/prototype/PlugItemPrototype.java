package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.ItemProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class PlugItemPrototype implements IPrototype{
	private ItemProbuf.PlugItem.Builder builder;
    //------------------------------------------
    public PlugItemPrototype() {
		builder = ItemProbuf.PlugItem.newBuilder();
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
 	
  	public int getType() {
		return builder.getType();
  	}	

  	public void setType(int type) {
		builder.setType(type);
 	}
 	
	public List<Integer> getRaiseAttrList() {
		return builder.getRaiseAttrListList();
	}

	public void setRaiseAttrList(List<Integer> raiseAttrList) {
		builder.addAllRaiseAttrList(raiseAttrList);
	}
	public List<Integer> getRaiseValueList() {
		return builder.getRaiseValueListList();
	}

	public void setRaiseValueList(List<Integer> raiseValueList) {
		builder.addAllRaiseValueList(raiseValueList);
	}
	public List<Integer> getRequireKeyIdsList() {
		return builder.getRequireKeyIdsListList();
	}

	public void setRequireKeyIdsList(List<Integer> requireKeyIdsList) {
		builder.addAllRequireKeyIdsList(requireKeyIdsList);
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
 	
  	public int getUpdataSuccess() {
		return builder.getUpdataSuccess();
  	}	

  	public void setUpdataSuccess(int updataSuccess) {
		builder.setUpdataSuccess(updataSuccess);
 	}
 	
  	public int getUpdataKeyId() {
		return builder.getUpdataKeyId();
  	}	

  	public void setUpdataKeyId(int updataKeyId) {
		builder.setUpdataKeyId(updataKeyId);
 	}
 	
  	public int getLuckyMax() {
		return builder.getLuckyMax();
  	}	

  	public void setLuckyMax(int luckyMax) {
		builder.setLuckyMax(luckyMax);
 	}
 	
  	public int getLuckyAdd() {
		return builder.getLuckyAdd();
  	}	

  	public void setLuckyAdd(int luckyAdd) {
		builder.setLuckyAdd(luckyAdd);
 	}
 	
 	public PlugItemPrototype(int keyId,int type,List<Integer> raiseAttrList,List<Integer> raiseValueList,List<Integer> requireKeyIdsList,List<Integer> requireCountList,int requireMoneyId,int requireMoneyCount,int updataSuccess,int updataKeyId,int luckyMax,int luckyAdd) {
		builder = ItemProbuf.PlugItem.newBuilder();
		builder.setKeyId(keyId);
		builder.setType(type);
		builder.addAllRaiseAttrList(raiseAttrList); 
		builder.addAllRaiseValueList(raiseValueList); 
		builder.addAllRequireKeyIdsList(requireKeyIdsList); 
		builder.addAllRequireCountList(requireCountList); 
		builder.setRequireMoneyId(requireMoneyId);
		builder.setRequireMoneyCount(requireMoneyCount);
		builder.setUpdataSuccess(updataSuccess);
		builder.setUpdataKeyId(updataKeyId);
		builder.setLuckyMax(luckyMax);
		builder.setLuckyAdd(luckyAdd);
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
		ItemProbuf.PlugItem pb;
		try {
			pb = ItemProbuf.PlugItem.parseFrom(in);
			builder = ItemProbuf.PlugItem.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setType(pb.getType());
			builder.addAllRaiseAttrList(pb.getRaiseAttrListList()); 
			builder.addAllRaiseValueList(pb.getRaiseValueListList()); 
			builder.addAllRequireKeyIdsList(pb.getRequireKeyIdsListList()); 
			builder.addAllRequireCountList(pb.getRequireCountListList()); 
			builder.setRequireMoneyId(pb.getRequireMoneyId());
			builder.setRequireMoneyCount(pb.getRequireMoneyCount());
			builder.setUpdataSuccess(pb.getUpdataSuccess());
			builder.setUpdataKeyId(pb.getUpdataKeyId());
			builder.setLuckyMax(pb.getLuckyMax());
			builder.setLuckyAdd(pb.getLuckyAdd());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}