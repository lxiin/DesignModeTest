package chapter_20_deidaiqi.simple;

public interface Aggregate {

    void add(Object o);

    void remove(Object object);

    Iterator iterator();

}
