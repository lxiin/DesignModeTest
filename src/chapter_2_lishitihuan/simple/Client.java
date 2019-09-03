package chapter_2_lishitihuan.simple;

import java.util.HashMap;

public class Client {

    public static void invoker(){
        Son son = new Son();
        HashMap map = new HashMap();
        son.doSomeThing(map);
    }

    public static void main(String[] args) {
        invoker();
    }

}
