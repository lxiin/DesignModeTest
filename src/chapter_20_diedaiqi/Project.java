package chapter_20_diedaiqi;

import java.util.ArrayList;

public class Project implements IProject {

    private ArrayList<IProject> projectList = new ArrayList<>();


    private String name;
    private int num;
    private int cost;

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name,num,cost));
    }

    @Override
    public String getProjectInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("项目名称是:"+name+"\t");
        sb.append("项目人数是:"+num+"\t");
        sb.append("项目费用是:"+cost+"");
        return sb.toString();
    }

    @Override
    public IProjectIterator iterator() {
        return (IProjectIterator) new ProjectIterator(this.projectList);
    }
}
