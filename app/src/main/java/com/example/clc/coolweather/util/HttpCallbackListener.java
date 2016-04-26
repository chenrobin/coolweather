package com.example.clc.coolweather.util;

/**
 * Created by clc on 2016/4/24.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
