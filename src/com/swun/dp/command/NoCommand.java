package com.swun.dp.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-----noCommand was exec");
    }
}
