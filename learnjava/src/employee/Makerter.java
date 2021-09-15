package employee;


import java.util.Objects;

public class Makerter extends Employee {
    private float kpi;

    public Makerter(String name, float salary, float kpi) {
        super(name, salary);
        this.kpi = kpi;
    }

    public void setSalary(float salary, float bonut) {
        super.salary = super.caculator(salary, bonut, "maketter");

    }


    public float getKpi() {
        return kpi;
    }

    public void setKpi(float kpi) {
        this.kpi = kpi;
    }

    public void showInfo() {
        System.out.println("===========Manager==========");
        System.out.println("id: " + super.getId());
        System.out.println("name: " + super.getName());
        System.out.println("salary: " + super.getSalary());
        System.out.println("bonut: " + this.getKpi());
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
