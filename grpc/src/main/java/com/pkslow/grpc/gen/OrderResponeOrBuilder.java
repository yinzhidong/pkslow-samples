// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OrderService.proto

package com.pkslow.grpc.gen;

public interface OrderResponeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:OrderRespone)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 orderId = 1;</code>
   * @return The orderId.
   */
  int getOrderId();

  /**
   * <code>int32 price = 2;</code>
   * @return The price.
   */
  int getPrice();

  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
