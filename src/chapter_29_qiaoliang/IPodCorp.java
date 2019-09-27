package chapter_29_qiaoliang;

public class IPodCorp extends Corp {


    public IPodCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我转钱啊...");
    }
}
