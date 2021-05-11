package com.chenyang.dp.visitor;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        double boardPrice = computer.board.getPrice();
        double cpuPrice = computer.cpu.getPrice();
        double memoryPrice = computer.memory.getPrice();

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
    }
}
