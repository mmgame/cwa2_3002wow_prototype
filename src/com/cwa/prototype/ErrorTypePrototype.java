package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.ErrorTypeProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class ErrorTypePrototype implements IPrototype{
	private ErrorTypeProbuf.ErrorType.Builder builder;
    //------------------------------------------
    public ErrorTypePrototype() {
		builder = ErrorTypeProbuf.ErrorType.newBuilder();
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
 	
 	public ErrorTypePrototype(int keyId,String desc) {
		builder = ErrorTypeProbuf.ErrorType.newBuilder();
		builder.setKeyId(keyId);
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
		ErrorTypeProbuf.ErrorType pb;
		try {
			pb = ErrorTypeProbuf.ErrorType.parseFrom(in);
			builder = ErrorTypeProbuf.ErrorType.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setDesc(pb.getDesc());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}