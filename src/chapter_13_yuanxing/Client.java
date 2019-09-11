package chapter_13_yuanxing;

import java.util.Random;

public class Client {

    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;

        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT){
            Mail cloneMail = mail.clone();
            cloneMail.setApplellation(getRandString(5)+"先生（女士）");
            cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
            sendMAil(cloneMail);
            i++;
        }
    }

    private static void sendMAil(Mail mail) {
        System.out.println("标题："+mail.getSubject()+"\t收件人:"+mail.getReceiver()+"\t..发送成功");
    }

    private static String getRandString(int max){
        String source = "abcdefghigklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ";
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < max; i++){
            stringBuffer.append(source.charAt(random.nextInt(source.length())));
        }
        return stringBuffer.toString();
    }



}
