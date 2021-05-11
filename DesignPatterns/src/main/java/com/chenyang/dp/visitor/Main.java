package com.chenyang.dp.visitor;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        double boardPrice = computer.board.getPrice();
        double cpuPrice = computer.cpu.getPrice();
        double memoryPrice = computer.memory.getPrice();

        // 不使用visitor对电脑组件进行折扣
        String[] buyers = new String[]{"person", "corp"};
        int i = new Random().nextInt(2);
        System.out.println(i);
        if ("person".equalsIgnoreCase(buyers[i])) {
            double personTotal = boardPrice * 0.05 + cpuPrice * 0.1 + memoryPrice * 0.15;
            System.out.println("personTotal: " + personTotal);
        }
        if ("corp".equalsIgnoreCase(buyers[i])) {
            double personTotal = boardPrice * 0.1 + cpuPrice * 0.15 + memoryPrice * 0.2;
            System.out.println("personTotal: " + personTotal);
        }

        // 使用visitor优化代码,稳定的数据结构和易变的操作耦合问题
        PersonVisitor pVisitor = new PersonVisitor();
        computer.accept(pVisitor);
        System.out.println("pVisitorTotal1: " + pVisitor.totalPrice);
        System.out.println("pVisitorTotal2: " + (1500.99 * 0.9 + 2000.99 * 0.85 + 1000.99 * 0.95));

        CorpVisitor corpVisitor = new CorpVisitor();
        computer.accept(corpVisitor);
        System.out.println("pVisitorTotal3: " + corpVisitor.totalPrice);
        System.out.println("pVisitorTotal2: " + (1500.99 * 0.6 + 2000.99 * 0.75 + 1000.99 * 0.75));

    }
}
