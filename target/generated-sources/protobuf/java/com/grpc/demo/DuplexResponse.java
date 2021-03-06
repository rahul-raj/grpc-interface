// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.grpc.demo;

/**
 * <pre>
 * response format for bidirectional streaming example
 * </pre>
 *
 * Protobuf type {@code grpcdemo.DuplexResponse}
 */
public  final class DuplexResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpcdemo.DuplexResponse)
    DuplexResponseOrBuilder {
  // Use DuplexResponse.newBuilder() to construct.
  private DuplexResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DuplexResponse() {
    itemName_ = "";
    itemPrice_ = 0;
    isAvailable_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DuplexResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            itemName_ = s;
            break;
          }
          case 16: {

            itemPrice_ = input.readInt32();
            break;
          }
          case 24: {

            isAvailable_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.demo.Hello.internal_static_grpcdemo_DuplexResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.demo.Hello.internal_static_grpcdemo_DuplexResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.demo.DuplexResponse.class, com.grpc.demo.DuplexResponse.Builder.class);
  }

  public static final int ITEMNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object itemName_;
  /**
   * <code>string itemName = 1;</code>
   */
  public java.lang.String getItemName() {
    java.lang.Object ref = itemName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemName_ = s;
      return s;
    }
  }
  /**
   * <code>string itemName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getItemNameBytes() {
    java.lang.Object ref = itemName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEMPRICE_FIELD_NUMBER = 2;
  private int itemPrice_;
  /**
   * <code>int32 itemPrice = 2;</code>
   */
  public int getItemPrice() {
    return itemPrice_;
  }

  public static final int ISAVAILABLE_FIELD_NUMBER = 3;
  private boolean isAvailable_;
  /**
   * <code>bool isAvailable = 3;</code>
   */
  public boolean getIsAvailable() {
    return isAvailable_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getItemNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, itemName_);
    }
    if (itemPrice_ != 0) {
      output.writeInt32(2, itemPrice_);
    }
    if (isAvailable_ != false) {
      output.writeBool(3, isAvailable_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getItemNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, itemName_);
    }
    if (itemPrice_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, itemPrice_);
    }
    if (isAvailable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isAvailable_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpc.demo.DuplexResponse)) {
      return super.equals(obj);
    }
    com.grpc.demo.DuplexResponse other = (com.grpc.demo.DuplexResponse) obj;

    boolean result = true;
    result = result && getItemName()
        .equals(other.getItemName());
    result = result && (getItemPrice()
        == other.getItemPrice());
    result = result && (getIsAvailable()
        == other.getIsAvailable());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ITEMNAME_FIELD_NUMBER;
    hash = (53 * hash) + getItemName().hashCode();
    hash = (37 * hash) + ITEMPRICE_FIELD_NUMBER;
    hash = (53 * hash) + getItemPrice();
    hash = (37 * hash) + ISAVAILABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsAvailable());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.demo.DuplexResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.demo.DuplexResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.demo.DuplexResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.demo.DuplexResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.demo.DuplexResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.demo.DuplexResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.demo.DuplexResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.demo.DuplexResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.demo.DuplexResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.demo.DuplexResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.demo.DuplexResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.demo.DuplexResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpc.demo.DuplexResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * response format for bidirectional streaming example
   * </pre>
   *
   * Protobuf type {@code grpcdemo.DuplexResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpcdemo.DuplexResponse)
      com.grpc.demo.DuplexResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.demo.Hello.internal_static_grpcdemo_DuplexResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.demo.Hello.internal_static_grpcdemo_DuplexResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.demo.DuplexResponse.class, com.grpc.demo.DuplexResponse.Builder.class);
    }

    // Construct using com.grpc.demo.DuplexResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      itemName_ = "";

      itemPrice_ = 0;

      isAvailable_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.demo.Hello.internal_static_grpcdemo_DuplexResponse_descriptor;
    }

    public com.grpc.demo.DuplexResponse getDefaultInstanceForType() {
      return com.grpc.demo.DuplexResponse.getDefaultInstance();
    }

    public com.grpc.demo.DuplexResponse build() {
      com.grpc.demo.DuplexResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.grpc.demo.DuplexResponse buildPartial() {
      com.grpc.demo.DuplexResponse result = new com.grpc.demo.DuplexResponse(this);
      result.itemName_ = itemName_;
      result.itemPrice_ = itemPrice_;
      result.isAvailable_ = isAvailable_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.demo.DuplexResponse) {
        return mergeFrom((com.grpc.demo.DuplexResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.demo.DuplexResponse other) {
      if (other == com.grpc.demo.DuplexResponse.getDefaultInstance()) return this;
      if (!other.getItemName().isEmpty()) {
        itemName_ = other.itemName_;
        onChanged();
      }
      if (other.getItemPrice() != 0) {
        setItemPrice(other.getItemPrice());
      }
      if (other.getIsAvailable() != false) {
        setIsAvailable(other.getIsAvailable());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.grpc.demo.DuplexResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.demo.DuplexResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object itemName_ = "";
    /**
     * <code>string itemName = 1;</code>
     */
    public java.lang.String getItemName() {
      java.lang.Object ref = itemName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string itemName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getItemNameBytes() {
      java.lang.Object ref = itemName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string itemName = 1;</code>
     */
    public Builder setItemName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string itemName = 1;</code>
     */
    public Builder clearItemName() {
      
      itemName_ = getDefaultInstance().getItemName();
      onChanged();
      return this;
    }
    /**
     * <code>string itemName = 1;</code>
     */
    public Builder setItemNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemName_ = value;
      onChanged();
      return this;
    }

    private int itemPrice_ ;
    /**
     * <code>int32 itemPrice = 2;</code>
     */
    public int getItemPrice() {
      return itemPrice_;
    }
    /**
     * <code>int32 itemPrice = 2;</code>
     */
    public Builder setItemPrice(int value) {
      
      itemPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 itemPrice = 2;</code>
     */
    public Builder clearItemPrice() {
      
      itemPrice_ = 0;
      onChanged();
      return this;
    }

    private boolean isAvailable_ ;
    /**
     * <code>bool isAvailable = 3;</code>
     */
    public boolean getIsAvailable() {
      return isAvailable_;
    }
    /**
     * <code>bool isAvailable = 3;</code>
     */
    public Builder setIsAvailable(boolean value) {
      
      isAvailable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isAvailable = 3;</code>
     */
    public Builder clearIsAvailable() {
      
      isAvailable_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpcdemo.DuplexResponse)
  }

  // @@protoc_insertion_point(class_scope:grpcdemo.DuplexResponse)
  private static final com.grpc.demo.DuplexResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.demo.DuplexResponse();
  }

  public static com.grpc.demo.DuplexResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DuplexResponse>
      PARSER = new com.google.protobuf.AbstractParser<DuplexResponse>() {
    public DuplexResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DuplexResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DuplexResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DuplexResponse> getParserForType() {
    return PARSER;
  }

  public com.grpc.demo.DuplexResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

