package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.MatchProbuf;
import com.cwa.util.prototype.JsonUtil;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class MatchDropPrototype implements IPrototype{
	private MatchProbuf.MatchDrop.Builder builder;
	private List<List<Integer>> npcListss;
	private List<List<Integer>> helpNpcListss;
    //------------------------------------------
    public MatchDropPrototype() {
		builder = MatchProbuf.MatchDrop.newBuilder();
	}
	@SuppressWarnings("unchecked")
	@Override
	public void obtainAfter() {
	npcListss = JsonUtil.string2ArrayObj(builder.getNpcLists());
	helpNpcListss = JsonUtil.string2ArrayObj(builder.getHelpNpcLists());
	}

	public List<List<Integer>> gotNpcListsList(){
		return npcListss;
	}
	public List<List<Integer>> gotHelpNpcListsList(){
		return helpNpcListss;
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
 	
  	public String getNpcLists() {
		return builder.getNpcLists();
  	}	

  	public void setNpcLists(String npcLists) {
		builder.setNpcLists(npcLists);
 	}
 	
	public List<Integer> getDropGoodList() {
		return builder.getDropGoodListList();
	}

	public void setDropGoodList(List<Integer> dropGoodList) {
		builder.addAllDropGoodList(dropGoodList);
	}
	public List<Integer> getDropCountList() {
		return builder.getDropCountListList();
	}

	public void setDropCountList(List<Integer> dropCountList) {
		builder.addAllDropCountList(dropCountList);
	}
	public List<Integer> getRandomDropList() {
		return builder.getRandomDropListList();
	}

	public void setRandomDropList(List<Integer> randomDropList) {
		builder.addAllRandomDropList(randomDropList);
	}
	public List<Integer> getCountRatiosList() {
		return builder.getCountRatiosListList();
	}

	public void setCountRatiosList(List<Integer> countRatiosList) {
		builder.addAllCountRatiosList(countRatiosList);
	}
  	public int getGradeDrop() {
		return builder.getGradeDrop();
  	}	

  	public void setGradeDrop(int gradeDrop) {
		builder.setGradeDrop(gradeDrop);
 	}
 	
  	public int getRequireGrade() {
		return builder.getRequireGrade();
  	}	

  	public void setRequireGrade(int requireGrade) {
		builder.setRequireGrade(requireGrade);
 	}
 	
  	public int getGrade() {
		return builder.getGrade();
  	}	

  	public void setGrade(int grade) {
		builder.setGrade(grade);
 	}
 	
  	public String getHelpNpcLists() {
		return builder.getHelpNpcLists();
  	}	

  	public void setHelpNpcLists(String helpNpcLists) {
		builder.setHelpNpcLists(helpNpcLists);
 	}
 	
  	public int getNextKeyId() {
		return builder.getNextKeyId();
  	}	

  	public void setNextKeyId(int nextKeyId) {
		builder.setNextKeyId(nextKeyId);
 	}
 	
	public List<Integer> getDropViews() {
		return builder.getDropViewsList();
	}

	public void setDropViews(List<Integer> dropViews) {
		builder.addAllDropViews(dropViews);
	}
 	public MatchDropPrototype(int keyId,int type,String npcLists,List<Integer> dropGoodList,List<Integer> dropCountList,List<Integer> randomDropList,List<Integer> countRatiosList,int gradeDrop,int requireGrade,int grade,String helpNpcLists,int nextKeyId,List<Integer> dropViews) {
		builder = MatchProbuf.MatchDrop.newBuilder();
		builder.setKeyId(keyId);
		builder.setType(type);
		builder.setNpcLists(npcLists);
		builder.addAllDropGoodList(dropGoodList); 
		builder.addAllDropCountList(dropCountList); 
		builder.addAllRandomDropList(randomDropList); 
		builder.addAllCountRatiosList(countRatiosList); 
		builder.setGradeDrop(gradeDrop);
		builder.setRequireGrade(requireGrade);
		builder.setGrade(grade);
		builder.setHelpNpcLists(helpNpcLists);
		builder.setNextKeyId(nextKeyId);
		builder.addAllDropViews(dropViews); 
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
		MatchProbuf.MatchDrop pb;
		try {
			pb = MatchProbuf.MatchDrop.parseFrom(in);
			builder = MatchProbuf.MatchDrop.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setType(pb.getType());
			builder.setNpcLists(pb.getNpcLists());
			builder.addAllDropGoodList(pb.getDropGoodListList()); 
			builder.addAllDropCountList(pb.getDropCountListList()); 
			builder.addAllRandomDropList(pb.getRandomDropListList()); 
			builder.addAllCountRatiosList(pb.getCountRatiosListList()); 
			builder.setGradeDrop(pb.getGradeDrop());
			builder.setRequireGrade(pb.getRequireGrade());
			builder.setGrade(pb.getGrade());
			builder.setHelpNpcLists(pb.getHelpNpcLists());
			builder.setNextKeyId(pb.getNextKeyId());
			builder.addAllDropViews(pb.getDropViewsList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}