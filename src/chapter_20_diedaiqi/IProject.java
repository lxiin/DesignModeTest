package chapter_20_diedaiqi;

public interface IProject {

    void add(String name,int num, int cost);

    String getProjectInfo();

    IProjectIterator iterator();

}
