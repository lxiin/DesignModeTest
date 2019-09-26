package chapter_25_fangwenzhe;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        for (Employee employee  : mockEmployee()){
            employee.accept(new Visitor());
        }
    }


    public static List<Employee> mockEmployee(){
        List<Employee> empList = new ArrayList<>();
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序,绝对的兰陵、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);

        CommonEmployee liSI = new CommonEmployee();
        liSI.setJob("页面美工，审美素质太不流行了");
        liSI.setName("李四");
        liSI.setSalary(1900);
        liSI.setSex(Employee.FEMALE);
        empList.add(liSI);

        Manager wangWU = new Manager();
        wangWU.setName("王五");
        wangWU.setPerformance("基本上负值 ，但是会拍马屁");
        wangWU.setSalary(18750);
        wangWU.setSex(Employee.MALE);
        empList.add(wangWU);
        return empList;

    }
}
