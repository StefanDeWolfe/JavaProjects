package com.gitlab.StefanDeWolfe.Mediator;

public class MediatorPatternExample {
    public static void main(String args[])
    {

        ChatRoom chat = new ChatRoomImplementation();

        UserType1 u1 = new UserType1(chat);
        u1.setname("Stefan");
        u1.sendMsg("Hey Joe! How are you doing today?");


        UserType2 u2 = new UserType2(chat);
        u2.setname("Joe");
        u2.sendMsg("Hello Stefan! I'm good!");
    }
}
