package chapter_12_daili.simple2;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Subject subject){
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] classes = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHanlder(subject);
        return newProxyInstance(loader,classes,handler);
    }

}
