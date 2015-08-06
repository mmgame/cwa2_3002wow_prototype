package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.BattleProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class BattlePrototype implements IPrototype{
	private BattleProbuf.Battle.Builder builder;
    //------------------------------------------
    public BattlePrototype() {
		builder = BattleProbuf.Battle.newBuilder();
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
 	
  	public String getBattleName() {
		return builder.getBattleName();
  	}	

  	public void setBattleName(String battleName) {
		builder.setBattleName(battleName);
 	}
 	
  	public int getBattleType() {
		return builder.getBattleType();
  	}	

  	public void setBattleType(int battleType) {
		builder.setBattleType(battleType);
 	}
 	
  	public String getBattleDesc() {
		return builder.getBattleDesc();
  	}	

  	public void setBattleDesc(String battleDesc) {
		builder.setBattleDesc(battleDesc);
 	}
 	
  	public int getFightWtime() {
		return builder.getFightWtime();
  	}	

  	public void setFightWtime(int fightWtime) {
		builder.setFightWtime(fightWtime);
 	}
 	
  	public int getPostWtime() {
		return builder.getPostWtime();
  	}	

  	public void setPostWtime(int postWtime) {
		builder.setPostWtime(postWtime);
 	}
 	
  	public int getMax() {
		return builder.getMax();
  	}	

  	public void setMax(int max) {
		builder.setMax(max);
 	}
 	
  	public int getMap() {
		return builder.getMap();
  	}	

  	public void setMap(int map) {
		builder.setMap(map);
 	}
 	
	public List<Integer> getWinCondition() {
		return builder.getWinConditionList();
	}

	public void setWinCondition(List<Integer> winCondition) {
		builder.addAllWinCondition(winCondition);
	}
  	public int getWinType() {
		return builder.getWinType();
  	}	

  	public void setWinType(int winType) {
		builder.setWinType(winType);
 	}
 	
  	public int getBattleTime() {
		return builder.getBattleTime();
  	}	

  	public void setBattleTime(int battleTime) {
		builder.setBattleTime(battleTime);
 	}
 	
  	public int getMaxHeroCount() {
		return builder.getMaxHeroCount();
  	}	

  	public void setMaxHeroCount(int maxHeroCount) {
		builder.setMaxHeroCount(maxHeroCount);
 	}
 	
 	public BattlePrototype(int keyId,String battleName,int battleType,String battleDesc,int fightWtime,int postWtime,int max,int map,List<Integer> winCondition,int winType,int battleTime,int maxHeroCount) {
		builder = BattleProbuf.Battle.newBuilder();
		builder.setKeyId(keyId);
		builder.setBattleName(battleName);
		builder.setBattleType(battleType);
		builder.setBattleDesc(battleDesc);
		builder.setFightWtime(fightWtime);
		builder.setPostWtime(postWtime);
		builder.setMax(max);
		builder.setMap(map);
		builder.addAllWinCondition(winCondition); 
		builder.setWinType(winType);
		builder.setBattleTime(battleTime);
		builder.setMaxHeroCount(maxHeroCount);
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
		BattleProbuf.Battle pb;
		try {
			pb = BattleProbuf.Battle.parseFrom(in);
			builder = BattleProbuf.Battle.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setBattleName(pb.getBattleName());
			builder.setBattleType(pb.getBattleType());
			builder.setBattleDesc(pb.getBattleDesc());
			builder.setFightWtime(pb.getFightWtime());
			builder.setPostWtime(pb.getPostWtime());
			builder.setMax(pb.getMax());
			builder.setMap(pb.getMap());
			builder.addAllWinCondition(pb.getWinConditionList()); 
			builder.setWinType(pb.getWinType());
			builder.setBattleTime(pb.getBattleTime());
			builder.setMaxHeroCount(pb.getMaxHeroCount());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}