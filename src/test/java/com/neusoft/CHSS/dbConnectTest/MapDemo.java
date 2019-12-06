package com.neusoft.CHSS.dbConnectTest;

import java.util.*;

/**
 * @author 小舵
 * @program: CHSS
 * @description: 描述 测试map
 * @time 2019/12/5 22:57
 */

public class MapDemo {

    public static void main(String[] args) {

        List<Person> list = new ArrayList();

        list.add(new Person(1,"张三","男","20","杭州"));
        list.add(new Person(2,"李四","女","19","上海"));
        list.add(new Person(3,"王五","女","21","广州"));
        list.add(new Person(4,"赵六","男","20","深圳"));
        list.add(new Person(5,"钱七","男","18","成都"));

        List<String> persons = new ArrayList<>();

        for (Person person: list) {

            persons.add(person.getPid()+"," + person.getpName() + "," + person.getpAge() + "," + person.getpAddr());

        }

        for (String str : persons) {

            System.err.println(str);
        }


//        Map<String,Person> maps = new HashMap<String,Person>();
//
//        for (Person person: list) {
//
//            maps.put(person.getPid()+ "",person);
//
//        }
    }

}



























