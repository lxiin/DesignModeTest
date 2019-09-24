package chapter_24_beiwanglu.simple;

public class Originator implements Cloneable{

    private String state;

    private Originator backup;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void createMemnto(){
        this.backup = this.clone();
    }

    public void restoreMemento( ){
        this.state = backup.getState();
    }

    @Override
    protected Originator clone()   {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
