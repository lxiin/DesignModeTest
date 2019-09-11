package chapter_14_zhongjiezhe;

public class Stock extends AbstractColleague {

    private static int COMPUTER_NUM = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public void increase(int num){
        COMPUTER_NUM = COMPUTER_NUM + num;
        System.out.println("库存数量为:"+COMPUTER_NUM);
    }

    public void decrease(int num){
        COMPUTER_NUM = COMPUTER_NUM - num;
        System.out.println("库存数量为:"+COMPUTER_NUM);

    }

    public int getStockNumber(){
        return COMPUTER_NUM;
    }

    public void clearStock(){

        super.mediator.execute("stock.clear");
    }



}
