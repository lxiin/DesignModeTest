package chapter_26_zhuangtai.simple;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentState(new ConcreteState1());
        context.handle1();
        context.handle2();
    }

}
