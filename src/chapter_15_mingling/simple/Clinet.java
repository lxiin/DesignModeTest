package chapter_15_mingling.simple;

public class Clinet {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command command = new ConcreteCommand1();
        invoker.setCommand(command);
        invoker.action();
    }
 }
