package chapter_21_zuhe;

import java.util.ArrayList;

public class Branch extends Corp {

    private ArrayList<Corp> subordinateList = new ArrayList();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }



     public void addSubordinate(Corp crop) {
        this.subordinateList.add(crop);
    }

     public ArrayList<Corp> getSubordinate() {
        return this.subordinateList;
    }
}
