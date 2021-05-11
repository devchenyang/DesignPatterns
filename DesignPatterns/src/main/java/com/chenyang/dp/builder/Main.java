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

        TerrainBuilder builder1 = new ComplexTerrainBuilderImpl();
        Terrain terrain1 = builder1.buildFort().buildMine().build();
        System.out.println("terrain1" + terrain1);
        TerrainBuilder builder2 = new ComplexTerrainBuilderImpl();
        Terrain terrain2 = builder2.buildMine().buildWall().build();
        System.out.println("terrain2" + terrain2);

    }
}
