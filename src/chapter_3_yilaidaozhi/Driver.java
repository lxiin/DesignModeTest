package chapter_3_yilaidaozhi;

public class Driver implements IDriver{

    @Override
    public void drive(ICar car) {
        car.run();
    }
}
