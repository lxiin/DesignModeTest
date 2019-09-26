package chapter_26_zhuangtai;

public class OpenningState extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯门开启了...");

    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
