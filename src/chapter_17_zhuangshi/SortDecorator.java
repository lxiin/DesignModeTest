package chapter_17_zhuangshi;

import utils.P;

public class SortDecorator extends Decorator {

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort(){
        P.print("我这次排名是38名");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
