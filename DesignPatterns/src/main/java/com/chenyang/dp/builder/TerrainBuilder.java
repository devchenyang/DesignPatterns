package com.chenyang.dp.builder;

public interface TerrainBuilder {
    TerrainBuilder buildFort();
    TerrainBuilder buildMine();
    TerrainBuilder buildWall();
    Terrain build();
}
