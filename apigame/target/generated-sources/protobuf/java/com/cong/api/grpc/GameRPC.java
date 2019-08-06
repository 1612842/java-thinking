// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gRPC.proto

package com.cong.api.grpc;

/**
 * Protobuf type {@code com.cong.api.grpc.GameRPC}
 */
public  final class GameRPC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.cong.api.grpc.GameRPC)
    GameRPCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameRPC.newBuilder() to construct.
  private GameRPC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameRPC() {
    id_ = 0L;
    createdAt_ = "";
    rounds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GameRPC(
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

            id_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            createdAt_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              rounds_ = new java.util.ArrayList<com.cong.api.grpc.RoundRPC>();
              mutable_bitField0_ |= 0x00000004;
            }
            rounds_.add(
                input.readMessage(com.cong.api.grpc.RoundRPC.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        rounds_ = java.util.Collections.unmodifiableList(rounds_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cong.api.grpc.GRPC.internal_static_com_cong_api_grpc_GameRPC_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cong.api.grpc.GRPC.internal_static_com_cong_api_grpc_GameRPC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cong.api.grpc.GameRPC.class, com.cong.api.grpc.GameRPC.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int CREATEDAT_FIELD_NUMBER = 2;
  private volatile java.lang.Object createdAt_;
  /**
   * <code>string createdAt = 2;</code>
   */
  public java.lang.String getCreatedAt() {
    java.lang.Object ref = createdAt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      createdAt_ = s;
      return s;
    }
  }
  /**
   * <code>string createdAt = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCreatedAtBytes() {
    java.lang.Object ref = createdAt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      createdAt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROUNDS_FIELD_NUMBER = 3;
  private java.util.List<com.cong.api.grpc.RoundRPC> rounds_;
  /**
   * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
   */
  public java.util.List<com.cong.api.grpc.RoundRPC> getRoundsList() {
    return rounds_;
  }
  /**
   * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
   */
  public java.util.List<? extends com.cong.api.grpc.RoundRPCOrBuilder> 
      getRoundsOrBuilderList() {
    return rounds_;
  }
  /**
   * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
   */
  public int getRoundsCount() {
    return rounds_.size();
  }
  /**
   * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
   */
  public com.cong.api.grpc.RoundRPC getRounds(int index) {
    return rounds_.get(index);
  }
  /**
   * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
   */
  public com.cong.api.grpc.RoundRPCOrBuilder getRoundsOrBuilder(
      int index) {
    return rounds_.get(index);
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!getCreatedAtBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, createdAt_);
    }
    for (int i = 0; i < rounds_.size(); i++) {
      output.writeMessage(3, rounds_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!getCreatedAtBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, createdAt_);
    }
    for (int i = 0; i < rounds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, rounds_.get(i));
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
    if (!(obj instanceof com.cong.api.grpc.GameRPC)) {
      return super.equals(obj);
    }
    com.cong.api.grpc.GameRPC other = (com.cong.api.grpc.GameRPC) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getCreatedAt()
        .equals(other.getCreatedAt());
    result = result && getRoundsList()
        .equals(other.getRoundsList());
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + CREATEDAT_FIELD_NUMBER;
    hash = (53 * hash) + getCreatedAt().hashCode();
    if (getRoundsCount() > 0) {
      hash = (37 * hash) + ROUNDS_FIELD_NUMBER;
      hash = (53 * hash) + getRoundsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cong.api.grpc.GameRPC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cong.api.grpc.GameRPC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cong.api.grpc.GameRPC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cong.api.grpc.GameRPC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cong.api.grpc.GameRPC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cong.api.grpc.GameRPC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cong.api.grpc.GameRPC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cong.api.grpc.GameRPC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cong.api.grpc.GameRPC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.cong.api.grpc.GameRPC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cong.api.grpc.GameRPC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cong.api.grpc.GameRPC parseFrom(
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
  public static Builder newBuilder(com.cong.api.grpc.GameRPC prototype) {
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
   * Protobuf type {@code com.cong.api.grpc.GameRPC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.cong.api.grpc.GameRPC)
      com.cong.api.grpc.GameRPCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cong.api.grpc.GRPC.internal_static_com_cong_api_grpc_GameRPC_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cong.api.grpc.GRPC.internal_static_com_cong_api_grpc_GameRPC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cong.api.grpc.GameRPC.class, com.cong.api.grpc.GameRPC.Builder.class);
    }

    // Construct using com.cong.api.grpc.GameRPC.newBuilder()
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
        getRoundsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0L;

      createdAt_ = "";

      if (roundsBuilder_ == null) {
        rounds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        roundsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cong.api.grpc.GRPC.internal_static_com_cong_api_grpc_GameRPC_descriptor;
    }

    public com.cong.api.grpc.GameRPC getDefaultInstanceForType() {
      return com.cong.api.grpc.GameRPC.getDefaultInstance();
    }

    public com.cong.api.grpc.GameRPC build() {
      com.cong.api.grpc.GameRPC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.cong.api.grpc.GameRPC buildPartial() {
      com.cong.api.grpc.GameRPC result = new com.cong.api.grpc.GameRPC(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.createdAt_ = createdAt_;
      if (roundsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          rounds_ = java.util.Collections.unmodifiableList(rounds_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.rounds_ = rounds_;
      } else {
        result.rounds_ = roundsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.cong.api.grpc.GameRPC) {
        return mergeFrom((com.cong.api.grpc.GameRPC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cong.api.grpc.GameRPC other) {
      if (other == com.cong.api.grpc.GameRPC.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getCreatedAt().isEmpty()) {
        createdAt_ = other.createdAt_;
        onChanged();
      }
      if (roundsBuilder_ == null) {
        if (!other.rounds_.isEmpty()) {
          if (rounds_.isEmpty()) {
            rounds_ = other.rounds_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureRoundsIsMutable();
            rounds_.addAll(other.rounds_);
          }
          onChanged();
        }
      } else {
        if (!other.rounds_.isEmpty()) {
          if (roundsBuilder_.isEmpty()) {
            roundsBuilder_.dispose();
            roundsBuilder_ = null;
            rounds_ = other.rounds_;
            bitField0_ = (bitField0_ & ~0x00000004);
            roundsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRoundsFieldBuilder() : null;
          } else {
            roundsBuilder_.addAllMessages(other.rounds_);
          }
        }
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
      com.cong.api.grpc.GameRPC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.cong.api.grpc.GameRPC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object createdAt_ = "";
    /**
     * <code>string createdAt = 2;</code>
     */
    public java.lang.String getCreatedAt() {
      java.lang.Object ref = createdAt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createdAt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string createdAt = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCreatedAtBytes() {
      java.lang.Object ref = createdAt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createdAt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string createdAt = 2;</code>
     */
    public Builder setCreatedAt(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      createdAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string createdAt = 2;</code>
     */
    public Builder clearCreatedAt() {
      
      createdAt_ = getDefaultInstance().getCreatedAt();
      onChanged();
      return this;
    }
    /**
     * <code>string createdAt = 2;</code>
     */
    public Builder setCreatedAtBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      createdAt_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.cong.api.grpc.RoundRPC> rounds_ =
      java.util.Collections.emptyList();
    private void ensureRoundsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        rounds_ = new java.util.ArrayList<com.cong.api.grpc.RoundRPC>(rounds_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cong.api.grpc.RoundRPC, com.cong.api.grpc.RoundRPC.Builder, com.cong.api.grpc.RoundRPCOrBuilder> roundsBuilder_;

    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public java.util.List<com.cong.api.grpc.RoundRPC> getRoundsList() {
      if (roundsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rounds_);
      } else {
        return roundsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public int getRoundsCount() {
      if (roundsBuilder_ == null) {
        return rounds_.size();
      } else {
        return roundsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public com.cong.api.grpc.RoundRPC getRounds(int index) {
      if (roundsBuilder_ == null) {
        return rounds_.get(index);
      } else {
        return roundsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public Builder setRounds(
        int index, com.cong.api.grpc.RoundRPC value) {
      if (roundsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoundsIsMutable();
        rounds_.set(index, value);
        onChanged();
      } else {
        roundsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public Builder setRounds(
        int index, com.cong.api.grpc.RoundRPC.Builder builderForValue) {
      if (roundsBuilder_ == null) {
        ensureRoundsIsMutable();
        rounds_.set(index, builderForValue.build());
        onChanged();
      } else {
        roundsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public Builder addRounds(com.cong.api.grpc.RoundRPC value) {
      if (roundsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoundsIsMutable();
        rounds_.add(value);
        onChanged();
      } else {
        roundsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public Builder addRounds(
        int index, com.cong.api.grpc.RoundRPC value) {
      if (roundsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRoundsIsMutable();
        rounds_.add(index, value);
        onChanged();
      } else {
        roundsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public Builder addRounds(
        com.cong.api.grpc.RoundRPC.Builder builderForValue) {
      if (roundsBuilder_ == null) {
        ensureRoundsIsMutable();
        rounds_.add(builderForValue.build());
        onChanged();
      } else {
        roundsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public Builder addRounds(
        int index, com.cong.api.grpc.RoundRPC.Builder builderForValue) {
      if (roundsBuilder_ == null) {
        ensureRoundsIsMutable();
        rounds_.add(index, builderForValue.build());
        onChanged();
      } else {
        roundsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public Builder addAllRounds(
        java.lang.Iterable<? extends com.cong.api.grpc.RoundRPC> values) {
      if (roundsBuilder_ == null) {
        ensureRoundsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rounds_);
        onChanged();
      } else {
        roundsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public Builder clearRounds() {
      if (roundsBuilder_ == null) {
        rounds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        roundsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public Builder removeRounds(int index) {
      if (roundsBuilder_ == null) {
        ensureRoundsIsMutable();
        rounds_.remove(index);
        onChanged();
      } else {
        roundsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public com.cong.api.grpc.RoundRPC.Builder getRoundsBuilder(
        int index) {
      return getRoundsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public com.cong.api.grpc.RoundRPCOrBuilder getRoundsOrBuilder(
        int index) {
      if (roundsBuilder_ == null) {
        return rounds_.get(index);  } else {
        return roundsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public java.util.List<? extends com.cong.api.grpc.RoundRPCOrBuilder> 
         getRoundsOrBuilderList() {
      if (roundsBuilder_ != null) {
        return roundsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rounds_);
      }
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public com.cong.api.grpc.RoundRPC.Builder addRoundsBuilder() {
      return getRoundsFieldBuilder().addBuilder(
          com.cong.api.grpc.RoundRPC.getDefaultInstance());
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public com.cong.api.grpc.RoundRPC.Builder addRoundsBuilder(
        int index) {
      return getRoundsFieldBuilder().addBuilder(
          index, com.cong.api.grpc.RoundRPC.getDefaultInstance());
    }
    /**
     * <code>repeated .com.cong.api.grpc.RoundRPC rounds = 3;</code>
     */
    public java.util.List<com.cong.api.grpc.RoundRPC.Builder> 
         getRoundsBuilderList() {
      return getRoundsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cong.api.grpc.RoundRPC, com.cong.api.grpc.RoundRPC.Builder, com.cong.api.grpc.RoundRPCOrBuilder> 
        getRoundsFieldBuilder() {
      if (roundsBuilder_ == null) {
        roundsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cong.api.grpc.RoundRPC, com.cong.api.grpc.RoundRPC.Builder, com.cong.api.grpc.RoundRPCOrBuilder>(
                rounds_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        rounds_ = null;
      }
      return roundsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.cong.api.grpc.GameRPC)
  }

  // @@protoc_insertion_point(class_scope:com.cong.api.grpc.GameRPC)
  private static final com.cong.api.grpc.GameRPC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cong.api.grpc.GameRPC();
  }

  public static com.cong.api.grpc.GameRPC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameRPC>
      PARSER = new com.google.protobuf.AbstractParser<GameRPC>() {
    public GameRPC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GameRPC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GameRPC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameRPC> getParserForType() {
    return PARSER;
  }

  public com.cong.api.grpc.GameRPC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

