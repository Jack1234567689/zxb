//package com.zxb.controller;
//
//import com.zxb.po.Person;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.servlet.http.HttpServletResponse;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:spring/spring-service.xml")
//public class POIControllerTest {
//
//    @Test
//    public void export() {
//
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
//    }
//
//    @Test
//    public void importExcel() {
//    }
//}