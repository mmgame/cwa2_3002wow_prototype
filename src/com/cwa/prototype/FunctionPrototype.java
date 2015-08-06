package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.FunctionProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class FunctionPrototype implements IPrototype{
	private FunctionProbuf.Function.Builder builder;
    //------------------------------------------
    public FunctionPrototype() {
		builder = FunctionProbuf.Function.newBuilder();
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
 	
  	public int getLevelMin() {
		return builder.getLevelMin();
  	}	

  	public void setLevelMin(int levelMin) {
		builder.setLevelMin(levelMin);
 	}
 	
 	public FunctionPrototype(int keyId,String desc,int levelMin) {
		builder = FunctionProbuf.Function.newBuilder();
		builder.setKeyId(keyId);
		builder.setDesc(desc);
		builder.setLevelMin(levelMin);
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
		FunctionProbuf.Function pb;
		try {
			pb = FunctionProbuf.Function.parseFrom(in);
			builder = FunctionProbuf.Function.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setDesc(pb.getDesc());
			builder.setLevelMin(pb.getLevelMin());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}