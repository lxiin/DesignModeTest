package chapter_11_jianzaozhe;

import java.util.ArrayList;

public class Client3 {

    public static void main(String[] args) {

        Director director = new Director();
        for (int i = 0; i < 10; i++){
            director.getABenzModel().run();
        }

        for (int i = 0; i < 10; i++){
            director.getBBenzModel().run();
        }

        for (int i = 0; i < 10;i++){
            director.getDBMWModel().run();
        }
    }

}
