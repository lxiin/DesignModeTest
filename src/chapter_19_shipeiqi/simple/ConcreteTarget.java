package chapter_19_shipeiqi.simple;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you neen any help, pls call me!");
    }
}
