package chapter_19_shipeiqi;

import java.util.Map;

public class OuterUserInfo implements IUserInfo {

    private Map baseMap = null;
    private Map homeMap = null;
    private Map officeMap = null;

    private IOuterUserBaseInfo baseInfo = null;
    private IOuterUserHomeInfo homeInfo = null;
    private IOuterUserOfficeInfo officeInfo = null;

    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;
        this.baseMap = baseInfo.getUserBaseInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
    }

    @Override
    public String getUserName() {
        String userName = (String) baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mb = (String) baseMap.get("mobileNumber");
        System.out.println(mb);
        return mb;
    }

    @Override
    public String getOfficeTelNumber() {
        String offb = (String) officeMap.get("officeTelNumber");
        System.out.println(offb);
        return offb;
    }

    @Override
    public String getJobPosition() {
        String job = (String) officeMap.get("jobPosition");
        System.out.println(job);
        return job;
    }

    @Override
    public String getHomeTelNumber() {
        String homeb = (String) homeMap.get("homeTelNumber");
        System.out.println(homeb);
        return homeb;
    }
}
