package chapter_26_zhuangtai;

public class CLient2 {

    public static void main(String[] args) {
        Context context = new Context();
        ClosingState closingState = new ClosingState();
        closingState.setContext(context);
        context.setLiftState(closingState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
