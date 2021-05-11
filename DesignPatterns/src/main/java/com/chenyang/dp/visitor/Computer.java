package com.chenyang.dp.visitor;

public class Computer {

    ComputerPart cpu = new Cpu();
    ComputerPart board = new Board();
    ComputerPart memory = new Memory();

    public void accept(Visitor v) {
        this.cpu.accept(v);
        this.board.accept(v);
        this.memory.accept(v);
    }
}




