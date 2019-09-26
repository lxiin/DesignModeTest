package chapter_26_zhuangtai;

public interface ILift {

    int OPENING_STATE = 1;
    int CLOSEING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPING_STATE = 4;

    void setState(int state);

    void open();
    void close();
    void run();
    void stop();
}
