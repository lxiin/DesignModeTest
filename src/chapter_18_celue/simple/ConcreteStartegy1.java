package chapter_18_celue.simple;

public class ConcreteStartegy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1 的运算法则");
    }
}
