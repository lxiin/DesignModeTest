package chapter_10_mobanfangfa.simple;

public abstract class AbstractClass {

    protected abstract void doSomething();
    protected abstract void doAnything();

    public void templeateMethod(){
        this.doAnything();
        this.doSomething();
    }

}
