package com.cb.sp.petstore.biz.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *测试导出数据
 */
@SuppressWarnings("serial")
public class testExcel extends HttpServlet{


    public static void main(String[] args) throws UnsupportedEncodingException {
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("序列", 1);
        map.put("姓名", "张三");
        map.put("年龄", 20);
        map.put("户籍", "陕西");
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);
        list.add(map);


        //System.getProperty("user.dir") 获取当前项目的路径
        String fileName=System.getProperty("user.dir")+"\\导出数据Excel.xls";//定义到处路径

        System.out.println(fileName);


        String worksheetTitle = "Excel导出信息";//sheet名
        String sheetName="数据1";
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet(sheetName);//定义sheet名
        excelToolClass exportExcel = new excelToolClass(wb,sheet);//调用Excel工具类
        fileName = new String(fileName.getBytes("GBK"), "GBK");//修改编码格式
        //定义第二行标题
        String id = "序列";
        String name = "姓名";
        String age = "年龄";
        String address = "户籍";
        List<String> l=new ArrayList<String>();
        l.add(id);
        l.add(name);
        l.add(age);
        l.add(address);

        // 创建报表头部
        exportExcel.createNormalHead(worksheetTitle, 3);
        //定义第一行
        exportExcel.createNormalTwoRow(l, 0);
        //导入数据
        exportExcel.createColumHeader(list);
        //输出文件流，把相应的Excel工作簿 输出到本地
        exportExcel.outputExcel(fileName);
    }
}