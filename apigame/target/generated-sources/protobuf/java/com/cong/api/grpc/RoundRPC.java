// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gRPC.proto

package com.cong.api.grpc;

/**
 * Protobuf type {@code com.cong.api.grpc.RoundRPC}
 */
public  final class RoundRPC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.cong.api.grpc.RoundRPC)
    RoundRPCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoundRPC.newBuilder() to construct.
  private RoundRPC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoundRPC() {
    machineChoice_ = 0;
    userChoice_ = 0;
    result_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RoundRPC(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            machineChoice_ = input.readInt32();
            break;
          }
          case 16: {

            userChoice_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            result_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cong.api.grpc.GRPC.internal_static_com_cong_api_grpc_RoundRPC_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cong.api.grpc.GRPC.internal_static_com_cong_api_grpc_RoundRPC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cong.api.grpc.RoundRPC.class, com.cong.api.grpc.RoundRPC.Builder.class);
  }

  public static final int MACHINECHOICE_FIELD_NUMBER = 1;
  private int machineChoice_;
  /**
   * <code>int32 machineChoice = 1;</code>
   */
  public int getMachineChoice() {
    return machineChoice_;
  }

  public static final int USERCHOICE_FIELD_NUMBER = 2;
  private int userChoice_;
  /**
   * <code>int32 userChoice = 2;</code>
   */
  public int getUserChoice() {
    return userChoice_;
  }

  public static final int RESULT_FIELD_NUMBER = 3;
  private volatile java.lang.Object result_;
  /**
   * <code>string result = 3;</code>
   */
  public java.lang.String getResult() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      result_ = s;
      return s;
    }
  }
  /**
   * <code>string result = 3;</code>
   */
  public com.google.protobuf.ByteString
      getResultBytes() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      result_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (machineChoice_ != 0) {
      output.writeInt32(1, machineChoice_);
    }
    if (userChoice_ != 0) {
      output.writeInt32(2, userChoice_);
    }
    if (!getResultBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, result_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (machineChoice_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, machineChoice_);
    }
    if (userChoice_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, userChoice_);
    }
    if (!getResultBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, result_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.cong.api.grpc.RoundRPC)) {
      return super.equals(obj);
    }
    com.cong.api.grpc.RoundRPC other = (com.cong.api.grpc.RoundRPC) obj;

    boolean result = true;
    result = result && (getMachineChoice()
        == other.getMachineChoice());
    result = result && (getUserChoice()
        == other.getUserChoice());
    result = result && getResult()
        .equals(other.getResult());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MACHINECHOICE_FIELD_NUMBER;
    hash = (53 * hash) + getMachineChoice();
    hash = (37 * hash) + USERCHOICE_FIELD_NUMBER;
    hash = (53 * hash) + getUserChoice();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cong.api.grpc.RoundRPC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cong.api.grpc.RoundRPC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cong.api.grpc.RoundRPC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cong.api.grpc.RoundRPC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cong.api.grpc.RoundRPC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cong.api.grpc.RoundRPC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cong.api.grpc.RoundRPC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cong.api.grpc.RoundRPC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cong.api.grpc.RoundRPC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cong.api.grpc.RoundRPC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cong.api.grpc.RoundRPC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cong.api.grpc.RoundRPC parseFrom(
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
  public static Builder newBuilder(com.cong.api.grpc.RoundRPC prototype) {
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
   * Protobuf type {@code com.cong.api.grpc.RoundRPC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.cong.api.grpc.RoundRPC)
      com.cong.api.grpc.RoundRPCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cong.api.grpc.GRPC.internal_static_com_cong_api_grpc_RoundRPC_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cong.api.grpc.GRPC.internal_static_com_cong_api_grpc_RoundRPC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cong.api.grpc.RoundRPC.class, com.cong.api.grpc.RoundRPC.Builder.class);
    }

    // Construct using com.cong.api.grpc.RoundRPC.newBuilder()
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
      machineChoice_ = 0;

      userChoice_ = 0;

      result_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cong.api.grpc.GRPC.internal_static_com_cong_api_grpc_RoundRPC_descriptor;
    }

    public com.cong.api.grpc.RoundRPC getDefaultInstanceForType() {
      return com.cong.api.grpc.RoundRPC.getDefaultInstance();
    }

    public com.cong.api.grpc.RoundRPC build() {
      com.cong.api.grpc.RoundRPC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.cong.api.grpc.RoundRPC buildPartial() {
      com.cong.api.grpc.RoundRPC result = new com.cong.api.grpc.RoundRPC(this);
      result.machineChoice_ = machineChoice_;
      result.userChoice_ = userChoice_;
      result.result_ = result_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cong.api.grpc.RoundRPC) {
        return mergeFrom((com.cong.api.grpc.RoundRPC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cong.api.grpc.RoundRPC other) {
      if (other == com.cong.api.grpc.RoundRPC.getDefaultInstance()) return this;
      if (other.getMachineChoice() != 0) {
        setMachineChoice(other.getMachineChoice());
      }
      if (other.getUserChoice() != 0) {
        setUserChoice(other.getUserChoice());
      }
      if (!other.getResult().isEmpty()) {
        result_ = other.result_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.cong.api.grpc.RoundRPC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cong.api.grpc.RoundRPC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int machineChoice_ ;
    /**
     * <code>int32 machineChoice = 1;</code>
     */
    public int getMachineChoice() {
      return machineChoice_;
    }
    /**
     * <code>int32 machineChoice = 1;</code>
     */
    public Builder setMachineChoice(int value) {
      
      machineChoice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 machineChoice = 1;</code>
     */
    public Builder clearMachineChoice() {
      
      machineChoice_ = 0;
      onChanged();
      return this;
    }

    private int userChoice_ ;
    /**
     * <code>int32 userChoice = 2;</code>
     */
    public int getUserChoice() {
      return userChoice_;
    }
    /**
     * <code>int32 userChoice = 2;</code>
     */
    public Builder setUserChoice(int value) {
      
      userChoice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 userChoice = 2;</code>
     */
    public Builder clearUserChoice() {
      
      userChoice_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object result_ = "";
    /**
     * <code>string result = 3;</code>
     */
    public java.lang.String getResult() {
      java.lang.Object ref = result_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        result_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string result = 3;</code>
     */
    public com.google.protobuf.ByteString
        getResultBytes() {
      java.lang.Object ref = result_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string result = 3;</code>
     */
    public Builder setResult(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string result = 3;</code>
     */
    public Builder clearResult() {
      
      result_ = getDefaultInstance().getResult();
      onChanged();
      return this;
    }
    /**
     * <code>string result = 3;</code>
     */
    public Builder setResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      result_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.cong.api.grpc.RoundRPC)
  }

  // @@protoc_insertion_point(class_scope:com.cong.api.grpc.RoundRPC)
  private static final com.cong.api.grpc.RoundRPC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cong.api.grpc.RoundRPC();
  }

  public static com.cong.api.grpc.RoundRPC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoundRPC>
      PARSER = new com.google.protobuf.AbstractParser<RoundRPC>() {
    public RoundRPC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RoundRPC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RoundRPC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoundRPC> getParserForType() {
    return PARSER;
  }

  public com.cong.api.grpc.RoundRPC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

