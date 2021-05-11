package com.chenyang.dp.visitor;

public abstract class ComputerPart {
    abstract double getPrice();

    abstract void accept(Visitor v);
}
