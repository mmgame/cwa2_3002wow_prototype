package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.MatchProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class MatchShopPrototype implements IPrototype{
	private MatchProbuf.MatchShop.Builder builder;
    //------------------------------------------
    public MatchShopPrototype() {
		builder = MatchProbuf.MatchShop.newBuilder();
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
 	
	public List<Integer> getGoodList() {
		return builder.getGoodListList();
	}

	public void setGoodList(List<Integer> goodList) {
		builder.addAllGoodList(goodList);
	}
  	public int getRequireMoneyType() {
		return builder.getRequireMoneyType();
  	}	

  	public void setRequireMoneyType(int requireMoneyType) {
		builder.setRequireMoneyType(requireMoneyType);
 	}
 	
	public List<Integer> getRequireMoneyCountList() {
		return builder.getRequireMoneyCountListList();
	}

	public void setRequireMoneyCountList(List<Integer> requireMoneyCountList) {
		builder.addAllRequireMoneyCountList(requireMoneyCountList);
	}
 	public MatchShopPrototype(int keyId,int type,List<Integer> goodList,int requireMoneyType,List<Integer> requireMoneyCountList) {
		builder = MatchProbuf.MatchShop.newBuilder();
		builder.setKeyId(keyId);
		builder.setType(type);
		builder.addAllGoodList(goodList); 
		builder.setRequireMoneyType(requireMoneyType);
		builder.addAllRequireMoneyCountList(requireMoneyCountList); 
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
		MatchProbuf.MatchShop pb;
		try {
			pb = MatchProbuf.MatchShop.parseFrom(in);
			builder = MatchProbuf.MatchShop.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setType(pb.getType());
			builder.addAllGoodList(pb.getGoodListList()); 
			builder.setRequireMoneyType(pb.getRequireMoneyType());
			builder.addAllRequireMoneyCountList(pb.getRequireMoneyCountListList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}