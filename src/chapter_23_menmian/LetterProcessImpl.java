package chapter_23_menmian;

public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写信得内容,,,"+context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址及姓名："+address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放在信封中....");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信件/...");
    }
}
