package com.example.client;

import cn.hutool.http.HttpUtil;
import sun.net.www.http.HttpClient;

import java.util.HashMap;

/**
 * @author AllenVan
 * @version 1.0
 * @date 2020/10/22
 */
public class MyHttpClient {


    /**
     * 基础get
     * @param url
     * @param <T>
     * @return
     */
    public static <T> String getMy(String url){
        return HttpUtil.get(url);
    }

//    public static <T> String getMy(String url, HashMap<String,String> header){
//
//    }
}
