package com.example.Entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author AllenVan
 * @version 1.0
 * @date 2020/10/22
 */

@Data
public class ApiTestData {

    @ExcelProperty("请求方式")
    private String requestMethod;

    @ExcelProperty("接口地址")
    private String url;

    @ExcelProperty("请求头")
    private String requestHeader;

    @ExcelProperty("请求参数")
    private String requestParam;

    @ExcelProperty("期望结果")
    private String expectResult;

    @ExcelProperty("实际结果")
    private String actualResult;

    @ExcelProperty("数据库查询是否存在")
    private String isExist;

    @ExcelProperty("是否通过")
    private String isSuccess;
}
