package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.ResourceProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class ResourcePrototype implements IPrototype{
	private ResourceProbuf.Resource.Builder builder;
    //------------------------------------------
    public ResourcePrototype() {
		builder = ResourceProbuf.Resource.newBuilder();
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
 	
  	public String getResourceImage() {
		return builder.getResourceImage();
  	}	

  	public void setResourceImage(String resourceImage) {
		builder.setResourceImage(resourceImage);
 	}
 	
 	public ResourcePrototype(int keyId,String name,String desc,String resourceImage) {
		builder = ResourceProbuf.Resource.newBuilder();
		builder.setKeyId(keyId);
		builder.setName(name);
		builder.setDesc(desc);
		builder.setResourceImage(resourceImage);
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
		ResourceProbuf.Resource pb;
		try {
			pb = ResourceProbuf.Resource.parseFrom(in);
			builder = ResourceProbuf.Resource.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setName(pb.getName());
			builder.setDesc(pb.getDesc());
			builder.setResourceImage(pb.getResourceImage());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}