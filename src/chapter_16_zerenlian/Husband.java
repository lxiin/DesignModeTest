package chapter_16_zerenlian;

public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSABAND_LEVEL_REQUEST);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("=============妻子向丈夫请示---------------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是同意");
    }
}
