package chapter_28_xiangyuan;

import java.util.HashMap;

public class SignInfoFactory {

    private static HashMap<String,SignInfo> pool = new HashMap<>();


    @Deprecated
    public static SignInfo getSignInfo(){
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key){
        SignInfo result = null;
        if (!pool.containsKey(key)){
            System.out.println(key +"==========建立对象，并放置到池中");
            result = new SignInfo4Pool(key);
            pool.put(key,result);
        }else{
            result = pool.get(key);
            System.out.println(key + "============直接从池中获得");
        }
        return result;
    }


}
