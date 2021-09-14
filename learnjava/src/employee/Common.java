package employee;

public class Common {
    public float caculator(float salary) {
        if (salary <= 9000) {
            return salary;
        } else if (salary >= 9000 && salary <= 15000) {
            return (float) (salary * 0.9);
        } else {
            return (float) (salary * (1 - 0.12));
        }
    }

    public float caculator(float salary, float plus, String check) {
        float income;
        if (check == "manager") {
            income = salary + plus;
        } else {
            income = (float) (salary + (plus * 0.1));
        }

        if (income <= 9000) {
            return income;
        } else if (income >= 9000 && income <= 15000) {
            return  (float) (income * 0.9);
        } else {
            return (float) (income * (1 - 0.12));
        }
    }
}
