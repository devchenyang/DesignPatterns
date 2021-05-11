package com.chenyang.dp.visitor;

public class Board extends ComputerPart{
    @Override
    double getPrice() {
        return 1500.99;
    }

    @Override
    void accept(Visitor v) {
        v.visitBoard(this);
    }
}
