// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Greeter.proto

package com.grpc.server;

public final class GreeterProto {
  private GreeterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeter_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeter_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeter_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeter_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rGreeter.proto\022\007greeter\"\007\n\005Empty\"\035\n\nHel" +
      "loReply\022\017\n\007message\030\001 \001(\t2<\n\007Greeter\0221\n\010G" +
      "reeting\022\016.greeter.Empty\032\023.greeter.HelloR" +
      "eply\"\000B\'\n\017com.grpc.serverB\014GreeterProtoP" +
      "\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_greeter_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greeter_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeter_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_greeter_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_greeter_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeter_HelloReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
