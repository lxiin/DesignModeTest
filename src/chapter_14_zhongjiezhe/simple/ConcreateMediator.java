package chapter_14_zhongjiezhe.simple;

public class ConcreateMediator extends Mediator {

    @Override
    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod1();
    }

    @Override
    public void doSomething2() {
        super.c1.depMethod1();
        super.c2.depMethod1();
    }
}
