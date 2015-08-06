package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.ConstantProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class ConstantPrototype implements IPrototype{
	private ConstantProbuf.Constant.Builder builder;
    //------------------------------------------
    public ConstantPrototype() {
		builder = ConstantProbuf.Constant.newBuilder();
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
 	
  	public String getAttributeName() {
		return builder.getAttributeName();
  	}	

  	public void setAttributeName(String attributeName) {
		builder.setAttributeName(attributeName);
 	}
 	
  	public String getValue() {
		return builder.getValue();
  	}	

  	public void setValue(String value) {
		builder.setValue(value);
 	}
 	
 	public ConstantPrototype(int keyId,String desc,String attributeName,String value) {
		builder = ConstantProbuf.Constant.newBuilder();
		builder.setKeyId(keyId);
		builder.setDesc(desc);
		builder.setAttributeName(attributeName);
		builder.setValue(value);
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
		ConstantProbuf.Constant pb;
		try {
			pb = ConstantProbuf.Constant.parseFrom(in);
			builder = ConstantProbuf.Constant.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setDesc(pb.getDesc());
			builder.setAttributeName(pb.getAttributeName());
			builder.setValue(pb.getValue());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}