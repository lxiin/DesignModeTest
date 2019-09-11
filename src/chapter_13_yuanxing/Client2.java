package chapter_13_yuanxing;

public class Client2 {

    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("张三");
        Thing cloneThing = (Thing) thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }

}
