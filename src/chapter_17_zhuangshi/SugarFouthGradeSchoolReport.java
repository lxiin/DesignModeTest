package chapter_17_zhuangshi;

import utils.P;

public class SugarFouthGradeSchoolReport extends FourthGradeSchoolReport {

    private void reportHighScore(){
        P.print("这次开始语文最高是75，数学是79，自然是80");
    }

    private void reportSort(){
        P.print("我是排名第38名");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
