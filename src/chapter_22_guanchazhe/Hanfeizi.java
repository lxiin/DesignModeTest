package chapter_22_guanchazhe;

import java.util.ArrayList;

public class Hanfeizi implements IHanfeizi,Observable {


    private ArrayList<Observer> observerList = new ArrayList<>();


    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了....");
        this.notifyOvservers("韩非子在吃饭");
     }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了....");
        this.notifyOvservers("韩非子在娱乐");
    }


    @Override
    public void addObservable(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void deleteObservable(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyOvservers(String context) {
        for (Observer observer : observerList){
            observer.update(context);
        }
    }
}
