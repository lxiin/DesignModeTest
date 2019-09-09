package chapter_11_jianzaozhe;

public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车 启动起来。。。");

    }

    @Override
    protected void stop() {
        System.out.println("奔驰车 停止下来了。。。");

    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车的喇叭声音是这样的");

    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车的引擎声音是这样的");

    }
}
