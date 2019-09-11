package chapter_12_daili;

public class Client {


    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = player.getProxy();
        System.out.println("开始时间2019-09-10 14:00");
        proxy.login("zhangsan","123456");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间2019-09-10 14:17");
    }

}
