package com.example.test;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import org.testng.Assert;

import java.io.File;

public class TestHttptool {
    public static void main(String[] args) {

        File file = new File("D:\\Data\\intellijData\\demo\\src\\main\\resources\\response.txt");
        HttpResponse re = HttpRequest.get("http://192.168.1.191:8088/demo/person").execute();
        System.out.println(re.getStatus());
        Assert.assertEquals(re.getStatus(),200);



    }
}
