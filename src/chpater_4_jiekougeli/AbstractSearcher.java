package chpater_4_jiekougeli;

public abstract class AbstractSearcher {

    protected IPettyGirl pettyGirl;

    public AbstractSearcher(IPettyGirl pettyGirl) {
        this.pettyGirl = pettyGirl;
    }

    public abstract void show();
}
