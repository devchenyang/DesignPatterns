package com.chenyang.dp.command;

public class Main {
    public static void main(String[] args) {
        Content c = new Content();
        System.out.println("原始字符串：" + c.msg);
//        Command command = new CopyCommand(c);
//        Command command = new DeleteCommand(c);
        Command command = new InsertCommand(c);
        command.doIt();
//        command.undo();

        System.out.println("操作后的字符串：" + c.msg);
    }
}
