package chapter_19_shipeiqi;

public class Client {
    public static void main(String[] args) {
        IOuterUserBaseInfo baseInfo = new OutUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OutUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OutUserOfficeInfo();
        IUserInfo yongGirl = new OuterUserInfo(baseInfo,homeInfo,officeInfo);
        for (int i = 0; i < 101; i++){
            yongGirl.getMobileNumber();
        }
    }

}
