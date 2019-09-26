package chapter_26_zhuangtai;

public class Lift implements ILift {

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state){
            case OPENING_STATE:
                this.openWithoutLogic();
                this.setState(CLOSEING_STATE);
                break;
        }
//        System.out.println("电梯门打开了");
    }

    private void openWithoutLogic() {
        System.out.println("电梯门打开了");

    }

    @Override
    public void close() {
        switch (this.state){
            case OPENING_STATE:
                this.closeWIthoutLogic();
                this.setState(CLOSEING_STATE);
                break;
        }
//        System.out.println("电梯门关闭了");
    }

    private void closeWIthoutLogic() {
        System.out.println("电梯门关闭了");

    }

    @Override
    public void run() {
        if (this.state == CLOSEING_STATE){
            this.runWithOutLogic();
            this.setState(RUNNING_STATE);
        }else if (this.state == CLOSEING_STATE){
            this.runWithOutLogic();
            this.setState(RUNNING_STATE);
        }
//        System.out.println("电梯上下运行起来了...");
    }

    private void runWithOutLogic() {
        System.out.println("电梯上下运行起来了...");

    }

    @Override
    public void stop() {
        if (this.state == CLOSEING_STATE){
            this.stopWithoutLogic();
            this.setState(CLOSEING_STATE);
        }else if (this.state == RUNNING_STATE){
            this.stopWithoutLogic();
            this.setState(CLOSEING_STATE);
        }
//        System.out.println("电梯停止了...");
    }

    private void stopWithoutLogic() {
        System.out.println("电梯停止了...");
    }
}
