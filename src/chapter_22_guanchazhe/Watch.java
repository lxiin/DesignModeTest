package chapter_22_guanchazhe;

public class Watch extends Thread {

    private Hanfeizi hanfeizi;

    private LiSi liSi;

    private String type;

    public Watch(Hanfeizi hanfeizi, LiSi liSi, String type) {
         this.hanfeizi = hanfeizi;
        this.liSi = liSi;
        this.type = type;
    }

    @Override
    public void run() {
        super.run();
        while (true){
//            if (this.type.equalsIgnoreCase("breakfast")){
//                if (this.hanfeizi.isHavingBreakfast()){
//                    this.liSi.update("韩非子在吃饭");
//                    this.hanfeizi.setHavingBreakfast(false);
//                }
//            }else{
//                if (this.hanfeizi.isHavingFun()){
//                    this.liSi.update("韩非子在娱乐");
//                    this.hanfeizi.setHavingFun(false);
//                }
//            }
        }
    }
}
