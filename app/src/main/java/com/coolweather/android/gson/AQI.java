package com.coolweather.android.gson;

/**
 * Created by niceone on 2017/7/26.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}

