package com.arthenica.ffmpegkit.flutter;

import android.content.Context;

import androidx.annotation.NonNull;

import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

/**
 * FFmpegKitFlutterViewFactory is used to create platform views for the FFmpegKitFlutterPlugin.
 * This class is used for V2 embedding.
 */
public class FFmpegKitFlutterViewFactory extends PlatformViewFactory {
    
    private final FFmpegKitFlutterPlugin plugin;
    
    /**
     * Creates a new FFmpegKitFlutterViewFactory.
     *
     * @param plugin The FFmpegKitFlutterPlugin instance.
     */
    public FFmpegKitFlutterViewFactory(FFmpegKitFlutterPlugin plugin) {
        super(StandardMessageCodec.INSTANCE);
        this.plugin = plugin;
    }
    
    @NonNull
    @Override
    public PlatformView create(@NonNull Context context, int viewId, Object args) {
        // Currently, this plugin doesn't use platform views, but this factory is required for V2 embedding.
        // If platform views are needed in the future, they can be implemented here.
        return new FFmpegKitFlutterPlatformView(context, viewId, args, plugin);
    }
} 