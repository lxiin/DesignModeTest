package chapter_21_zuhe.simple;

import java.util.ArrayList;

public class Composite extends Component {

    private ArrayList<Component> componentArrayList = new ArrayList<>();

    public void add(Component component){
        this.componentArrayList.add(component);
    }

    public void remove(Component component){
        this.componentArrayList.remove(component);
    }

    public ArrayList<Component> getChidren(){
        return this.componentArrayList;
    }

}
