package chapter_13_yuanxing;

import java.util.ArrayList;

public class Thing implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<>();


    public Thing() {
        System.out.println("构造函数被执行了...");
    }

    public void setValue(String value){
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue(){
        return this.arrayList;
    }

    @Override
    protected Object clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
