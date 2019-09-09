package chapter_10_mobanfangfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
//        Hummer1Model h1 = new Hummer1Model();
//        h1.run();
//        Hummer2Model h2 = new Hummer2Model();
//        h2.run();


        System.out.println("============H1型号悍马===============");
        System.out.println("H1型号的悍马是否需要喇叭声？ 0 -不需要 1-需要");
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        Hummer1Model h1 = new Hummer1Model();
        if (type.equals("0")){
            h1.setAlarmFlag(false);
        }
        h1.run();
        System.out.println("==============H2型号悍马=========");
        Hummer2Model h2 = new Hummer2Model();
        h2.run();
    }
}
