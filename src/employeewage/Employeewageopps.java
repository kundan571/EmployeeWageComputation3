package employeewage;

public class Employeewageopps {
    public int employeeCheck(){
        int IS_FULL_TIME = 1;
        int empCheck =  (int)Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME){
            System.out.println("Employee is present");
        }
        else{
            System.out.println("Employee is absent");
        }
        return empCheck;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        Employeewageopps empCheck = new Employeewageopps();
        int isPresent = empCheck.employeeCheck();

    }
}
