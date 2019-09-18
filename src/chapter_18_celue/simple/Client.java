package chapter_18_celue.simple;

public class Client {

    public static void main(String[] args) {
        Strategy strategy = new ConcreteStartegy1();
        Context context = new Context(strategy);
        context.doAnything();
     }

}
