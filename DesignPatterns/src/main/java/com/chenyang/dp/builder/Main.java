package com.chenyang.dp.builder;

public class Main {
    public static void main(String[] args) {
        Person.PersonBuilder personBuilder = new Person.PersonBuilder();
        Person person = personBuilder.basicInfo(1, "zhangsan", 20)
                .weight(60)
                .score(100)
                .loc(new Location("changanjie", "101"))
                .build();
        System.out.println(person);
    }
}
