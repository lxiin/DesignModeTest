package chapter_2_lishitihuan.simple;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father {

     public Collection doSomeThing(HashMap map){
        System.out.println("子类被执行");
        return map.values();
    }

}
