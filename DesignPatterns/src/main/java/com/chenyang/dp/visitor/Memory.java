package com.chenyang.dp.visitor;

public class Memory extends ComputerPart{
    @Override
    double getPrice() {
        return 1000.99;
    }

    @Override
    void accept(Visitor v) {
        v.visitMemory(this);
    }
}