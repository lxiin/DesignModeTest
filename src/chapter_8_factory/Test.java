package chapter_8_factory;

public class Test {

    public static void main(String[] args) {
         System.out.println("早出的第一批人是白色人种....");
        Human wihteHuman = HumanFactory.createHuman(WhiteHUman.class);
        wihteHuman.getColor();
        wihteHuman.talk();

        System.out.println("造出的第二批人是黑色人种...");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("造出第三批人是黄色人种...");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }

}
