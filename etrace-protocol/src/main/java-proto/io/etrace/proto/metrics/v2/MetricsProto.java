// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metrics/v2/metrics.proto

package io.etrace.proto.metrics.v2;

public final class MetricsProto {
  private MetricsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_etrace_proto_metrics_v2_ResourceMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_etrace_proto_metrics_v2_ResourceMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_etrace_proto_metrics_v2_ResourceMetrics_AttributesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_etrace_proto_metrics_v2_ResourceMetrics_AttributesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_etrace_proto_metrics_v2_Metric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_etrace_proto_metrics_v2_Metric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_etrace_proto_metrics_v2_Metric_TagsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_etrace_proto_metrics_v2_Metric_TagsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_etrace_proto_metrics_v2_Metric_FieldsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_etrace_proto_metrics_v2_Metric_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_etrace_proto_metrics_v2_Field_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_etrace_proto_metrics_v2_Field_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_etrace_proto_metrics_v2_Bucket_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_etrace_proto_metrics_v2_Bucket_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030metrics/v2/metrics.proto\022\032io.etrace.pr" +
      "oto.metrics.v2\"\311\001\n\017ResourceMetrics\022O\n\nat" +
      "tributes\030\005 \003(\0132;.io.etrace.proto.metrics" +
      ".v2.ResourceMetrics.AttributesEntry\0222\n\006m" +
      "etric\030\006 \003(\0132\".io.etrace.proto.metrics.v2" +
      ".Metric\0321\n\017AttributesEntry\022\013\n\003key\030\001 \001(\t\022" +
      "\r\n\005value\030\002 \001(\t:\0028\001\"\223\004\n\006Metric\022;\n\004kind\030\001 " +
      "\001(\0162-.io.etrace.proto.metrics.v2.Metric." +
      "MetricKind\022\014\n\004name\030\002 \001(\t\022\021\n\ttimestamp\030\003 " +
      "\001(\004\022:\n\004tags\030\004 \003(\0132,.io.etrace.proto.metr" +
      "ics.v2.Metric.TagsEntry\022>\n\006fields\030\005 \003(\0132" +
      "..io.etrace.proto.metrics.v2.Metric.Fiel" +
      "dsEntry\0223\n\007buckets\030\006 \003(\0132\".io.etrace.pro" +
      "to.metrics.v2.Bucket\032+\n\tTagsEntry\022\013\n\003key" +
      "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032P\n\013FieldsEntry" +
      "\022\013\n\003key\030\001 \001(\t\0220\n\005value\030\002 \001(\0132!.io.etrace" +
      ".proto.metrics.v2.Field:\0028\001\"{\n\nMetricKin" +
      "d\022\013\n\007COUNTER\020\000\022\t\n\005GAUGE\020\001\022\t\n\005TIMER\020\002\022\t\n\005" +
      "RATIO\020\003\022\013\n\007PAYLOAD\020\004\022\r\n\tHISTOGRAM\020\005\022\013\n\007S" +
      "UMMARY\020\006\022\026\n\022HISTOGRAM_INTERNAL\020\007\"\217\001\n\005Fie" +
      "ld\022@\n\raggregateType\030\001 \001(\0162).io.etrace.pr" +
      "oto.metrics.v2.AggregateType\022\021\n\007longVal\030" +
      "d \001(\004H\000\022\023\n\tdoubleVal\030e \001(\001H\000\022\023\n\tstringVa" +
      "l\030f \001(\tH\000B\007\n\005value\"\'\n\006Bucket\022\016\n\006bucket\030\001" +
      " \001(\001\022\r\n\005count\030\002 \001(\001*5\n\rAggregateType\022\007\n\003" +
      "SUM\020\000\022\t\n\005GAUGE\020\001\022\007\n\003MAX\020\002\022\007\n\003MIN\020\003B,\n\032io" +
      ".etrace.proto.metrics.v2B\014MetricsProtoP\001" +
      "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_io_etrace_proto_metrics_v2_ResourceMetrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_etrace_proto_metrics_v2_ResourceMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_etrace_proto_metrics_v2_ResourceMetrics_descriptor,
        new java.lang.String[] { "Attributes", "Metric", });
    internal_static_io_etrace_proto_metrics_v2_ResourceMetrics_AttributesEntry_descriptor =
      internal_static_io_etrace_proto_metrics_v2_ResourceMetrics_descriptor.getNestedTypes().get(0);
    internal_static_io_etrace_proto_metrics_v2_ResourceMetrics_AttributesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_etrace_proto_metrics_v2_ResourceMetrics_AttributesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_io_etrace_proto_metrics_v2_Metric_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_io_etrace_proto_metrics_v2_Metric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_etrace_proto_metrics_v2_Metric_descriptor,
        new java.lang.String[] { "Kind", "Name", "Timestamp", "Tags", "Fields", "Buckets", });
    internal_static_io_etrace_proto_metrics_v2_Metric_TagsEntry_descriptor =
      internal_static_io_etrace_proto_metrics_v2_Metric_descriptor.getNestedTypes().get(0);
    internal_static_io_etrace_proto_metrics_v2_Metric_TagsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_etrace_proto_metrics_v2_Metric_TagsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_io_etrace_proto_metrics_v2_Metric_FieldsEntry_descriptor =
      internal_static_io_etrace_proto_metrics_v2_Metric_descriptor.getNestedTypes().get(1);
    internal_static_io_etrace_proto_metrics_v2_Metric_FieldsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_etrace_proto_metrics_v2_Metric_FieldsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_io_etrace_proto_metrics_v2_Field_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_io_etrace_proto_metrics_v2_Field_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_etrace_proto_metrics_v2_Field_descriptor,
        new java.lang.String[] { "AggregateType", "LongVal", "DoubleVal", "StringVal", "Value", });
    internal_static_io_etrace_proto_metrics_v2_Bucket_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_io_etrace_proto_metrics_v2_Bucket_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_etrace_proto_metrics_v2_Bucket_descriptor,
        new java.lang.String[] { "Bucket", "Count", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
