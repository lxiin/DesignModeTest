package chapter_21_zuhe;

import java.util.ArrayList;

public interface IRoot {

    String getInfo();

    void add(IBranch branch);

    void add(ILeaf leaf);

    ArrayList getSubordinateInfo();

}
