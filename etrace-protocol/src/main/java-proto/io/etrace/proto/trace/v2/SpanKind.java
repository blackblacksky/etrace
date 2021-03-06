// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trace/v2/trace.proto

package io.etrace.proto.trace.v2;

/**
 * Protobuf enum {@code io.etrace.proto.trace.v2.SpanKind}
 */
public enum SpanKind
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   *Span
   * </pre>
   *
   * <code>LOCAL = 0;</code>
   */
  LOCAL(0),
  /**
   * <pre>
   *event
   * </pre>
   *
   * <code>EVENT = 1;</code>
   */
  EVENT(1),
  /**
   * <code>SERVER = 2;</code>
   */
  SERVER(2),
  /**
   * <code>CLIENT = 3;</code>
   */
  CLIENT(3),
  /**
   * <code>DAL = 4;</code>
   */
  DAL(4),
  /**
   * <code>RMQ = 5;</code>
   */
  RMQ(5),
  /**
   * <code>REDIS = 6;</code>
   */
  REDIS(6),
  /**
   * <code>HEARTBEAT = 7;</code>
   */
  HEARTBEAT(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   *Span
   * </pre>
   *
   * <code>LOCAL = 0;</code>
   */
  public static final int LOCAL_VALUE = 0;
  /**
   * <pre>
   *event
   * </pre>
   *
   * <code>EVENT = 1;</code>
   */
  public static final int EVENT_VALUE = 1;
  /**
   * <code>SERVER = 2;</code>
   */
  public static final int SERVER_VALUE = 2;
  /**
   * <code>CLIENT = 3;</code>
   */
  public static final int CLIENT_VALUE = 3;
  /**
   * <code>DAL = 4;</code>
   */
  public static final int DAL_VALUE = 4;
  /**
   * <code>RMQ = 5;</code>
   */
  public static final int RMQ_VALUE = 5;
  /**
   * <code>REDIS = 6;</code>
   */
  public static final int REDIS_VALUE = 6;
  /**
   * <code>HEARTBEAT = 7;</code>
   */
  public static final int HEARTBEAT_VALUE = 7;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SpanKind valueOf(int value) {
    return forNumber(value);
  }

  public static SpanKind forNumber(int value) {
    switch (value) {
      case 0: return LOCAL;
      case 1: return EVENT;
      case 2: return SERVER;
      case 3: return CLIENT;
      case 4: return DAL;
      case 5: return RMQ;
      case 6: return REDIS;
      case 7: return HEARTBEAT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SpanKind>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SpanKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SpanKind>() {
          public SpanKind findValueByNumber(int number) {
            return SpanKind.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.etrace.proto.trace.v2.TraceProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final SpanKind[] VALUES = values();

  public static SpanKind valueOf(
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

  private SpanKind(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:io.etrace.proto.trace.v2.SpanKind)
}

