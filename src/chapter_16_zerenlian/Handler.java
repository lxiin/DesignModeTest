package chapter_16_zerenlian;

public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSABAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;


    private int level = 0;

    private Handler nextHander;

    public Handler(int level) {
        this.level = level;
    }

    public final void handleMessage(IWomen women){
        if (women.getType() == this.level){
            this.response(women);
        }else{
            if (this.nextHander != null){
                this.nextHander.handleMessage(women);
            }else{
                System.out.println("=====没有地方请示了。按不同意处理=========");
            }
        }
    }

    public void setNextHander(Handler nextHander) {
        this.nextHander = nextHander;
    }

    public abstract void response(IWomen women);
}
