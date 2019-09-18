package chapter_17_zhuangshi;

import utils.P;

public class FourthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        P.print("尊敬的XXX家长:");
        P.print("...........");
        P.print("语文53 数学54 体育98 自然64");
        P.print(" .............");
        P.print("家长签名:         ");
    }

    @Override
    public void sign(String name) {
        P.print("家长的签名为:"+name);
    }
}
