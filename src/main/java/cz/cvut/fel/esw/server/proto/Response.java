// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto

package cz.cvut.fel.esw.server.proto;

/**
 * Protobuf type {@code Response}
 */
public final class Response extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Response)
    ResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Response.newBuilder() to construct.
  private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Response() {
    status_ = 0;
    errMsg_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Response();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Response(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 16: {

            counter_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            errMsg_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return cz.cvut.fel.esw.server.proto.Schema.internal_static_Response_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cz.cvut.fel.esw.server.proto.Schema.internal_static_Response_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cz.cvut.fel.esw.server.proto.Response.class, cz.cvut.fel.esw.server.proto.Response.Builder.class);
  }

  /**
   * Protobuf enum {@code Response.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OK = 0;</code>
     */
    OK(0),
    /**
     * <code>ERROR = 1;</code>
     */
    ERROR(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OK = 0;</code>
     */
    public static final int OK_VALUE = 0;
    /**
     * <code>ERROR = 1;</code>
     */
    public static final int ERROR_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Status forNumber(int value) {
      switch (value) {
        case 0: return OK;
        case 1: return ERROR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return cz.cvut.fel.esw.server.proto.Response.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Response.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <pre>
   * Always present
   * </pre>
   *
   * <code>.Response.Status status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * Always present
   * </pre>
   *
   * <code>.Response.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override public cz.cvut.fel.esw.server.proto.Response.Status getStatus() {
    @SuppressWarnings("deprecation")
    cz.cvut.fel.esw.server.proto.Response.Status result = cz.cvut.fel.esw.server.proto.Response.Status.valueOf(status_);
    return result == null ? cz.cvut.fel.esw.server.proto.Response.Status.UNRECOGNIZED : result;
  }

  public static final int COUNTER_FIELD_NUMBER = 2;
  private int counter_;
  /**
   * <code>int32 counter = 2;</code>
   * @return The counter.
   */
  @java.lang.Override
  public int getCounter() {
    return counter_;
  }

  public static final int ERRMSG_FIELD_NUMBER = 3;
  private volatile java.lang.Object errMsg_;
  /**
   * <code>string errMsg = 3;</code>
   * @return The errMsg.
   */
  @java.lang.Override
  public java.lang.String getErrMsg() {
    java.lang.Object ref = errMsg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errMsg_ = s;
      return s;
    }
  }
  /**
   * <code>string errMsg = 3;</code>
   * @return The bytes for errMsg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErrMsgBytes() {
    java.lang.Object ref = errMsg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errMsg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (status_ != cz.cvut.fel.esw.server.proto.Response.Status.OK.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (counter_ != 0) {
      output.writeInt32(2, counter_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errMsg_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, errMsg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != cz.cvut.fel.esw.server.proto.Response.Status.OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (counter_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, counter_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errMsg_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, errMsg_);
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
    if (!(obj instanceof cz.cvut.fel.esw.server.proto.Response)) {
      return super.equals(obj);
    }
    cz.cvut.fel.esw.server.proto.Response other = (cz.cvut.fel.esw.server.proto.Response) obj;

    if (status_ != other.status_) return false;
    if (getCounter()
        != other.getCounter()) return false;
    if (!getErrMsg()
        .equals(other.getErrMsg())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + COUNTER_FIELD_NUMBER;
    hash = (53 * hash) + getCounter();
    hash = (37 * hash) + ERRMSG_FIELD_NUMBER;
    hash = (53 * hash) + getErrMsg().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cz.cvut.fel.esw.server.proto.Response parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cz.cvut.fel.esw.server.proto.Response parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cz.cvut.fel.esw.server.proto.Response parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cz.cvut.fel.esw.server.proto.Response parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cz.cvut.fel.esw.server.proto.Response parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cz.cvut.fel.esw.server.proto.Response parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cz.cvut.fel.esw.server.proto.Response parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cz.cvut.fel.esw.server.proto.Response parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cz.cvut.fel.esw.server.proto.Response parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cz.cvut.fel.esw.server.proto.Response parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cz.cvut.fel.esw.server.proto.Response parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cz.cvut.fel.esw.server.proto.Response parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cz.cvut.fel.esw.server.proto.Response prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code Response}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Response)
      cz.cvut.fel.esw.server.proto.ResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cz.cvut.fel.esw.server.proto.Schema.internal_static_Response_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cz.cvut.fel.esw.server.proto.Schema.internal_static_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cz.cvut.fel.esw.server.proto.Response.class, cz.cvut.fel.esw.server.proto.Response.Builder.class);
    }

    // Construct using cz.cvut.fel.esw.server.proto.Response.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      counter_ = 0;

      errMsg_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cz.cvut.fel.esw.server.proto.Schema.internal_static_Response_descriptor;
    }

    @java.lang.Override
    public cz.cvut.fel.esw.server.proto.Response getDefaultInstanceForType() {
      return cz.cvut.fel.esw.server.proto.Response.getDefaultInstance();
    }

    @java.lang.Override
    public cz.cvut.fel.esw.server.proto.Response build() {
      cz.cvut.fel.esw.server.proto.Response result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cz.cvut.fel.esw.server.proto.Response buildPartial() {
      cz.cvut.fel.esw.server.proto.Response result = new cz.cvut.fel.esw.server.proto.Response(this);
      result.status_ = status_;
      result.counter_ = counter_;
      result.errMsg_ = errMsg_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cz.cvut.fel.esw.server.proto.Response) {
        return mergeFrom((cz.cvut.fel.esw.server.proto.Response)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cz.cvut.fel.esw.server.proto.Response other) {
      if (other == cz.cvut.fel.esw.server.proto.Response.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.getCounter() != 0) {
        setCounter(other.getCounter());
      }
      if (!other.getErrMsg().isEmpty()) {
        errMsg_ = other.errMsg_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cz.cvut.fel.esw.server.proto.Response parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cz.cvut.fel.esw.server.proto.Response) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * Always present
     * </pre>
     *
     * <code>.Response.Status status = 1;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Always present
     * </pre>
     *
     * <code>.Response.Status status = 1;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Always present
     * </pre>
     *
     * <code>.Response.Status status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public cz.cvut.fel.esw.server.proto.Response.Status getStatus() {
      @SuppressWarnings("deprecation")
      cz.cvut.fel.esw.server.proto.Response.Status result = cz.cvut.fel.esw.server.proto.Response.Status.valueOf(status_);
      return result == null ? cz.cvut.fel.esw.server.proto.Response.Status.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Always present
     * </pre>
     *
     * <code>.Response.Status status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(cz.cvut.fel.esw.server.proto.Response.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Always present
     * </pre>
     *
     * <code>.Response.Status status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private int counter_ ;
    /**
     * <code>int32 counter = 2;</code>
     * @return The counter.
     */
    @java.lang.Override
    public int getCounter() {
      return counter_;
    }
    /**
     * <code>int32 counter = 2;</code>
     * @param value The counter to set.
     * @return This builder for chaining.
     */
    public Builder setCounter(int value) {
      
      counter_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 counter = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCounter() {
      
      counter_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object errMsg_ = "";
    /**
     * <code>string errMsg = 3;</code>
     * @return The errMsg.
     */
    public java.lang.String getErrMsg() {
      java.lang.Object ref = errMsg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errMsg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string errMsg = 3;</code>
     * @return The bytes for errMsg.
     */
    public com.google.protobuf.ByteString
        getErrMsgBytes() {
      java.lang.Object ref = errMsg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string errMsg = 3;</code>
     * @param value The errMsg to set.
     * @return This builder for chaining.
     */
    public Builder setErrMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errMsg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string errMsg = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrMsg() {
      
      errMsg_ = getDefaultInstance().getErrMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string errMsg = 3;</code>
     * @param value The bytes for errMsg to set.
     * @return This builder for chaining.
     */
    public Builder setErrMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errMsg_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Response)
  }

  // @@protoc_insertion_point(class_scope:Response)
  private static final cz.cvut.fel.esw.server.proto.Response DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cz.cvut.fel.esw.server.proto.Response();
  }

  public static cz.cvut.fel.esw.server.proto.Response getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Response>
      PARSER = new com.google.protobuf.AbstractParser<Response>() {
    @java.lang.Override
    public Response parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Response(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Response> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Response> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cz.cvut.fel.esw.server.proto.Response getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

