package chapter_17_zhuangshi;

import utils.P;

public class HightScoreDecorator extends Decorator {

    public HightScoreDecorator(SchoolReport sr) {
        super(sr);
    }


    private void reportHighScore(){
        P.print("这次开始语文最高是75，数学是79，自然是80");
    }



    @Override
    public void report() {
        this.reportHighScore();
        super.report();
     }
}
