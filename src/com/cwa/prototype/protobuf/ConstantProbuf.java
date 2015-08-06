// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConstantProbuf.proto

package com.cwa.prototype.protobuf;

public final class ConstantProbuf {
  private ConstantProbuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ConstantOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 keyId = 1;
    /**
     * <code>required int32 keyId = 1;</code>
     *
     * <pre>
     * 常量id
     * </pre>
     */
    boolean hasKeyId();
    /**
     * <code>required int32 keyId = 1;</code>
     *
     * <pre>
     * 常量id
     * </pre>
     */
    int getKeyId();

    // required string desc = 2;
    /**
     * <code>required string desc = 2;</code>
     *
     * <pre>
     * 常量说明
     * </pre>
     */
    boolean hasDesc();
    /**
     * <code>required string desc = 2;</code>
     *
     * <pre>
     * 常量说明
     * </pre>
     */
    java.lang.String getDesc();
    /**
     * <code>required string desc = 2;</code>
     *
     * <pre>
     * 常量说明
     * </pre>
     */
    com.google.protobuf.ByteString
        getDescBytes();

    // required string attributeName = 3;
    /**
     * <code>required string attributeName = 3;</code>
     *
     * <pre>
     * 变量名
     * </pre>
     */
    boolean hasAttributeName();
    /**
     * <code>required string attributeName = 3;</code>
     *
     * <pre>
     * 变量名
     * </pre>
     */
    java.lang.String getAttributeName();
    /**
     * <code>required string attributeName = 3;</code>
     *
     * <pre>
     * 变量名
     * </pre>
     */
    com.google.protobuf.ByteString
        getAttributeNameBytes();

