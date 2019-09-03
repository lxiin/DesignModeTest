package chapter_2_lishitihuan;

public class AUG extends Rifle {

    public void zoomOut(){
        System.out.println("通过望远镜观察敌人");
    }

    @Override
    void shoot() {
        System.out.println("AUG 射击..");
    }
}
