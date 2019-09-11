package chapter_12_daili.simple2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHanlder implements InvocationHandler {

    private Object target = null;

    public MyInvocationHanlder(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(this.target,args);
    }
}
