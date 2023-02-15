package employeewage;

public class Employeewageopps {
     int IS_FULL_TIME = 2;
     int IS_PART_TIME = 1;
     int EMP_RATE_PER_HOUR = 20;
    public int employeeCheck(){
        int empCheck =  (int) Math.floor((Math.random() * 10) % 3);
        return empCheck;
    }
    public int dailyWageOfEmployee(int empCheck){
        int empHrs = 0;
        int totalWage = 0;
        if (empCheck == IS_PART_TIME){
            empHrs = 4;
        }
        else if (empCheck == IS_FULL_TIME){
            empHrs = 8;
        }
        else {
            empHrs = 0;
        }
        totalWage = empHrs * EMP_RATE_PER_HOUR;
        return totalWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        Employeewageopps employee = new Employeewageopps();
        int isPresent = employee.employeeCheck();
        System.out.println(employee.dailyWageOfEmployee(isPresent));
    }
}