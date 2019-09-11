package chapter_12_daili;

public interface IGamePlayer {

    void login(String user,String password);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();

}
