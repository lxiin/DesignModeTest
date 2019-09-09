package chapter_10_mobanfangfa.simple;

public class Client {

    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        class1.templeateMethod();
        class2.templeateMethod();
    }

}
