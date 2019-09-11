package chapter_14_zhongjiezhe;

public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        if (str.equalsIgnoreCase("purchase.buy")){
            this.buyIBMComputer((Integer) objects[0]);
        }else if (str.equalsIgnoreCase("sale.sell")){
            this.sellIBMComputer((Integer) objects[0]);
        } else if (str.equalsIgnoreCase("sale.offsell")) {
            this.offSell();
        }else if (str.equalsIgnoreCase("stock.clear")){
            this.clearStock();
        }
    }
    public void offSell(){

        System.out.println("折价销售IBM电脑:"+stock.getStockNumber()+"台");
    }

    public void sellIBMComputer(int num){


        if (super.stock.getStockNumber() < num){
            super.purchase.buyIBMComputer(num);
        }
        System.out.println("销售IBM电脑"+num+"台");
        super.stock.decrease(num);
    }


    public void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }


    public void buyIBMComputer(int num){


        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80){
            System.out.println("采购IBM电脑:"+num+"台");
        }else{
            int buyNumer = num /2;
            System.out.println("采购IBM电脑:"+buyNumer+"台");
        }
    }

}
