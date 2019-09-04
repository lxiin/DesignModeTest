package chapter_5_dimite;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Teacher teacher = new Teacher() ;
        List<Girl> list = new ArrayList<>();
        for(int i= 0; i < 20; i++){
            list.add(new Girl());
        }
        teacher.commond(new GroupLeader(list));
    }

}
