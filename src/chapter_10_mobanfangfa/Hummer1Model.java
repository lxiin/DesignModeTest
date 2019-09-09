package chapter_10_mobanfangfa;

public class Hummer1Model extends HummerModel {

    private boolean alarmFlag = true;


    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");

    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");

    }


    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}
