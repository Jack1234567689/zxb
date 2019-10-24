//package com.zxb.controller;
//
//import com.zxb.po.Person;
//import org.junit.Test;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//public class ExcelUtilesTest {
//
//    @Test
//    public void exportExcel() {
//
//        @RequestMapping("/export")
//        public void export(HttpServletResponse response){
//
//            //模拟从数据库获取需要导出的数据
//            List<Person> personList = new ArrayList<Person>();
//            Person person1 = new Person("路飞","1",new Date());
//            Person person2 = new Person("娜美","2", new Date());
//            Person person3 = new Person("索隆","1", new Date());
//            Person person4 = new Person("小狸猫","1",new Date());
//            personList.add(person1);
//            personList.add(person2);
//            personList.add(person3);
//            personList.add(person4);
//
//            //导出操作
//            ExcelUtiles.exportExcel(personList,"花名册","草帽一伙",Person.class,"海贼王.xls",response);
//        }
//
//        @RequestMapping("/importExcel")
//        @ResponseBody
//        public String importExcel(){
//            String filePath = "C:\\Users\\choco\\Downloads\\海贼王.xls";
//            //解析excel，
//            List<Person> personList = ExcelUtiles.importExcel(filePath,1,1,Person.class);
//            //也可以使用MultipartFile,使用 FileUtil.importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass)导入
//            System.out.println("导入数据一共【"+personList.size()+"】行,"+personList);
//            return "sucess";
//        }
//    }
//    }
//
//    @Test
//    public void exportExcel1() {
//    }
//
//    @Test
//    public void exportExcel2() {
//    }
//
//    @Test
//    public void importExcel() {
//    }
//
//    @Test
//    public void importExcel1() {
//    }
//}