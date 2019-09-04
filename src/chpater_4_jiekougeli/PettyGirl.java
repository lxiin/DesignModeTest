package chpater_4_jiekougeli;

public class PettyGirl implements IGoodBodyGirl,IGreatTempermaentGirl {

    private String name;

    public PettyGirl(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name+"脸蛋很漂亮...");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name+"身材非常棒...");

    }

    @Override
    public void greatTemperamnet() {
        System.out.println(this.name+"气质非常好...");

    }
}
