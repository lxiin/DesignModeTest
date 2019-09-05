package chapter_7_danli.threadnotsafesingleton;

/**
 * 现成不安全的单例模式
 *
 * （懒汉式)
 *
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
