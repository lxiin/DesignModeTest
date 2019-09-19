package chapter_19_shipeiqi;

import java.util.HashMap;
import java.util.Map;

public class OutUserOfficeInfo implements IOuterUserOfficeInfo{

    @Override
    public Map getUserOfficeInfo() {

        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("homeTelNumber","这个员工的家庭电话是...");
        baseInfoMap.put("homeAddress","这个员工的家庭住址是...");
        return baseInfoMap;    }
}
