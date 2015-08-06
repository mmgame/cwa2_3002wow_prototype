package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.MatchProbuf;
import com.cwa.util.prototype.JsonUtil;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class MatchChapterPrototype implements IPrototype{
	private MatchProbuf.MatchChapter.Builder builder;
	private List<List<Integer>> startAwardListss;
    //------------------------------------------
    public MatchChapterPrototype() {
		builder = MatchProbuf.MatchChapter.newBuilder();
	}
	@SuppressWarnings("unchecked")
	@Override
	public void obtainAfter() {
	startAwardListss = JsonUtil.string2ArrayObj(builder.getStartAwardLists());
	}

	public List<List<Integer>> gotStartAwardListsList(){
		return startAwardListss;
	}

  	public int getKeyId() {
		return builder.getKeyId();
  	}	

  	public void setKeyId(int keyId) {
		builder.setKeyId(keyId);
 	}
 	
  	public int getLimitLevel() {
		return builder.getLimitLevel();
  	}	

  	public void setLimitLevel(int limitLevel) {
		builder.setLimitLevel(limitLevel);
 	}
 	
  	public String getStartAwardLists() {
		return builder.getStartAwardLists();
  	}	

  	public void setStartAwardLists(String startAwardLists) {
		builder.setStartAwardLists(startAwardLists);
 	}
 	
	public List<Integer> getBusinessmanList() {
		return builder.getBusinessmanListList();
	}

	public void setBusinessmanList(List<Integer> businessmanList) {
		builder.addAllBusinessmanList(businessmanList);
	}
	public List<Integer> getBusinessmanSatioList() {
		return builder.getBusinessmanSatioListList();
	}

	public void setBusinessmanSatioList(List<Integer> businessmanSatioList) {
		builder.addAllBusinessmanSatioList(businessmanSatioList);
	}
	public List<Integer> getNormalMatchList() {
		return builder.getNormalMatchListList();
	}

	public void setNormalMatchList(List<Integer> normalMatchList) {
		builder.addAllNormalMatchList(normalMatchList);
	}
	public List<Integer> getEliteMatchList() {
		return builder.getEliteMatchListList();
	}

	public void setEliteMatchList(List<Integer> eliteMatchList) {
		builder.addAllEliteMatchList(eliteMatchList);
	}
  	public String getMapFile() {
		return builder.getMapFile();
  	}	

  	public void setMapFile(String mapFile) {
		builder.setMapFile(mapFile);
 	}
 	
  	public String getName() {
		return builder.getName();
  	}	

  	public void setName(String name) {
		builder.setName(name);
 	}
 	
 	public MatchChapterPrototype(int keyId,int limitLevel,String startAwardLists,List<Integer> businessmanList,List<Integer> businessmanSatioList,List<Integer> normalMatchList,List<Integer> eliteMatchList,String mapFile,String name) {
		builder = MatchProbuf.MatchChapter.newBuilder();
		builder.setKeyId(keyId);
		builder.setLimitLevel(limitLevel);
		builder.setStartAwardLists(startAwardLists);
		builder.addAllBusinessmanList(businessmanList); 
		builder.addAllBusinessmanSatioList(businessmanSatioList); 
		builder.addAllNormalMatchList(normalMatchList); 
		builder.addAllEliteMatchList(eliteMatchList); 
		builder.setMapFile(mapFile);
		builder.setName(name);
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
		MatchProbuf.MatchChapter pb;
		try {
			pb = MatchProbuf.MatchChapter.parseFrom(in);
			builder = MatchProbuf.MatchChapter.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setLimitLevel(pb.getLimitLevel());
			builder.setStartAwardLists(pb.getStartAwardLists());
			builder.addAllBusinessmanList(pb.getBusinessmanListList()); 
			builder.addAllBusinessmanSatioList(pb.getBusinessmanSatioListList()); 
			builder.addAllNormalMatchList(pb.getNormalMatchListList()); 
			builder.addAllEliteMatchList(pb.getEliteMatchListList()); 
			builder.setMapFile(pb.getMapFile());
			builder.setName(pb.getName());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}