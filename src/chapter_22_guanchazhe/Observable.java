package chapter_22_guanchazhe;

public interface Observable {

    void addObservable(Observer observer);

    void deleteObservable(Observer observer);

    void notifyOvservers(String context);


}
