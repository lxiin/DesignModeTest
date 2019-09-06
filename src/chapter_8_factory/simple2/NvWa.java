package chapter_8_factory.simple2;

import chapter_8_factory.Human;

public class NvWa {

    public static void main(String[] args) {
        System.out.println("---造出的时候白人");
        Human whiteHuman = new WhiteHumanFactory().createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
    }

}
