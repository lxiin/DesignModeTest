package chapter_8_factory.simple2;

import chapter_8_factory.BlackHuman;
import chapter_8_factory.Human;

public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
