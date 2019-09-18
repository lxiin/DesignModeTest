package chapter_18_celue;

import utils.P;

public class ZhaoYun {

    public static void main(String[] args) {
        Context context;
        P.print("----刚刚到吴国的时候 拆第一个");
        context = new Context(new BackDoor());
        context.operate();

        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println("=------刘备乐不思蜀，拆第二个-----");
        context = new Context(new GivenGreenLight());
        context.operate();

        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println("===========孙权的笑柄追来了,拆第三个----");
        context = new Context(new BlockEnemy());
        context.operate();
    }

}
