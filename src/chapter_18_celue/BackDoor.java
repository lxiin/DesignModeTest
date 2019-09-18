package chapter_18_celue;

import utils.P;

public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        P.print("找乔国老帮忙，让吴国太给孙施加压力");
    }
}
