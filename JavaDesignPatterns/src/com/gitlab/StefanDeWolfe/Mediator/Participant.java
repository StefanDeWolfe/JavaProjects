package com.gitlab.StefanDeWolfe.Mediator;

public abstract class Participant {
    public abstract void sendMsg(String msg);
    public abstract void setname(String name);
    public abstract String getName();
}
