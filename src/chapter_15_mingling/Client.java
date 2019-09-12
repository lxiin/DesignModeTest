package chapter_15_mingling;

import utils.P;

public class Client {

    public static void main(String[] args) {
        Invoker xiaoSan = new Invoker();
        P.print("-------------客户要求增加一项需求============");
        Command command = new DeletePageCommand();
        xiaoSan.sendCommand(command);
        xiaoSan.action();
    }

}
