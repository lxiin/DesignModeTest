package chapter_11_jianzaozhe;

public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车启动起来了..");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停车下来了..");

    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声音是这样的..");

    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎声音是这样的..");

    }
}
