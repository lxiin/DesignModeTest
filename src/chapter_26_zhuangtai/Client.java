package chapter_26_zhuangtai;

public class Client {

    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(ILift.STOPING_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }

}
