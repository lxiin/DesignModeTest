package chapter_20_deidaiqi;

public interface IProject {

    void add(String name,int num, int cost);

    String getProjectInfo();

    IProjectIterator iterator();

}
