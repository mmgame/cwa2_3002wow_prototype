// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GameinitProbuf.proto

package com.cwa.prototype.protobuf;

public final class GameinitProbuf {
  private GameinitProbuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GameInitOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 keyId = 1;
    /**
     * <code>required int32 keyId = 1;</code>
     *
     * <pre>
     * 初始化
     * </pre>
     */
    boolean hasKeyId();
    /**
     * <code>required int32 keyId = 1;</code>
     *
     * <pre>
     * 初始化
     * </pre>
     */
    int getKeyId();

    // required string desc = 2;
    /**
     * <code>required string desc = 2;</code>
     *
     * <pre>
     * 初始化说明
     * </pre>
     */
    boolean hasDesc();
    /**
     * <code>required string desc = 2;</code>
     *
     * <pre>
     * 初始化说明
     * </pre>
     */
    java.lang.String getDesc();
    /**
     * <code>required string desc = 2;</code>
     *
     * <pre>
     * 初始化说明
     * </pre>
     */
    com.google.protobuf.ByteString
        getDescBytes();

    // required int32 initType = 3;
    /**
     * <code>required int32 initType = 3;</code>
     *
     * <pre>
     * 初始化类型
     * </pre>
     */
    boolean hasInitType();
    /**
     * <code>required int32 initType = 3;</code>
     *
     * <pre>
     * 初始化类型
     * </pre>
     */
    int getInitType();

    // required int32 initSubType = 4;
    /**
     * <code>required int32 initSubType = 4;</code>
     *
     * <pre>
     * 初始化子类型
     * </pre>
     */
    boolean hasInitSubType();
    /**
     * <code>required int32 initSubType = 4;</code>
     *
     * <pre>
     * 初始化子类型
     * </pre>
     */
    int getInitSubType();

