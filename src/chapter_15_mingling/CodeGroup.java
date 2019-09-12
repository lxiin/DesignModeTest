package chapter_15_mingling;


import utils.P;

public class CodeGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到代码组...");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项功能...");

    }

    @Override
    public void delete() {
        P.print("客户要求删除一项功能....");
    }

    @Override
    public void change() {
        P.print("客户要求修改一项功能....");
    }

    @Override
    public void plan() {
        P.print("客户要求代码变更计划...");
    }
}
