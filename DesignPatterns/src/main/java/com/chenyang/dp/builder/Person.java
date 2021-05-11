package com.chenyang.dp.builder;

public class Person {
    int id;
    String name;
    int age;
    double weight;
    int score;
    Location loc;

    public Person() {}

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", score=" + score +
                ", loc=" + loc +
                '}';
    }

    // 构建者模式：基本组件不变，但组合经常变化的时候
    // 经常需要组合不同的字段来构建某个类
    public static class PersonBuilder {
        Person person = new Person();

        public PersonBuilder basicInfo(int id, String name, int age) {
            person.id = id;
            person.name = name;
            person.age = age;

            return this;
        }

        public PersonBuilder weight(double weight) {
            person.weight = weight;
            return this;
        }

        public PersonBuilder score(int score) {
            person.score = score;
            return this;
        }

        public PersonBuilder loc(Location loc) {
            person.loc = loc;
            return this;
        }

        public Person build() {
            return person;
        }
    }
}

class Location {
    String street;
    String roomNo;
    public Location(String street, String roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }
}