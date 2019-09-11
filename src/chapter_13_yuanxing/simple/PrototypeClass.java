package chapter_13_yuanxing.simple;

public class PrototypeClass implements Cloneable {

    @Override
    protected PrototypeClass clone() {
        PrototypeClass p = null;

        try {
            p = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}
