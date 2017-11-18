package com.swun.dp.command;

public class LightOffCommand implements Command
{
    Light light;
    public void lightOffCommand(Light light){
        this.light =light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
