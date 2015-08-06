package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.VipProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class VipFunctionPrototype implements IPrototype{
	private VipProbuf.VipFunction.Builder builder;
    //------------------------------------------
    public VipFunctionPrototype() {
		builder = VipProbuf.VipFunction.newBuilder();
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
 	
	public List<Integer> getVipBuynumList() {
		return builder.getVipBuynumListList();
	}

	public void setVipBuynumList(List<Integer> vipBuynumList) {
		builder.addAllVipBuynumList(vipBuynumList);
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
 	public VipFunctionPrototype(int keyId,List<Integer> vipBuynumList,int requireMoneyType,List<Integer> requireMoneyCountList) {
		builder = VipProbuf.VipFunction.newBuilder();
		builder.setKeyId(keyId);
		builder.addAllVipBuynumList(vipBuynumList); 
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
		VipProbuf.VipFunction pb;
		try {
			pb = VipProbuf.VipFunction.parseFrom(in);
			builder = VipProbuf.VipFunction.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.addAllVipBuynumList(pb.getVipBuynumListList()); 
			builder.setRequireMoneyType(pb.getRequireMoneyType());
			builder.addAllRequireMoneyCountList(pb.getRequireMoneyCountListList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}