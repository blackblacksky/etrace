// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metrics/v2/metrics.proto

package io.etrace.proto.metrics.v2;

public interface MetricOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.etrace.proto.metrics.v2.Metric)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.io.etrace.proto.metrics.v2.Metric.MetricKind kind = 1;</code>
   */
  int getKindValue();
  /**
   * <code>.io.etrace.proto.metrics.v2.Metric.MetricKind kind = 1;</code>
   */
  io.etrace.proto.metrics.v2.Metric.MetricKind getKind();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>uint64 timestamp = 3;</code>
   */
  long getTimestamp();

  /**
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */
  int getTagsCount();
  /**
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */
  boolean containsTags(
      java.lang.String key);
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTags();
  /**
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTagsMap();
  /**
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */

  java.lang.String getTagsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; tags = 4;</code>
   */

  java.lang.String getTagsOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .io.etrace.proto.metrics.v2.Field&gt; fields = 5;</code>
   */
  int getFieldsCount();
  /**
   * <code>map&lt;string, .io.etrace.proto.metrics.v2.Field&gt; fields = 5;</code>
   */
  boolean containsFields(
      java.lang.String key);
  /**
   * Use {@link #getFieldsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.etrace.proto.metrics.v2.Field>
  getFields();
  /**
   * <code>map&lt;string, .io.etrace.proto.metrics.v2.Field&gt; fields = 5;</code>
   */
  java.util.Map<java.lang.String, io.etrace.proto.metrics.v2.Field>
  getFieldsMap();
  /**
   * <code>map&lt;string, .io.etrace.proto.metrics.v2.Field&gt; fields = 5;</code>
   */

  io.etrace.proto.metrics.v2.Field getFieldsOrDefault(
      java.lang.String key,
      io.etrace.proto.metrics.v2.Field defaultValue);
  /**
   * <code>map&lt;string, .io.etrace.proto.metrics.v2.Field&gt; fields = 5;</code>
   */

  io.etrace.proto.metrics.v2.Field getFieldsOrThrow(
      java.lang.String key);

  /**
   * <code>repeated .io.etrace.proto.metrics.v2.Bucket buckets = 6;</code>
   */
  java.util.List<io.etrace.proto.metrics.v2.Bucket> 
      getBucketsList();
  /**
   * <code>repeated .io.etrace.proto.metrics.v2.Bucket buckets = 6;</code>
   */
  io.etrace.proto.metrics.v2.Bucket getBuckets(int index);
  /**
   * <code>repeated .io.etrace.proto.metrics.v2.Bucket buckets = 6;</code>
   */
  int getBucketsCount();
  /**
   * <code>repeated .io.etrace.proto.metrics.v2.Bucket buckets = 6;</code>
   */
  java.util.List<? extends io.etrace.proto.metrics.v2.BucketOrBuilder> 
      getBucketsOrBuilderList();
  /**
   * <code>repeated .io.etrace.proto.metrics.v2.Bucket buckets = 6;</code>
   */
  io.etrace.proto.metrics.v2.BucketOrBuilder getBucketsOrBuilder(
      int index);
}