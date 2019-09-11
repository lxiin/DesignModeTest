package chapter_14_zhongjiezhe;

public class Purchase extends AbstractColleague{

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyIBMComputer(int num){
        super.mediator.execute("purchase.buy",num);
    }

    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }

}
