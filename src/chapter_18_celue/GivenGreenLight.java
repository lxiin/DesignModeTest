package chapter_18_celue;

import utils.P;

public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        P.print("求吴国太开绿灯，放行");
    }


}
