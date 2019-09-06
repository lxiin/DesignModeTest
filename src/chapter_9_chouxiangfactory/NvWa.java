package chapter_9_chouxiangfactory;

public class NvWa {

    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        System.out.println("=-=---开始生产黄种女人------");
        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();

        System.out.println("=-=---开始生产黄种男人------");
        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();
        femaleYellowHuman.talk();

    }
}
