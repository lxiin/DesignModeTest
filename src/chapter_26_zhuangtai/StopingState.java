package chapter_26_zhuangtai;

public class StopingState extends LiftState {

    @Override
    public void open() {
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runingState);
        super.context.getLiftState();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
