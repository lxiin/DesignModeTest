package chapter_24_beiwanglu;

public class Client {

    public static void main(String[] args) {
        Boy boy = new Boy();
        Caretaker caretaker = new Caretaker();
        boy.setState("心情很棒");
        System.out.println("===========男孩现在的状态===========");
        System.out.println(boy.getState());

        caretaker.setMemento(boy.createMemento());
        boy.changeState();
        System.out.println("==============男孩追女孩子的后的状态=========");
        System.out.println(boy.getState());
        boy.restoreMemento(caretaker.getMemento());
        System.out.println("==============男孩恢复的后的状态=========");
        System.out.println(boy.getState());





    }

}
