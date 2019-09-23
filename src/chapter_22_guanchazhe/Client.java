package chapter_22_guanchazhe;

public class Client {

    public static void main(String[] args) throws InterruptedException {
//        LiSi liSi = new LiSi();
//        Hanfeizi hanfeizi = new Hanfeizi();
//
//        Watch watchBreakfast = new Watch(hanfeizi,liSi,"breakfast");
//        watchBreakfast.start();
//        Watch watchFun = new Watch(hanfeizi,liSi,"fun");
//        watchFun.start();
//
//        Thread.sleep(1000);
//
//        hanfeizi.haveBreakfast();
//        Thread.sleep(1000);
//        hanfeizi.haveFun();
        Hanfeizi hanfeizi = new Hanfeizi();
        hanfeizi.haveBreakfast();
        hanfeizi.haveFun();

    }

}
