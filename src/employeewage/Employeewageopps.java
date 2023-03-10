package employeewage;

public class Employeewageopps {
     static final int IS_FULL_TIME = 1;
     static final int EMP_RATE_PER_HOUR = 20;
     static final int IS_PART_TIME = 2;
     static final int NO_OF_WORKING_DAYS = 20;
     static final int NO_OF_WORKING_HOURS = 100;
     static int employeeCheck(){
        int empCheck = (int) Math.floor((Math.random() * 10) % 3);
        return empCheck;
    }
    public int dailyWageOfEmployee() {
        int empHrs = 0;
        int totalHrs = 0;
        int totalWage = 0;
        int totalWorkingDays = 0;
        while (totalWorkingDays < NO_OF_WORKING_DAYS) {
            totalWorkingDays++;
            switch (employeeCheck()) {
                //checking if Part time or not
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                //checking if full time or not
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalHrs+=empHrs;
            System.out.println("Day: " + totalWorkingDays + " " + "Emp hr: " + totalHrs);
        }
        totalWage = totalHrs * EMP_RATE_PER_HOUR;
        return totalWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        Employeewageopps employee = new Employeewageopps();
        System.out.println("Total Wage: " + employee.dailyWageOfEmployee());
    }
}