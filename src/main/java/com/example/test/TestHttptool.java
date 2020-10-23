package com.example.test;

import cn.hutool.core.io.FileUtil;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.http.Header;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.sax.handler.RowHandler;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.fastjson.JSON;
import com.example.Entity.ApiTestData;
import com.example.service.ReadExcel;
import com.example.util.IndexOrNameDataListener;
import com.example.util.NumberUtil;
import com.example.util.TestFileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestHttptool {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestHttptool.class);

    public static void main(String[] args) throws Exception {

        String url = null;
        String method = null;
        File file = new File("D:\\Data\\intellijData\\demo\\src\\main\\resources\\static\\data.xlsx");
        ExcelReader reader = ExcelUtil.getReader(file);
        List<Map<String, Object>> maplists = reader.readAll();
//        System.out.println(JSON.toJSONString(maplists,true));
        for (Map<String, Object> map : maplists) {
//            System.out.println(JSON.toJSONString(map,true));
            method = map.get("请求方式").toString();
            url = map.get("接口地址").toString();
            boolean a = method.equals("GET");
            System.out.println(a);

            if (method.equals("GET")){
                HttpResponse re = HttpRequest.get(url).execute();
                System.out.println(re.getStatus());
            }else if(method.equals("POST")){
                HttpResponse re = HttpRequest.post(url).execute();
                System.out.println(re.getStatus());
            }else {
                System.out.println("aaaaaa");
            }

        }

//        url = maplists.get(2).get("接口地址").toString();
//
//        HttpResponse re = HttpRequest.get(url).execute();
//        System.out.println(re.getStatus());
//        System.out.println(JSON.toJSON(re.body()));
//
//        reader.close();

    }


    public void test0001(){
        File file = new File("D:\\Data\\intellijData\\demo\\src\\main\\resources\\response.txt");
        HttpResponse re = HttpRequest.get("http://192.168.1.191:8088/demo/person").execute();
        System.out.println(re.getStatus());
        Assert.assertEquals(re.getStatus(),200);
    }


}
