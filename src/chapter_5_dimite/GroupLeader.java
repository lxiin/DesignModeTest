package chapter_5_dimite;

import java.util.List;

public class GroupLeader {

    private List<Girl> list;

    public GroupLeader(List<Girl> list) {
        this.list = list;
    }

    public void countGirls( ){
        System.out.println("女生的数量是:"+list.size());
    }

}
