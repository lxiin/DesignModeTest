package chapter_26_zhuangtai;

public class ClosingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runingState);
        super.context.getLiftState();
    }

    @Override
    public void stop() {
            super.context.setLiftState(Context.stopingState);
            super.context.getLiftState();
    }
}
