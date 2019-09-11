package chapter_14_zhongjiezhe;

import java.util.Random;

public class Sale extends AbstractColleague{

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellIBMComputer(int num){
        super.mediator.execute("sale.sell",num);
        System.out.println("销售IBM电脑"+num+"台");
    }

    public int getSaleStatus(){
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为:"+saleStatus);
        return saleStatus;
    }

    public void offSale(){
        super.mediator.execute("sale.offsell");

    }



}
