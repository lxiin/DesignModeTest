package chapter_8_factory.simple3;

import java.lang.reflect.Constructor;

public class SingletonFactory {

    private static Singleton singleton;
    static {
        try {
            Class cl = Class.forName(Singleton.class.getName());
            Constructor constructor = cl.getConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        }catch (Exception e){

        }
    }


    public static Singleton getSingleton(){
        return singleton;
    }
}