    // repeated int32 initParamList = 5;
    /**
     * <code>repeated int32 initParamList = 5;</code>
     *
     * <pre>
     * 初始化参数
     * </pre>
     */
    java.util.List<java.lang.Integer> getInitParamListList();
    /**
     * <code>repeated int32 initParamList = 5;</code>
     *
     * <pre>
     * 初始化参数
     * </pre>
     */
    int getInitParamListCount();
    /**
     * <code>repeated int32 initParamList = 5;</code>
     *
     * <pre>
     * 初始化参数
     * </pre>
     */
    int getInitParamList(int index);
  }
  /**
   * Protobuf type {@code GameInit}
   */
  public static final class GameInit extends
      com.google.protobuf.GeneratedMessage
      implements GameInitOrBuilder {
    // Use GameInit.newBuilder() to construct.
    private GameInit(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GameInit(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GameInit defaultInstance;
    public static GameInit getDefaultInstance() {
      return defaultInstance;
    }

    public GameInit getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GameInit(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              keyId_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              desc_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              initType_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              initSubType_ = input.readInt32();
              break;
            }
            case 40: {
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                initParamList_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000010;
              }
              initParamList_.add(input.readInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010) && input.getBytesUntilLimit() > 0) {
                initParamList_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000010;
              }
              while (input.getBytesUntilLimit() > 0) {
                initParamList_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          initParamList_ = java.util.Collections.unmodifiableList(initParamList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cwa.prototype.protobuf.GameinitProbuf.internal_static_GameInit_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cwa.prototype.protobuf.GameinitProbuf.internal_static_GameInit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cwa.prototype.protobuf.GameinitProbuf.GameInit.class, com.cwa.prototype.protobuf.GameinitProbuf.GameInit.Builder.class);
    }

    public static com.google.protobuf.Parser<GameInit> PARSER =
        new com.google.protobuf.AbstractParser<GameInit>() {
      public GameInit parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GameInit(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GameInit> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 keyId = 1;
    public static final int KEYID_FIELD_NUMBER = 1;
    private int keyId_;
    /**
     * <code>required int32 keyId = 1;</code>
     *
     * <pre>
     * 初始化
     * </pre>
     */
    public boolean hasKeyId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 keyId = 1;</code>
     *
     * <pre>
     * 初始化
     * </pre>
     */
    public int getKeyId() {
      return keyId_;
    }

    // required string desc = 2;
    public static final int DESC_FIELD_NUMBER = 2;
    private java.lang.Object desc_;
    /**
     * <code>required string desc = 2;</code>
     *
     * <pre>
     * 初始化说明
     * </pre>
     */
    public boolean hasDesc() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string desc = 2;</code>
     *
     * <pre>
     * 初始化说明
     * </pre>
     */
    public java.lang.String getDesc() {
      java.lang.Object ref = desc_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          desc_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string desc = 2;</code>
     *
     * <pre>
     * 初始化说明
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDescBytes() {
      java.lang.Object ref = desc_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        desc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required int32 initType = 3;
    public static final int INITTYPE_FIELD_NUMBER = 3;
    private int initType_;
    /**
     * <code>required int32 initType = 3;</code>
     *
     * <pre>
     * 初始化类型
     * </pre>
     */
    public boolean hasInitType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 initType = 3;</code>
     *
     * <pre>
     * 初始化类型
     * </pre>
     */
    public int getInitType() {
      return initType_;
    }

    // required int32 initSubType = 4;
    public static final int INITSUBTYPE_FIELD_NUMBER = 4;
    private int initSubType_;
    /**
     * <code>required int32 initSubType = 4;</code>
     *
     * <pre>
     * 初始化子类型
     * </pre>
     */
    public boolean hasInitSubType() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 initSubType = 4;</code>
     *
     * <pre>
     * 初始化子类型
     * </pre>
     */
    public int getInitSubType() {
      return initSubType_;
    }

    // repeated int32 initParamList = 5;
    public static final int INITPARAMLIST_FIELD_NUMBER = 5;
    private java.util.List<java.lang.Integer> initParamList_;
    /**
     * <code>repeated int32 initParamList = 5;</code>
     *
     * <pre>
     * 初始化参数
     * </pre>
     */
    public java.util.List<java.lang.Integer>
        getInitParamListList() {
      return initParamList_;
    }
    /**
     * <code>repeated int32 initParamList = 5;</code>
     *
     * <pre>
     * 初始化参数
     * </pre>
     */
    public int getInitParamListCount() {
      return initParamList_.size();
    }
    /**
     * <code>repeated int32 initParamList = 5;</code>
     *
     * <pre>
     * 初始化参数
     * </pre>
     */
    public int getInitParamList(int index) {
      return initParamList_.get(index);
    }

    private void initFields() {
      keyId_ = 0;
      desc_ = "";
      initType_ = 0;
      initSubType_ = 0;
      initParamList_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasKeyId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasDesc()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasInitType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasInitSubType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, keyId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getDescBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, initType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, initSubType_);
      }
      for (int i = 0; i < initParamList_.size(); i++) {
        output.writeInt32(5, initParamList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, keyId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getDescBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, initType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, initSubType_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < initParamList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(initParamList_.get(i));
        }
        size += dataSize;
        size += 1 * getInitParamListList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.cwa.prototype.protobuf.GameinitProbuf.GameInit parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cwa.prototype.protobuf.GameinitProbuf.GameInit parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cwa.prototype.protobuf.GameinitProbuf.GameInit parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cwa.prototype.protobuf.GameinitProbuf.GameInit parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cwa.prototype.protobuf.GameinitProbuf.GameInit parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.cwa.prototype.protobuf.GameinitProbuf.GameInit parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.cwa.prototype.protobuf.GameinitProbuf.GameInit parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.cwa.prototype.protobuf.GameinitProbuf.GameInit parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.cwa.prototype.protobuf.GameinitProbuf.GameInit parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.cwa.prototype.protobuf.GameinitProbuf.GameInit parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.cwa.prototype.protobuf.GameinitProbuf.GameInit prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code GameInit}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.cwa.prototype.protobuf.GameinitProbuf.GameInitOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cwa.prototype.protobuf.GameinitProbuf.internal_static_GameInit_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cwa.prototype.protobuf.GameinitProbuf.internal_static_GameInit_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.cwa.prototype.protobuf.GameinitProbuf.GameInit.class, com.cwa.prototype.protobuf.GameinitProbuf.GameInit.Builder.class);
      }

      // Construct using com.cwa.prototype.protobuf.GameinitProbuf.GameInit.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        keyId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        desc_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        initType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        initSubType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        initParamList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cwa.prototype.protobuf.GameinitProbuf.internal_static_GameInit_descriptor;
      }

      public com.cwa.prototype.protobuf.GameinitProbuf.GameInit getDefaultInstanceForType() {
        return com.cwa.prototype.protobuf.GameinitProbuf.GameInit.getDefaultInstance();
      }

      public com.cwa.prototype.protobuf.GameinitProbuf.GameInit build() {
        com.cwa.prototype.protobuf.GameinitProbuf.GameInit result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.cwa.prototype.protobuf.GameinitProbuf.GameInit buildPartial() {
        com.cwa.prototype.protobuf.GameinitProbuf.GameInit result = new com.cwa.prototype.protobuf.GameinitProbuf.GameInit(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.keyId_ = keyId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.desc_ = desc_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.initType_ = initType_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.initSubType_ = initSubType_;
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          initParamList_ = java.util.Collections.unmodifiableList(initParamList_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.initParamList_ = initParamList_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.cwa.prototype.protobuf.GameinitProbuf.GameInit) {
          return mergeFrom((com.cwa.prototype.protobuf.GameinitProbuf.GameInit)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.cwa.prototype.protobuf.GameinitProbuf.GameInit other) {
        if (other == com.cwa.prototype.protobuf.GameinitProbuf.GameInit.getDefaultInstance()) return this;
        if (other.hasKeyId()) {
          setKeyId(other.getKeyId());
        }
        if (other.hasDesc()) {
          bitField0_ |= 0x00000002;
          desc_ = other.desc_;
          onChanged();
        }
        if (other.hasInitType()) {
          setInitType(other.getInitType());
        }
        if (other.hasInitSubType()) {
          setInitSubType(other.getInitSubType());
        }
        if (!other.initParamList_.isEmpty()) {
          if (initParamList_.isEmpty()) {
            initParamList_ = other.initParamList_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureInitParamListIsMutable();
            initParamList_.addAll(other.initParamList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasKeyId()) {
          
          return false;
        }
        if (!hasDesc()) {
          
          return false;
        }
        if (!hasInitType()) {
          
          return false;
        }
        if (!hasInitSubType()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.cwa.prototype.protobuf.GameinitProbuf.GameInit parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.cwa.prototype.protobuf.GameinitProbuf.GameInit) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 keyId = 1;
      private int keyId_ ;
      /**
       * <code>required int32 keyId = 1;</code>
       *
       * <pre>
       * 初始化
       * </pre>
       */
      public boolean hasKeyId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 keyId = 1;</code>
       *
       * <pre>
       * 初始化
       * </pre>
       */
      public int getKeyId() {
        return keyId_;
      }
      /**
       * <code>required int32 keyId = 1;</code>
       *
       * <pre>
       * 初始化
       * </pre>
       */
      public Builder setKeyId(int value) {
        bitField0_ |= 0x00000001;
        keyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 keyId = 1;</code>
       *
       * <pre>
       * 初始化
       * </pre>
       */
      public Builder clearKeyId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        keyId_ = 0;
        onChanged();
        return this;
      }

      // required string desc = 2;
      private java.lang.Object desc_ = "";
      /**
       * <code>required string desc = 2;</code>
       *
       * <pre>
       * 初始化说明
       * </pre>
       */
      public boolean hasDesc() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string desc = 2;</code>
       *
       * <pre>
       * 初始化说明
       * </pre>
       */
      public java.lang.String getDesc() {
        java.lang.Object ref = desc_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          desc_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string desc = 2;</code>
       *
       * <pre>
       * 初始化说明
       * </pre>
       */
      public com.google.protobuf.ByteString
          getDescBytes() {
        java.lang.Object ref = desc_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          desc_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string desc = 2;</code>
       *
       * <pre>
       * 初始化说明
       * </pre>
       */
      public Builder setDesc(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        desc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string desc = 2;</code>
       *
       * <pre>
       * 初始化说明
       * </pre>
       */
      public Builder clearDesc() {
        bitField0_ = (bitField0_ & ~0x00000002);
        desc_ = getDefaultInstance().getDesc();
        onChanged();
        return this;
      }
      /**
       * <code>required string desc = 2;</code>
       *
       * <pre>
       * 初始化说明
       * </pre>
       */
      public Builder setDescBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        desc_ = value;
        onChanged();
        return this;
      }

      // required int32 initType = 3;
      private int initType_ ;
      /**
       * <code>required int32 initType = 3;</code>
       *
       * <pre>
       * 初始化类型
       * </pre>
       */
      public boolean hasInitType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 initType = 3;</code>
       *
       * <pre>
       * 初始化类型
       * </pre>
       */
      public int getInitType() {
        return initType_;
      }
      /**
       * <code>required int32 initType = 3;</code>
       *
       * <pre>
       * 初始化类型
       * </pre>
       */
      public Builder setInitType(int value) {
        bitField0_ |= 0x00000004;
        initType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 initType = 3;</code>
       *
       * <pre>
       * 初始化类型
       * </pre>
       */
      public Builder clearInitType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        initType_ = 0;
        onChanged();
        return this;
      }

      // required int32 initSubType = 4;
      private int initSubType_ ;
      /**
       * <code>required int32 initSubType = 4;</code>
       *
       * <pre>
       * 初始化子类型
       * </pre>
       */
      public boolean hasInitSubType() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 initSubType = 4;</code>
       *
       * <pre>
       * 初始化子类型
       * </pre>
       */
      public int getInitSubType() {
        return initSubType_;
      }
      /**
       * <code>required int32 initSubType = 4;</code>
       *
       * <pre>
       * 初始化子类型
       * </pre>
       */
      public Builder setInitSubType(int value) {
        bitField0_ |= 0x00000008;
        initSubType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 initSubType = 4;</code>
       *
       * <pre>
       * 初始化子类型
       * </pre>
       */
      public Builder clearInitSubType() {
        bitField0_ = (bitField0_ & ~0x00000008);
        initSubType_ = 0;
        onChanged();
        return this;
      }

      // repeated int32 initParamList = 5;
      private java.util.List<java.lang.Integer> initParamList_ = java.util.Collections.emptyList();
      private void ensureInitParamListIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          initParamList_ = new java.util.ArrayList<java.lang.Integer>(initParamList_);
          bitField0_ |= 0x00000010;
         }
      }
      /**
       * <code>repeated int32 initParamList = 5;</code>
       *
       * <pre>
       * 初始化参数
       * </pre>
       */
      public java.util.List<java.lang.Integer>
          getInitParamListList() {
        return java.util.Collections.unmodifiableList(initParamList_);
      }
      /**
       * <code>repeated int32 initParamList = 5;</code>
       *
       * <pre>
       * 初始化参数
       * </pre>
       */
      public int getInitParamListCount() {
        return initParamList_.size();
      }
      /**
       * <code>repeated int32 initParamList = 5;</code>
       *
       * <pre>
       * 初始化参数
       * </pre>
       */
      public int getInitParamList(int index) {
        return initParamList_.get(index);
      }
      /**
       * <code>repeated int32 initParamList = 5;</code>
       *
       * <pre>
       * 初始化参数
       * </pre>
       */
      public Builder setInitParamList(
          int index, int value) {
        ensureInitParamListIsMutable();
        initParamList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 initParamList = 5;</code>
       *
       * <pre>
       * 初始化参数
       * </pre>
       */
      public Builder addInitParamList(int value) {
        ensureInitParamListIsMutable();
        initParamList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 initParamList = 5;</code>
       *
       * <pre>
       * 初始化参数
       * </pre>
       */
      public Builder addAllInitParamList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureInitParamListIsMutable();
        super.addAll(values, initParamList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 initParamList = 5;</code>
       *
       * <pre>
       * 初始化参数
       * </pre>
       */
      public Builder clearInitParamList() {
        initParamList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:GameInit)
    }

    static {
      defaultInstance = new GameInit(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:GameInit)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_GameInit_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GameInit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024GameinitProbuf.proto\"e\n\010GameInit\022\r\n\005ke" +
      "yId\030\001 \002(\005\022\014\n\004desc\030\002 \002(\t\022\020\n\010initType\030\003 \002(" +
      "\005\022\023\n\013initSubType\030\004 \002(\005\022\025\n\rinitParamList\030" +
      "\005 \003(\005B,\n\032com.cwa.prototype.protobufB\016Gam" +
      "einitProbuf"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_GameInit_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_GameInit_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_GameInit_descriptor,
              new java.lang.String[] { "KeyId", "Desc", "InitType", "InitSubType", "InitParamList", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
