package employee;


import java.util.UUID;

public class Manager extends Employee {
    private float bonut;

    public Manager(String name, float salary, float bonut) {
        super(name, salary);
        this.bonut = bonut;
    }

    public void setSalary(float salary, float bonut) {
        System.out.println("manager");
        super.salary = super.caculator(salary, bonut, "manager");

    }

    public void setBonut(float bonut) {
        this.bonut = bonut;
    }

    public float getBonut() {
        return bonut;
    }

    public void showInfo() {
        System.out.println("===========Manager==========");
        System.out.println("id: " + super.getId());
        System.out.println("name: " + super.getName());
        System.out.println("salary: " + super.getSalary());
        System.out.println("bonut: " + this.getBonut());
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
