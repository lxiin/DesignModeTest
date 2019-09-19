package chapter_19_shipeiqi;

import java.util.HashMap;
import java.util.Map;

public class OutUserHomeInfo implements IOuterUserHomeInfo{


    @Override
    public Map getUserHomeInfo() {

        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("jobPosition","这个人的职位是Boss...");
        baseInfoMap.put("officeTelNumber","这个员工的办公室电话是...");
        return baseInfoMap;    }
}
