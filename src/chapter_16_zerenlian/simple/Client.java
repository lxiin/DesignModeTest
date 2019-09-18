package chapter_16_zerenlian.simple;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreateHandler1();
        Handler h2 = new ConcreateHandler2();
        Handler h3 = new ConcreateHandler3();
        h1.setNextHander(h2);
        h2.setNextHander(h3);
        Response response = h1.handleMessage(new Request());
    }
}
