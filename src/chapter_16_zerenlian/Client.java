package chapter_16_zerenlian;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.ArrayList;
import java.util.Random;

public class Client {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            arrayList.add(new Women(random.nextInt(4),"我要出去逛街"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNextHander(husband);
        husband.setNextHander(son);
        for (IWomen women : arrayList){
            father.handleMessage(women);
        }

    }

}
