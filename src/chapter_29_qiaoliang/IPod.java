package chapter_29_qiaoliang;

public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的Ipod 是这样的。。。");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的ipod 卖出去了...");
    }
}
