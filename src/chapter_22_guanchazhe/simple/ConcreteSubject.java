package chapter_22_guanchazhe.simple;

public class ConcreteSubject extends Subject {

    public void doSomething(){
        super.notifyObservers();
    }

}
