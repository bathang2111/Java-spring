package employee;


import java.util.UUID;

public class Employee extends Common {
    private String id;
    private String name;
    protected float salary;

    public Employee(String name, float salary) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.salary = salary;
    }

    public void showInfo(){
        System.out.println("========Employee==========");
        System.out.println("id: "+this.getId());
        System.out.println("name: "+this.getName());
        System.out.println("salary: "+this.getSalary());
    }

    public  class Student {
        private String name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary=super.caculator(salary);
    }
}

//public class Manager extends Employee{
//
//    private float bonutProject;
//    public float getBonutProject() {
//        return bonutProject;
//    }
//
//    public void setBonutProject(float bonutProject) {
//        this.bonutProject = bonutProject;
//    }
//
//}
