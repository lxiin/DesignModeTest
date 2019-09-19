package chapter_19_shipeiqi;

public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("这个是员工的姓名");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("这个是员工的家庭住址");

        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("这个是员工的手机号码");

        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("这个是员工的办公室号码");

        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这个是员工的职位名称");

        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("这个是员工的家庭电话号码");

        return null;
    }
}
