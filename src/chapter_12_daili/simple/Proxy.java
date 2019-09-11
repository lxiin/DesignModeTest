package chapter_12_daili.simple;

public class Proxy implements Subject {

    private Subject subject = null;

    public Proxy(){
        subject = new Proxy();
    }

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public Proxy(Object... objects){

    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    private void before(){

    }

    private void after(){

    }
}
