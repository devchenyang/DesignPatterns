package com.chenyang.dp.command;

public class InsertCommand extends Command {
    Content c;
    String strToInsert = "http://www.mashibing.com";

    @Override
    public void doIt() {
        c.msg += strToInsert;
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length() - strToInsert.length());
    }
}