    // required string value = 4;
    /**
     * <code>required string value = 4;</code>
     *
     * <pre>
     * 常量值
     * </pre>
     */
    boolean hasValue();
    /**
     * <code>required string value = 4;</code>
     *
     * <pre>
     * 常量值
     * </pre>
     */
    java.lang.String getValue();
    /**
     * <code>required string value = 4;</code>
     *
     * <pre>
     * 常量值
     * </pre>
     */
    com.google.protobuf.ByteString
        getValueBytes();
  }
  /**
   * Protobuf type {@code Constant}
   */
  public static final class Constant extends
      com.google.protobuf.GeneratedMessage
      implements ConstantOrBuilder {
    // Use Constant.newBuilder() to construct.
    private Constant(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Constant(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Constant defaultInstance;
    public static Constant getDefaultInstance() {
      return defaultInstance;
    }

    public Constant getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Constant(
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
            case 26: {
              bitField0_ |= 0x00000004;
              attributeName_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              value_ = input.readBytes();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cwa.prototype.protobuf.ConstantProbuf.internal_static_Constant_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cwa.prototype.protobuf.ConstantProbuf.internal_static_Constant_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cwa.prototype.protobuf.ConstantProbuf.Constant.class, com.cwa.prototype.protobuf.ConstantProbuf.Constant.Builder.class);
    }

    public static com.google.protobuf.Parser<Constant> PARSER =
        new com.google.protobuf.AbstractParser<Constant>() {
      public Constant parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Constant(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Constant> getParserForType() {
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
     * 常量id
     * </pre>
     */
    public boolean hasKeyId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 keyId = 1;</code>
     *
     * <pre>
     * 常量id
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
     * 常量说明
     * </pre>
     */
    public boolean hasDesc() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string desc = 2;</code>
     *
     * <pre>
     * 常量说明
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
     * 常量说明
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

    // required string attributeName = 3;
    public static final int ATTRIBUTENAME_FIELD_NUMBER = 3;
    private java.lang.Object attributeName_;
    /**
     * <code>required string attributeName = 3;</code>
     *
     * <pre>
     * 变量名
     * </pre>
     */
    public boolean hasAttributeName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string attributeName = 3;</code>
     *
     * <pre>
     * 变量名
     * </pre>
     */
    public java.lang.String getAttributeName() {
      java.lang.Object ref = attributeName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          attributeName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string attributeName = 3;</code>
     *
     * <pre>
     * 变量名
     * </pre>
     */
    public com.google.protobuf.ByteString
        getAttributeNameBytes() {
      java.lang.Object ref = attributeName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        attributeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string value = 4;
    public static final int VALUE_FIELD_NUMBER = 4;
    private java.lang.Object value_;
    /**
     * <code>required string value = 4;</code>
     *
     * <pre>
     * 常量值
     * </pre>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string value = 4;</code>
     *
     * <pre>
     * 常量值
     * </pre>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          value_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string value = 4;</code>
     *
     * <pre>
     * 常量值
     * </pre>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      keyId_ = 0;
      desc_ = "";
      attributeName_ = "";
      value_ = "";
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
      if (!hasAttributeName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasValue()) {
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
        output.writeBytes(3, getAttributeNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getValueBytes());
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
          .computeBytesSize(3, getAttributeNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getValueBytes());
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

    public static com.cwa.prototype.protobuf.ConstantProbuf.Constant parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cwa.prototype.protobuf.ConstantProbuf.Constant parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cwa.prototype.protobuf.ConstantProbuf.Constant parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.cwa.prototype.protobuf.ConstantProbuf.Constant parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.cwa.prototype.protobuf.ConstantProbuf.Constant parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.cwa.prototype.protobuf.ConstantProbuf.Constant parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.cwa.prototype.protobuf.ConstantProbuf.Constant parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.cwa.prototype.protobuf.ConstantProbuf.Constant parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.cwa.prototype.protobuf.ConstantProbuf.Constant parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.cwa.prototype.protobuf.ConstantProbuf.Constant parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.cwa.prototype.protobuf.ConstantProbuf.Constant prototype) {
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
     * Protobuf type {@code Constant}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.cwa.prototype.protobuf.ConstantProbuf.ConstantOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.cwa.prototype.protobuf.ConstantProbuf.internal_static_Constant_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.cwa.prototype.protobuf.ConstantProbuf.internal_static_Constant_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.cwa.prototype.protobuf.ConstantProbuf.Constant.class, com.cwa.prototype.protobuf.ConstantProbuf.Constant.Builder.class);
      }

      // Construct using com.cwa.prototype.protobuf.ConstantProbuf.Constant.newBuilder()
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
        attributeName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        value_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.cwa.prototype.protobuf.ConstantProbuf.internal_static_Constant_descriptor;
      }

      public com.cwa.prototype.protobuf.ConstantProbuf.Constant getDefaultInstanceForType() {
        return com.cwa.prototype.protobuf.ConstantProbuf.Constant.getDefaultInstance();
      }

      public com.cwa.prototype.protobuf.ConstantProbuf.Constant build() {
        com.cwa.prototype.protobuf.ConstantProbuf.Constant result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.cwa.prototype.protobuf.ConstantProbuf.Constant buildPartial() {
        com.cwa.prototype.protobuf.ConstantProbuf.Constant result = new com.cwa.prototype.protobuf.ConstantProbuf.Constant(this);
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
        result.attributeName_ = attributeName_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.value_ = value_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.cwa.prototype.protobuf.ConstantProbuf.Constant) {
          return mergeFrom((com.cwa.prototype.protobuf.ConstantProbuf.Constant)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.cwa.prototype.protobuf.ConstantProbuf.Constant other) {
        if (other == com.cwa.prototype.protobuf.ConstantProbuf.Constant.getDefaultInstance()) return this;
        if (other.hasKeyId()) {
          setKeyId(other.getKeyId());
        }
        if (other.hasDesc()) {
          bitField0_ |= 0x00000002;
          desc_ = other.desc_;
          onChanged();
        }
        if (other.hasAttributeName()) {
          bitField0_ |= 0x00000004;
          attributeName_ = other.attributeName_;
          onChanged();
        }
        if (other.hasValue()) {
          bitField0_ |= 0x00000008;
          value_ = other.value_;
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
        if (!hasAttributeName()) {
          
          return false;
        }
        if (!hasValue()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.cwa.prototype.protobuf.ConstantProbuf.Constant parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.cwa.prototype.protobuf.ConstantProbuf.Constant) e.getUnfinishedMessage();
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
       * 常量id
       * </pre>
       */
      public boolean hasKeyId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 keyId = 1;</code>
       *
       * <pre>
       * 常量id
       * </pre>
       */
      public int getKeyId() {
        return keyId_;
      }
      /**
       * <code>required int32 keyId = 1;</code>
       *
       * <pre>
       * 常量id
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
       * 常量id
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
       * 常量说明
       * </pre>
       */
      public boolean hasDesc() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string desc = 2;</code>
       *
       * <pre>
       * 常量说明
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
       * 常量说明
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
       * 常量说明
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
       * 常量说明
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
       * 常量说明
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

      // required string attributeName = 3;
      private java.lang.Object attributeName_ = "";
      /**
       * <code>required string attributeName = 3;</code>
       *
       * <pre>
       * 变量名
       * </pre>
       */
      public boolean hasAttributeName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required string attributeName = 3;</code>
       *
       * <pre>
       * 变量名
       * </pre>
       */
      public java.lang.String getAttributeName() {
        java.lang.Object ref = attributeName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          attributeName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string attributeName = 3;</code>
       *
       * <pre>
       * 变量名
       * </pre>
       */
      public com.google.protobuf.ByteString
          getAttributeNameBytes() {
        java.lang.Object ref = attributeName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          attributeName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string attributeName = 3;</code>
       *
       * <pre>
       * 变量名
       * </pre>
       */
      public Builder setAttributeName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        attributeName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string attributeName = 3;</code>
       *
       * <pre>
       * 变量名
       * </pre>
       */
      public Builder clearAttributeName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        attributeName_ = getDefaultInstance().getAttributeName();
        onChanged();
        return this;
      }
      /**
       * <code>required string attributeName = 3;</code>
       *
       * <pre>
       * 变量名
       * </pre>
       */
      public Builder setAttributeNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        attributeName_ = value;
        onChanged();
        return this;
      }

      // required string value = 4;
      private java.lang.Object value_ = "";
      /**
       * <code>required string value = 4;</code>
       *
       * <pre>
       * 常量值
       * </pre>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string value = 4;</code>
       *
       * <pre>
       * 常量值
       * </pre>
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string value = 4;</code>
       *
       * <pre>
       * 常量值
       * </pre>
       */
      public com.google.protobuf.ByteString
          getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string value = 4;</code>
       *
       * <pre>
       * 常量值
       * </pre>
       */
      public Builder setValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string value = 4;</code>
       *
       * <pre>
       * 常量值
       * </pre>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000008);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>required string value = 4;</code>
       *
       * <pre>
       * 常量值
       * </pre>
       */
      public Builder setValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        value_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Constant)
    }

    static {
      defaultInstance = new Constant(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Constant)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Constant_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Constant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ConstantProbuf.proto\"M\n\010Constant\022\r\n\005ke" +
      "yId\030\001 \002(\005\022\014\n\004desc\030\002 \002(\t\022\025\n\rattributeName" +
      "\030\003 \002(\t\022\r\n\005value\030\004 \002(\tB,\n\032com.cwa.prototy" +
      "pe.protobufB\016ConstantProbuf"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Constant_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Constant_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Constant_descriptor,
              new java.lang.String[] { "KeyId", "Desc", "AttributeName", "Value", });
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