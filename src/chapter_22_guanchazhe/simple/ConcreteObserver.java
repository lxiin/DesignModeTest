package chapter_22_guanchazhe.simple;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("接收到信息，并进行处理");
    }
}
