package chapter_21_zuhe;

public abstract class Corp {

   private String name;
   private String position;
   private int salary = 0;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("姓名:"+this.name);
        sb.append("\t职位:"+this.position);
        sb.append("\t薪水："+this.salary);
        return sb.toString();
    }
}
