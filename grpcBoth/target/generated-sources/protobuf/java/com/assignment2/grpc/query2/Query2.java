// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: query2.proto

package com.assignment2.grpc.query2;

public final class Query2 {
  private Query2() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_assignment2_grpc_query2_EduQueryTwoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_assignment2_grpc_query2_EduQueryTwoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_assignment2_grpc_query2_EduQueryTwoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_assignment2_grpc_query2_EduQueryTwoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014query2.proto\022\033com.assignment2.grpc.que" +
      "ry2\"M\n\022EduQueryTwoRequest\022\014\n\004Year\030\001 \001(\005\022" +
      "\014\n\004Type\030\002 \001(\t\022\016\n\006Length\030\003 \001(\t\022\013\n\003url\030\004 \001" +
      "(\t\"&\n\023EduQueryTwoResponse\022\017\n\007message\030\001 \001" +
      "(\t2\211\001\n\022EduQueryTwoService\022s\n\016GetEduQuery" +
      "Two\022/.com.assignment2.grpc.query2.EduQue" +
      "ryTwoRequest\0320.com.assignment2.grpc.quer" +
      "y2.EduQueryTwoResponseB\037\n\033com.assignment" +
      "2.grpc.query2P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_assignment2_grpc_query2_EduQueryTwoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_assignment2_grpc_query2_EduQueryTwoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assignment2_grpc_query2_EduQueryTwoRequest_descriptor,
        new java.lang.String[] { "Year", "Type", "Length", "Url", });
    internal_static_com_assignment2_grpc_query2_EduQueryTwoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_assignment2_grpc_query2_EduQueryTwoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_assignment2_grpc_query2_EduQueryTwoResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
