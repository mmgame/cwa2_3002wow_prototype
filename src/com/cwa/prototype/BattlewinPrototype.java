package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.BattleProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class BattlewinPrototype implements IPrototype{
	private BattleProbuf.Battlewin.Builder builder;
    //------------------------------------------
    public BattlewinPrototype() {
		builder = BattleProbuf.Battlewin.newBuilder();
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
 	
  	public int getConditionType() {
		return builder.getConditionType();
  	}	

  	public void setConditionType(int conditionType) {
		builder.setConditionType(conditionType);
 	}
 	
	public List<Integer> getBattleDesc() {
		return builder.getBattleDescList();
	}

	public void setBattleDesc(List<Integer> battleDesc) {
		builder.addAllBattleDesc(battleDesc);
	}
 	public BattlewinPrototype(int keyId,String desc,int conditionType,List<Integer> battleDesc) {
		builder = BattleProbuf.Battlewin.newBuilder();
		builder.setKeyId(keyId);
		builder.setDesc(desc);
		builder.setConditionType(conditionType);
		builder.addAllBattleDesc(battleDesc); 
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
		BattleProbuf.Battlewin pb;
		try {
			pb = BattleProbuf.Battlewin.parseFrom(in);
			builder = BattleProbuf.Battlewin.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setDesc(pb.getDesc());
			builder.setConditionType(pb.getConditionType());
			builder.addAllBattleDesc(pb.getBattleDescList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}