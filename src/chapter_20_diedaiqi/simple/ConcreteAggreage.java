package chapter_20_diedaiqi.simple;

import java.util.Vector;

public class ConcreteAggreage implements Aggregate {

    private Vector vector = new Vector();

    @Override
    public void add(Object o) {
        this.vector.add(o);
    }

    @Override
    public void remove(Object object) {
        this.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
