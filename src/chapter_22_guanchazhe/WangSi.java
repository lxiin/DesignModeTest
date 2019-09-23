package chapter_22_guanchazhe;

public class WangSi implements Observer {


    @Override
    public void update(String context) {
        System.out.println("王斯：观察到韩非子活动，自己也开始活动了");
        this.cry(context);
        System.out.println("王斯：哭死了....");
    }

    private void cry(String str){
        System.out.println("王斯：因为"+str+"，--所以我伤悲啊");
    }
}
