package chapter_17_zhuangshi;

public class Father {

    public static void main(String[] args) {
        SchoolReport sr ;
        sr = new FourthGradeSchoolReport();
        sr = new HightScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("李四");
    }

}
