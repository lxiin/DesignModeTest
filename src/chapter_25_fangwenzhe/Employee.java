package chapter_25_fangwenzhe;

public abstract class Employee {

    public final static int MALE = 0;
    public final static int FEMALE = 1;

    private String name;
    private int salary;
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public final void report(){
        StringBuilder sb = new StringBuilder();
        sb.append("姓名："+this.name+"\t");
        sb.append("性别:"+(this.sex == FEMALE ? "女" : "男")+"\t");
        sb.append("薪水:"+this.salary+"\t");
        System.out.println(sb.toString());
    }

    public abstract void accept(IVisitor visitor);

}
