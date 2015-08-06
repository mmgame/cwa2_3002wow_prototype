package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.MatchProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class MatchGoodsPrototype implements IPrototype{
	private MatchProbuf.MatchGoods.Builder builder;
    //------------------------------------------
    public MatchGoodsPrototype() {
		builder = MatchProbuf.MatchGoods.newBuilder();
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
 	
	public List<Integer> getGoodList() {
		return builder.getGoodListList();
	}

	public void setGoodList(List<Integer> goodList) {
		builder.addAllGoodList(goodList);
	}
	public List<Integer> getCountList() {
		return builder.getCountListList();
	}

	public void setCountList(List<Integer> countList) {
		builder.addAllCountList(countList);
	}
	public List<Integer> getRatiosList() {
		return builder.getRatiosListList();
	}

	public void setRatiosList(List<Integer> ratiosList) {
		builder.addAllRatiosList(ratiosList);
	}
	public List<Integer> getMoneyTypeList() {
		return builder.getMoneyTypeListList();
	}

	public void setMoneyTypeList(List<Integer> moneyTypeList) {
		builder.addAllMoneyTypeList(moneyTypeList);
	}
	public List<Integer> getMoneyCountList() {
		return builder.getMoneyCountListList();
	}

	public void setMoneyCountList(List<Integer> moneyCountList) {
		builder.addAllMoneyCountList(moneyCountList);
	}
 	public MatchGoodsPrototype(int keyId,List<Integer> goodList,List<Integer> countList,List<Integer> ratiosList,List<Integer> moneyTypeList,List<Integer> moneyCountList) {
		builder = MatchProbuf.MatchGoods.newBuilder();
		builder.setKeyId(keyId);
		builder.addAllGoodList(goodList); 
		builder.addAllCountList(countList); 
		builder.addAllRatiosList(ratiosList); 
		builder.addAllMoneyTypeList(moneyTypeList); 
		builder.addAllMoneyCountList(moneyCountList); 
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
		MatchProbuf.MatchGoods pb;
		try {
			pb = MatchProbuf.MatchGoods.parseFrom(in);
			builder = MatchProbuf.MatchGoods.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.addAllGoodList(pb.getGoodListList()); 
			builder.addAllCountList(pb.getCountListList()); 
			builder.addAllRatiosList(pb.getRatiosListList()); 
			builder.addAllMoneyTypeList(pb.getMoneyTypeListList()); 
			builder.addAllMoneyCountList(pb.getMoneyCountListList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}