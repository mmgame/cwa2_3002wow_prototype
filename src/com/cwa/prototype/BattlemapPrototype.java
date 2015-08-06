package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.BattleProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class BattlemapPrototype implements IPrototype{
	private BattleProbuf.Battlemap.Builder builder;
    //------------------------------------------
    public BattlemapPrototype() {
		builder = BattleProbuf.Battlemap.newBuilder();
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
 	
  	public String getMapPic() {
		return builder.getMapPic();
  	}	

  	public void setMapPic(String mapPic) {
		builder.setMapPic(mapPic);
 	}
 	
	public List<Integer> getMapArea() {
		return builder.getMapAreaList();
	}

	public void setMapArea(List<Integer> mapArea) {
		builder.addAllMapArea(mapArea);
	}
	public List<Integer> getAttackPostionList() {
		return builder.getAttackPostionListList();
	}

	public void setAttackPostionList(List<Integer> attackPostionList) {
		builder.addAllAttackPostionList(attackPostionList);
	}
	public List<Integer> getDefensePostionList() {
		return builder.getDefensePostionListList();
	}

	public void setDefensePostionList(List<Integer> defensePostionList) {
		builder.addAllDefensePostionList(defensePostionList);
	}
 	public BattlemapPrototype(int keyId,String mapPic,List<Integer> mapArea,List<Integer> attackPostionList,List<Integer> defensePostionList) {
		builder = BattleProbuf.Battlemap.newBuilder();
		builder.setKeyId(keyId);
		builder.setMapPic(mapPic);
		builder.addAllMapArea(mapArea); 
		builder.addAllAttackPostionList(attackPostionList); 
		builder.addAllDefensePostionList(defensePostionList); 
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
		BattleProbuf.Battlemap pb;
		try {
			pb = BattleProbuf.Battlemap.parseFrom(in);
			builder = BattleProbuf.Battlemap.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setMapPic(pb.getMapPic());
			builder.addAllMapArea(pb.getMapAreaList()); 
			builder.addAllAttackPostionList(pb.getAttackPostionListList()); 
			builder.addAllDefensePostionList(pb.getDefensePostionListList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}