package chapter_20_deidaiqi;

import java.util.ArrayList;

public class Boss {

    public static void main(String[] args) {
        IProject project = new Project();
        project.add("星球大战ddd",10,10000);
        project.add("扭转时空",1000,100000);
        project.add("超人改造",10000,10000000);

        for (int i = 4; i < 104; i++){
            project.add("第"+i+"个项目",i * 5, i * 100000);
        }

        IProjectIterator projectIterator = (IProjectIterator) project.iterator();
        while (projectIterator.hasNext()){
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }

}
