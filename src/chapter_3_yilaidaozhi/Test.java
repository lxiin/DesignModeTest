package chapter_3_yilaidaozhi;

public class Test {

    public static void main(String[] args) {
        IDriver zhangSan = new Driver();
        ICar benz = new Benz();
        zhangSan.drive(benz);
    }
}
