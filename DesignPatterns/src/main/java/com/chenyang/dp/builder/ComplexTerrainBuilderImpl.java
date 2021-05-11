package com.chenyang.dp.builder;

public class ComplexTerrainBuilderImpl implements TerrainBuilder {

    Terrain terrain = new Terrain();

    @Override
    public TerrainBuilder buildFort() {
        terrain.f = new Fort(100, 100, 300, 300);
        return this;
    }

    @Override
    public TerrainBuilder buildMine() {
        terrain.m = new Mine(200, 200, 300, 300);
        return this;
    }

    @Override
    public TerrainBuilder buildWall() {
        terrain.w = new Wall(300, 300, 300, 300);
        return this;
    }

    @Override
    public Terrain build() {
        return terrain;
    }
}
