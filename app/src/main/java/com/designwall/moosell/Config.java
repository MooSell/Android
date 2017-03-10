package com.designwall.moosell;

import android.util.Base64;

/**
 * Created by SCIT on 3/9/2017.
 */

public class Config {
    public static final String CONSUMER_KEY     = "ck_e9a039d2bc77e57922b2dbdf81c808cb080058a5";
    public static final String CONSUMER_SECRET  = "cs_a2c26e91bd7f98e7c5c5a7e86a9d83a4c599677b";
    public static final String HOST = "https://demo.moosell.com";

    public static final String API_VER          = "/wc-api/v3/";

    public static final String BASIC_AUTH = "Basic " + Base64.encodeToString((CONSUMER_KEY + ":" + CONSUMER_SECRET).getBytes(), Base64.NO_WRAP);
}
