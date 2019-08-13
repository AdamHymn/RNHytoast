
package com.hymn.toast;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

public class RNHytoastModule extends ReactContextBaseJavaModule {

    private final static String SHOW_LONG_TIME = "LONG";
    private final static String SHOW_SHORT_TIME = "SHORT";
    private final ReactApplicationContext reactContext;

    public RNHytoastModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNHytoast";
    }

    @Nullable
    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> map = new HashMap<>();
        map.put(SHOW_LONG_TIME, Toast.LENGTH_LONG);
        map.put(SHOW_SHORT_TIME, Toast.LENGTH_SHORT);
        return map;
    }

    @ReactMethod
    public void show(String content,int duration){
        Toast.makeText(getReactApplicationContext(),content,duration).show();
    }
}