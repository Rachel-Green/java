// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/debug_event.proto

package org.tensorflow.proto.util;

public final class DebugEventProtos {
  private DebugEventProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DebugEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DebugEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DebugMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DebugMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SourceFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SourceFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_StackFrameWithId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_StackFrameWithId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CodeLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CodeLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphOpCreation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphOpCreation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DebuggedGraph_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DebuggedGraph_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DebuggedDevice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DebuggedDevice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Execution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_Execution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphExecutionTrace_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphExecutionTrace_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*tensorflow/core/protobuf/debug_event.p" +
      "roto\022\ntensorflow\032&tensorflow/core/framew" +
      "ork/tensor.proto\032/tensorflow/core/protob" +
      "uf/graph_debug_info.proto\"\376\003\n\nDebugEvent" +
      "\022\021\n\twall_time\030\001 \001(\001\022\014\n\004step\030\002 \001(\003\0223\n\016deb" +
      "ug_metadata\030\003 \001(\0132\031.tensorflow.DebugMeta" +
      "dataH\000\022-\n\013source_file\030\004 \001(\0132\026.tensorflow" +
      ".SourceFileH\000\022;\n\023stack_frame_with_id\030\006 \001" +
      "(\0132\034.tensorflow.StackFrameWithIdH\000\0228\n\021gr" +
      "aph_op_creation\030\007 \001(\0132\033.tensorflow.Graph" +
      "OpCreationH\000\0223\n\016debugged_graph\030\010 \001(\0132\031.t" +
      "ensorflow.DebuggedGraphH\000\022*\n\texecution\030\t" +
      " \001(\0132\025.tensorflow.ExecutionH\000\022@\n\025graph_e" +
      "xecution_trace\030\n \001(\0132\037.tensorflow.GraphE" +
      "xecutionTraceH\000\022\022\n\010graph_id\030\013 \001(\tH\000\0225\n\017d" +
      "ebugged_device\030\014 \001(\0132\032.tensorflow.Debugg" +
      "edDeviceH\000B\006\n\004what\"W\n\rDebugMetadata\022\032\n\022t" +
      "ensorflow_version\030\001 \001(\t\022\024\n\014file_version\030" +
      "\002 \001(\t\022\024\n\014tfdbg_run_id\030\003 \001(\t\"A\n\nSourceFil" +
      "e\022\021\n\tfile_path\030\001 \001(\t\022\021\n\thost_name\030\002 \001(\t\022" +
      "\r\n\005lines\030\003 \003(\t\"]\n\020StackFrameWithId\022\n\n\002id" +
      "\030\001 \001(\t\022=\n\rfile_line_col\030\002 \001(\0132&.tensorfl" +
      "ow.GraphDebugInfo.FileLineCol\":\n\014CodeLoc" +
      "ation\022\021\n\thost_name\030\001 \001(\t\022\027\n\017stack_frame_" +
      "ids\030\002 \003(\t\"\344\001\n\017GraphOpCreation\022\017\n\007op_type" +
      "\030\001 \001(\t\022\017\n\007op_name\030\002 \001(\t\022\022\n\ngraph_name\030\003 " +
      "\001(\t\022\020\n\010graph_id\030\004 \001(\t\022\023\n\013device_name\030\005 \001" +
      "(\t\022\023\n\013input_names\030\006 \003(\t\022\023\n\013num_outputs\030\007" +
      " \001(\005\022/\n\rcode_location\030\010 \001(\0132\030.tensorflow" +
      ".CodeLocation\022\031\n\021output_tensor_ids\030\t \003(\005" +
      "\"\245\001\n\rDebuggedGraph\022\020\n\010graph_id\030\001 \001(\t\022\022\n\n" +
      "graph_name\030\002 \001(\t\022\030\n\020instrumented_ops\030\003 \003" +
      "(\t\022\032\n\022original_graph_def\030\004 \001(\014\022\036\n\026instru" +
      "mented_graph_def\030\005 \001(\014\022\030\n\020outer_context_" +
      "id\030\006 \001(\t\"8\n\016DebuggedDevice\022\023\n\013device_nam" +
      "e\030\001 \001(\t\022\021\n\tdevice_id\030\002 \001(\005\"\263\002\n\tExecution" +
      "\022\017\n\007op_type\030\001 \001(\t\022\023\n\013num_outputs\030\002 \001(\005\022\020" +
      "\n\010graph_id\030\003 \001(\t\022\030\n\020input_tensor_ids\030\004 \003" +
      "(\003\022\031\n\021output_tensor_ids\030\005 \003(\003\0226\n\021tensor_" +
      "debug_mode\030\006 \001(\0162\033.tensorflow.TensorDebu" +
      "gMode\022.\n\rtensor_protos\030\007 \003(\0132\027.tensorflo" +
      "w.TensorProto\022/\n\rcode_location\030\010 \001(\0132\030.t" +
      "ensorflow.CodeLocation\022 \n\030output_tensor_" +
      "device_ids\030\t \003(\005\"\321\001\n\023GraphExecutionTrace" +
      "\022\030\n\020tfdbg_context_id\030\001 \001(\t\022\017\n\007op_name\030\002 " +
      "\001(\t\022\023\n\013output_slot\030\003 \001(\005\0226\n\021tensor_debug" +
      "_mode\030\004 \001(\0162\033.tensorflow.TensorDebugMode" +
      "\022-\n\014tensor_proto\030\005 \001(\0132\027.tensorflow.Tens" +
      "orProto\022\023\n\013device_name\030\006 \001(\t*\266\001\n\017TensorD" +
      "ebugMode\022\017\n\013UNSPECIFIED\020\000\022\r\n\tNO_TENSOR\020\001" +
      "\022\017\n\013CURT_HEALTH\020\002\022\022\n\016CONCISE_HEALTH\020\003\022\017\n" +
      "\013FULL_HEALTH\020\004\022\t\n\005SHAPE\020\005\022\021\n\rFULL_NUMERI" +
      "CS\020\006\022\017\n\013FULL_TENSOR\020\007\022\036\n\032REDUCE_INF_NAN_" +
      "THREE_SLOTS\020\010B|\n\031org.tensorflow.proto.ut" +
      "ilB\020DebugEventProtosP\001ZHgithub.com/tenso" +
      "rflow/tensorflow/tensorflow/go/core/core" +
      "_protos_go_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.proto.framework.TensorProtos.getDescriptor(),
          org.tensorflow.proto.framework.GraphDebugInfoProtos.getDescriptor(),
        });
    internal_static_tensorflow_DebugEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_DebugEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DebugEvent_descriptor,
        new java.lang.String[] { "WallTime", "Step", "DebugMetadata", "SourceFile", "StackFrameWithId", "GraphOpCreation", "DebuggedGraph", "Execution", "GraphExecutionTrace", "GraphId", "DebuggedDevice", "What", });
    internal_static_tensorflow_DebugMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_DebugMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DebugMetadata_descriptor,
        new java.lang.String[] { "TensorflowVersion", "FileVersion", "TfdbgRunId", });
    internal_static_tensorflow_SourceFile_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_SourceFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SourceFile_descriptor,
        new java.lang.String[] { "FilePath", "HostName", "Lines", });
    internal_static_tensorflow_StackFrameWithId_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_StackFrameWithId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_StackFrameWithId_descriptor,
        new java.lang.String[] { "Id", "FileLineCol", });
    internal_static_tensorflow_CodeLocation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_CodeLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CodeLocation_descriptor,
        new java.lang.String[] { "HostName", "StackFrameIds", });
    internal_static_tensorflow_GraphOpCreation_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_GraphOpCreation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphOpCreation_descriptor,
        new java.lang.String[] { "OpType", "OpName", "GraphName", "GraphId", "DeviceName", "InputNames", "NumOutputs", "CodeLocation", "OutputTensorIds", });
    internal_static_tensorflow_DebuggedGraph_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_DebuggedGraph_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DebuggedGraph_descriptor,
        new java.lang.String[] { "GraphId", "GraphName", "InstrumentedOps", "OriginalGraphDef", "InstrumentedGraphDef", "OuterContextId", });
    internal_static_tensorflow_DebuggedDevice_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tensorflow_DebuggedDevice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DebuggedDevice_descriptor,
        new java.lang.String[] { "DeviceName", "DeviceId", });
    internal_static_tensorflow_Execution_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tensorflow_Execution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_Execution_descriptor,
        new java.lang.String[] { "OpType", "NumOutputs", "GraphId", "InputTensorIds", "OutputTensorIds", "TensorDebugMode", "TensorProtos", "CodeLocation", "OutputTensorDeviceIds", });
    internal_static_tensorflow_GraphExecutionTrace_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tensorflow_GraphExecutionTrace_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphExecutionTrace_descriptor,
        new java.lang.String[] { "TfdbgContextId", "OpName", "OutputSlot", "TensorDebugMode", "TensorProto", "DeviceName", });
    org.tensorflow.proto.framework.TensorProtos.getDescriptor();
    org.tensorflow.proto.framework.GraphDebugInfoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
