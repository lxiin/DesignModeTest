package chapter_7_danli;

public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton(){

    }

    public static Singleton getSingleton(){
        return singleton;
    }

    public static void doSomeThing(){

    }



}
