package com.arthenica.ffmpegkit.flutter;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;

import io.flutter.plugin.platform.PlatformView;

/**
 * FFmpegKitFlutterPlatformView is used to create platform views for the FFmpegKitFlutterPlugin.
 * This class is used for V2 embedding.
 */
public class FFmpegKitFlutterPlatformView implements PlatformView {
    
    private final Context context;
    private final int viewId;
    private final Object args;
    private final FFmpegKitFlutterPlugin plugin;
    private final View view;
    
    /**
     * Creates a new FFmpegKitFlutterPlatformView.
     *
     * @param context The context.
     * @param viewId The view ID.
     * @param args The arguments.
     * @param plugin The FFmpegKitFlutterPlugin instance.
     */
    public FFmpegKitFlutterPlatformView(Context context, int viewId, Object args, FFmpegKitFlutterPlugin plugin) {
        this.context = context;
        this.viewId = viewId;
        this.args = args;
        this.plugin = plugin;
        
        // Currently, this plugin doesn't use platform views, but this class is required for V2 embedding.
        // If platform views are needed in the future, they can be implemented here.
        this.view = new View(context);
    }
    
    @NonNull
    @Override
    public View getView() {
        return view;
    }
    
    @Override
    public void dispose() {
        // Clean up resources if needed.
    }
} 