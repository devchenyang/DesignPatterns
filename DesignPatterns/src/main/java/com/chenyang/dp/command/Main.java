package com.chenyang.dp.command;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Content c = new Content();
        System.out.println("原始字符串：" + c.msg);
//        Command command = new CopyCommand(c);
//        Command command = new DeleteCommand(c);
//        Command command = new InsertCommand(c);
//        command.doIt();
//        command.undo();

        ArrayList<Command> commands = new ArrayList<>();
        commands.add(new CopyCommand(c));
        commands.add(new DeleteCommand(c));
        commands.add(new InsertCommand(c));

        for (int i = 0; i < commands.size(); i++) {
            commands.get(i).doIt();
        }

        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).undo();
        }

        System.out.println("操作后的字符串：" + c.msg);
    }
}
