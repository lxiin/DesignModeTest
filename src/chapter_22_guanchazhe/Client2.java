package chapter_22_guanchazhe;

public class Client2 {
    public static void main(String[] args) {
        Observer lisi = new LiSi();
        Observer wangsi = new WangSi();
        Observer liusi = new LiusSi();

        Hanfeizi hanfeizi = new Hanfeizi();
        hanfeizi.addObservable(lisi);
        hanfeizi.addObservable(wangsi);
        hanfeizi.addObservable(liusi);
        hanfeizi.haveBreakfast();
    }

}
