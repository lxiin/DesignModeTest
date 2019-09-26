package chapter_26_zhuangtai;

public class Context {

    public final static OpenningState openingState = new OpenningState();
    public final static ClosingState closingState = new ClosingState();
    public final static RuningState runingState = new RuningState();
    public final static StopingState stopingState = new StopingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }
}
