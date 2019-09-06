package chapter_9_chouxiangfactory;

public abstract class AbstractYellowHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黄种人的皮肤颜色是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说话，一般是双字节");
    }
}
