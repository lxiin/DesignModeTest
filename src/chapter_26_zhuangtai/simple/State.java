package chapter_26_zhuangtai.simple;


public abstract class State {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle1();
    public abstract void handle2();
}
