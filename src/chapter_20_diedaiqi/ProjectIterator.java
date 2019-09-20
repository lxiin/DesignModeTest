package chapter_20_diedaiqi;

import java.util.ArrayList;

public class ProjectIterator implements IProjectIterator {

    private ArrayList<IProject> projects = new ArrayList<>();
    private  int currentItem = 0;

    public ProjectIterator(ArrayList<IProject> projects) {
        this.projects = projects;
    }

    @Override
    public boolean hasNext() {

        boolean b = true;
        if (this.currentItem >= projects.size() || this.projects.get(this.currentItem) == null){
            b = false;
        }
        return b;
    }

    @Override
    public IProject next() {
        return this.projects.get(this.currentItem++);
    }

    @Override
    public void remove() {

    }
}
