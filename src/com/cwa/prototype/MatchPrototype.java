package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.MatchProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class MatchPrototype implements IPrototype{
	private MatchProbuf.Match.Builder builder;
    //------------------------------------------
    public MatchPrototype() {
		builder = MatchProbuf.Match.newBuilder();
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
 	
  	public int getChapter() {
		return builder.getChapter();
  	}	

  	public void setChapter(int chapter) {
		builder.setChapter(chapter);
 	}
 	
  	public int getNormalIndex() {
		return builder.getNormalIndex();
  	}	

  	public void setNormalIndex(int normalIndex) {
		builder.setNormalIndex(normalIndex);
 	}
 	
  	public int getType() {
		return builder.getType();
  	}	

  	public void setType(int type) {
		builder.setType(type);
 	}
 	
  	public int getConcealCondition() {
		return builder.getConcealCondition();
  	}	

  	public void setConcealCondition(int concealCondition) {
		builder.setConcealCondition(concealCondition);
 	}
 	
  	public int getConcealTime() {
		return builder.getConcealTime();
  	}	

  	public void setConcealTime(int concealTime) {
		builder.setConcealTime(concealTime);
 	}
 	
  	public int getRequirePower() {
		return builder.getRequirePower();
  	}	

  	public void setRequirePower(int requirePower) {
		builder.setRequirePower(requirePower);
 	}
 	
  	public int getConcealPasscard() {
		return builder.getConcealPasscard();
  	}	

  	public void setConcealPasscard(int concealPasscard) {
		builder.setConcealPasscard(concealPasscard);
 	}
 	
  	public int getConcealRatios() {
		return builder.getConcealRatios();
  	}	

  	public void setConcealRatios(int concealRatios) {
		builder.setConcealRatios(concealRatios);
 	}
 	
	public List<Integer> getDropList() {
		return builder.getDropListList();
	}

	public void setDropList(List<Integer> dropList) {
		builder.addAllDropList(dropList);
	}
  	public String getMap() {
		return builder.getMap();
  	}	

  	public void setMap(String map) {
		builder.setMap(map);
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
 	
 	public MatchPrototype(int keyId,int chapter,int normalIndex,int type,int concealCondition,int concealTime,int requirePower,int concealPasscard,int concealRatios,List<Integer> dropList,String map,String name,String desc) {
		builder = MatchProbuf.Match.newBuilder();
		builder.setKeyId(keyId);
		builder.setChapter(chapter);
		builder.setNormalIndex(normalIndex);
		builder.setType(type);
		builder.setConcealCondition(concealCondition);
		builder.setConcealTime(concealTime);
		builder.setRequirePower(requirePower);
		builder.setConcealPasscard(concealPasscard);
		builder.setConcealRatios(concealRatios);
		builder.addAllDropList(dropList); 
		builder.setMap(map);
		builder.setName(name);
		builder.setDesc(desc);
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
		MatchProbuf.Match pb;
		try {
			pb = MatchProbuf.Match.parseFrom(in);
			builder = MatchProbuf.Match.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setChapter(pb.getChapter());
			builder.setNormalIndex(pb.getNormalIndex());
			builder.setType(pb.getType());
			builder.setConcealCondition(pb.getConcealCondition());
			builder.setConcealTime(pb.getConcealTime());
			builder.setRequirePower(pb.getRequirePower());
			builder.setConcealPasscard(pb.getConcealPasscard());
			builder.setConcealRatios(pb.getConcealRatios());
			builder.addAllDropList(pb.getDropListList()); 
			builder.setMap(pb.getMap());
			builder.setName(pb.getName());
			builder.setDesc(pb.getDesc());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}