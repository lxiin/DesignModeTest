package chapter_16_zerenlian;

public class Son extends Handler{

    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("---------------母亲向儿子请示--------------");
        System.out.println("母亲的请示是:"+women.getRequest());
        System.out.println("儿子的答复是:同意");
    }
}
