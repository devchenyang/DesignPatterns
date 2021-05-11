package com.chenyang.dp.visitor;

public class Cpu extends ComputerPart{
    @Override
    double getPrice() {
        return 2000.99;
    }

    @Override
    void accept(Visitor v) {
        v.visitCpu(this);
    }
}
