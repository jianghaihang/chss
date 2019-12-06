package com.neusoft.CHSS.controller;

import com.neusoft.CHSS.entity.Person;
import com.neusoft.CHSS.utils.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 测试控制器
 * @time 2019/12/5 21:47
 */

@RestController
@RequestMapping("/demos")
public class DemoController extends BaseController{

    @RequestMapping("/demo")
    public ResponseResult<Map<String,Object>> demoHandle(){

        List<Person> list = new ArrayList();

        Person person = new Person();
        person.setPid(6);
        person.setpName("胡巴");
        person.setpSex("女");
        person.setpAge("20");
        person.setpAddr("宿州");

        Person person1 = new Person(1, "张三", "男", "20", "杭州");
        Person person2 = new Person(2, "李四", "女", "19", "上海");
        Person person3 = new Person(3, "王五", "女", "21", "广州");
        Person person4 = new Person(4, "赵六", "男", "20", "深圳");
        Person person5 = new Person(5, "钱七", "男", "18", "成都");

        list.add(person);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(new Person(7, "王九", "女", "18", "武汉"));


//        List<String> persons = new ArrayList<>();

        Map<String,Object> maps = new HashMap<>();

        maps.put(list.get(0)+ "", person1);
        maps.put(list.get(1)+ "", person2);
        maps.put(list.get(2)+ "", person3);
        maps.put(list.get(3)+ "", person4);
        maps.put(list.get(4)+ "", person5);
        maps.put(list.get(5)+ "", person);
        maps.put("person6", list.get(6));

//        for (Person person: list) {
//
//            maps.put("person",person);
//
//            maps.put("","{\"pId\":\"" + person.getPid()+ "\"," + "\"pName\":\"" + person.getpName() + "\"," +  "\"pAge\":\"" + person.getpAge() + "\"," + "\"pAddr\":\"" + person.getpAddr() + "\"}");
//
//        }
//
//        for (String str : persons) {
//
//            System.err.println(str);
//        }

        return new ResponseResult<Map<String,Object>>(SUCCESS,maps);
    }

}



































