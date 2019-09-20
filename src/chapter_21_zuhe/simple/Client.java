package chapter_21_zuhe.simple;

public class Client {

    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
    }

    public static void display(Composite composite){
        for (Component component : composite.getChidren()){
            if (component instanceof Leaf){
                component.doSomething();
            }else{
                display((Composite) component);
            }
        }
    }

}
