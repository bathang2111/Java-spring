package employee;

import java.awt.geom.Area;
import java.util.*;

public class Main {

    private static List<Employee> list = new ArrayList<Employee>();
//    private static List<List<Employee>> emp=new ArrayList<>();


    public static void main(String[] args) {
//add employee to list;

        list.add(new Employee("thang", 10000));
        list.add(new Employee("ly", 12000));
        list.add(new Employee("ngu", 111));
        list.add(new Employee("hoa", 5000));
        list.add(new Employee("an", 10000));

        //add manager to list
        String name1 = "le van luyen";
        float salary1 = 10000;
        float bonut = 1000;
        Makerter namager = new Makerter(name1, salary1, bonut);
        System.out.println(namager.getSalary());
        namager.setSalary(salary1, bonut);
        list.add(namager);


        //////////////////////////////////
        int choose = 0;
        boolean check = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("==============Emoloyee Admin==============");
            System.out.println("1: Thêm nhân viên");
            System.out.println("2: Xem danh sách nhân viên");
            System.out.println("3: Tìm kiếm nhân viên theo lương");
            System.out.println("4: Sắp xếp nhân viên theo họ tên");
            System.out.println("5: Sắp xếp nhân viên theo thu nhập");
            System.out.println("6: Danh sách 5 người lương cao nhất");
            System.out.println("7: Thoát");

            choose = sc.nextInt();
//            sc.nextLine();

            switch (choose) {
                case 1:
                    Employee emp = addEmployee();
                    System.out.println("-----------------");
                    list.add(emp);
                    for (Employee e : list) {
                        System.out.println(e.getId());
                    }
                    break;
                case 2:
                    seeAllEmp(list);
                    break;
                case 3:
                    searchEmpBySalary(list);
                    break;
                case 4:
                    searchEmpByName();
                    break;
                case 5:
                    sortEmpByIncome(list);
                    break;
                case 6:
                    listFiveEmpBestSalary();
                    break;
                default:
                    choose = 0;
                    break;
            }
            if (choose == 0) check = false;
        } while (check == true);


        sc.close();
    }

    public static Employee addEmployee() {
        // test tham chieu tham tri
//        List<Employee> emp1 = new ArrayList<Employee>(list);
//        String name1="ly";
//        float salary1 = 123;
//        Employee e=new Employee(name1,salary1);
//        emp1.add(e);
//        System.out.println("---------------");
//        System.out.println(emp1.size());
//        System.out.println(list.size());
//        System.out.println("---------------");
        System.out.println("Them nhan vien");
        Scanner sc = new Scanner(System.in);
        String name;
        float salary;
        System.out.println("Ten:");
        name = sc.nextLine();
        System.out.println("salary");
        salary = (float) sc.nextDouble();

        Employee emp = new Employee(name, salary);
        return emp;

    }

    public static void seeAllEmp(List<Employee> employees) {
        employees.forEach((e) -> e.showInfo());
    }

    public static void searchEmpBySalary(List<Employee> employee) {
        List<Employee> emp = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong");
        float salary = (float) sc.nextDouble();
        for (Employee e : employee) {
            if (e.getSalary() == salary) {
                emp.add(e);
            }
        }
        if (emp.size() > 0) {
            for (Employee e : emp) {
                System.out.println(e.getName());
            }
        } else {
            System.out.println("khong tim thay");
        }
    }

    public static void searchEmpByName() {
    }

    public static void sortEmpByIncome(List<Employee> employee) {
        employee.sort((e1,e2)->{
            if (e1.getSalary()-e2.getSalary()>0){
                return 1;
            }else if (e1.getSalary()-e2.getSalary()<0){
                return -1;
            }else return 0;
        });
        employee.forEach(e-> e.showInfo());
    }

    public static void listFiveEmpBestSalary() {

    }
}
