package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.BattleProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class CoordinatePrototype implements IPrototype{
	private BattleProbuf.Coordinate.Builder builder;
    //------------------------------------------
    public CoordinatePrototype() {
		builder = BattleProbuf.Coordinate.newBuilder();
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
 	
	public List<Integer> getPostionList() {
		return builder.getPostionListList();
	}

	public void setPostionList(List<Integer> postionList) {
		builder.addAllPostionList(postionList);
	}
 	public CoordinatePrototype(int keyId,List<Integer> postionList) {
		builder = BattleProbuf.Coordinate.newBuilder();
		builder.setKeyId(keyId);
		builder.addAllPostionList(postionList); 
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
		BattleProbuf.Coordinate pb;
		try {
			pb = BattleProbuf.Coordinate.parseFrom(in);
			builder = BattleProbuf.Coordinate.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.addAllPostionList(pb.getPostionListList()); 
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}