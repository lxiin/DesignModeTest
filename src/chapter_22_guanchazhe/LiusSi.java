package chapter_22_guanchazhe;

public class LiusSi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("刘斯：观察到韩非子活动，开始作了...");
        this.happy(context);
        System.out.println("刘斯：乐死了..");
    }

    private void happy(String str){
        System.out.println("刘斯:因为:"+str+",---所以我快乐啊");
    }
}
