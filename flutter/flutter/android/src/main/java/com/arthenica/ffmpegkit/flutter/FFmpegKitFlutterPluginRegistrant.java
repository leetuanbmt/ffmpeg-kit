package com.arthenica.ffmpegkit.flutter;

import androidx.annotation.NonNull;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.PluginRegistry;

/**
 * FFmpegKitFlutterPluginRegistrant is used to register the FFmpegKitFlutterPlugin with Flutter.
 * This class is used for both V1 and V2 embedding.
 */
public class FFmpegKitFlutterPluginRegistrant {
    
    /**
     * Registers the plugin with the Flutter engine.
     * This method is used for V2 embedding.
     *
     * @param flutterPluginBinding The FlutterPluginBinding to register with.
     */
    public static void registerWith(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        // In V2 embedding, the plugin is automatically registered when it implements FlutterPlugin
        // No need to manually add it to the plugins list
        FFmpegKitFlutterPlugin.registerWith(flutterPluginBinding);
    }
    
    /**
     * Registers the plugin with the Flutter engine.
     * This method is used for V1 embedding.
     *
     * @param registrar The PluginRegistry.Registrar to register with.
     */
    @SuppressWarnings("deprecation")
    public static void registerWith(PluginRegistry.Registrar registrar) {
        FFmpegKitFlutterPlugin.registerWithV1(registrar);
    }
} 