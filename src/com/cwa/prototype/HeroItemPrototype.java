package com.cwa.prototype;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.List;
import com.cwa.prototype.protobuf.ItemProbuf;
import com.cwa.component.prototype.IPrototype;
import com.google.protobuf.InvalidProtocolBufferException;

public class HeroItemPrototype implements IPrototype{
	private ItemProbuf.HeroItem.Builder builder;
    //------------------------------------------
    public HeroItemPrototype() {
		builder = ItemProbuf.HeroItem.newBuilder();
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
 	
  	public int getHeroId() {
		return builder.getHeroId();
  	}	

  	public void setHeroId(int heroId) {
		builder.setHeroId(heroId);
 	}
 	
  	public int getQuality() {
		return builder.getQuality();
  	}	

  	public void setQuality(int quality) {
		builder.setQuality(quality);
 	}
 	
  	public int getDropItem() {
		return builder.getDropItem();
  	}	

  	public void setDropItem(int dropItem) {
		builder.setDropItem(dropItem);
 	}
 	
  	public int getDropCount() {
		return builder.getDropCount();
  	}	

  	public void setDropCount(int dropCount) {
		builder.setDropCount(dropCount);
 	}
 	
 	public HeroItemPrototype(int keyId,int heroId,int quality,int dropItem,int dropCount) {
		builder = ItemProbuf.HeroItem.newBuilder();
		builder.setKeyId(keyId);
		builder.setHeroId(heroId);
		builder.setQuality(quality);
		builder.setDropItem(dropItem);
		builder.setDropCount(dropCount);
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
		ItemProbuf.HeroItem pb;
		try {
			pb = ItemProbuf.HeroItem.parseFrom(in);
			builder = ItemProbuf.HeroItem.newBuilder();
			builder.setKeyId(pb.getKeyId());
			builder.setHeroId(pb.getHeroId());
			builder.setQuality(pb.getQuality());
			builder.setDropItem(pb.getDropItem());
			builder.setDropCount(pb.getDropCount());
			obtainAfter();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
}