package com.chenyang.dp.visitor;

public interface Visitor {
    void visitBoard(Board board);
    void visitCpu(Cpu cpu);
    void visitMemory(Memory memory);
}
