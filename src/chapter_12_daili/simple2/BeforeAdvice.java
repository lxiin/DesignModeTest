package chapter_12_daili.simple2;

public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我就是前置通知 我被执行了");
    }
}
