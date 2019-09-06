package chapter_8_factory.simple2;

import chapter_8_factory.Human;
import chapter_8_factory.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
