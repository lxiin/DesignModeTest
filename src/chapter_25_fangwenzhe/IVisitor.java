package chapter_25_fangwenzhe;

public interface IVisitor {

    void visit(CommonEmployee commonEmployee);

    void visit(Manager manager);

}
