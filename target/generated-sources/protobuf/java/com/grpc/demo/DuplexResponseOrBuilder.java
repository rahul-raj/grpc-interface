// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.grpc.demo;

public interface DuplexResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpcdemo.DuplexResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string itemName = 1;</code>
   */
  java.lang.String getItemName();
  /**
   * <code>string itemName = 1;</code>
   */
  com.google.protobuf.ByteString
      getItemNameBytes();

  /**
   * <code>int32 itemPrice = 2;</code>
   */
  int getItemPrice();

  /**
   * <code>bool isAvailable = 3;</code>
   */
  boolean getIsAvailable();
}
