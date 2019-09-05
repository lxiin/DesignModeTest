package chapter_7_danli.threadnotsafesingleton;

public class Test {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton);

        System.out.println("=======================");

        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton1 = Singleton.getInstance();

                System.out.println(singleton1);
            }
        }).start();

    }

}
