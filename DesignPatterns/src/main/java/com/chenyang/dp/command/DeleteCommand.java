package com.chenyang.dp.command;

public class DeleteCommand extends Command {
    Content c;
    String deleted;

    @Override
    public void doIt() {
        deleted = c.msg.substring(0, 5);
        c.msg = c.msg.substring(5);
    }

    @Override
    public void undo() {
        c.msg = deleted + c.msg;
    }
}
