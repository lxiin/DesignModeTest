package chapter_21_zuhe;

import java.util.ArrayList;

public interface IBranch extends ICrop {

    void addSubordinate(ICrop crop);

    ArrayList<ICrop> getSubordinate();

//    String getInfo();
//
//    void add(IBranch branch);
//
//    void add(ILeaf leaf);
//
//    ArrayList getSubordinateInfo();

}
