package chapter_25_fangwenzhe.simple;

import java.util.Random;

public class ObjectStruture {

    public static Element createElement(){
        Random random = new Random();
        if (random.nextInt(100) > 50){
            return new ConcreteElement1();
        }else{
            return new ConcreteElement2();
        }
    }

}
