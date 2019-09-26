package chapter_26_zhuangtai;

public class RuningState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯上下文运行....");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stopingState);
        super.context.getLiftState();
    }
}
