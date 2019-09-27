package chapter_29_qiaoliang;

public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出房子是这样....");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的房子卖出去了...");
    }
}
