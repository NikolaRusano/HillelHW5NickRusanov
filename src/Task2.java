import java.util.Scanner;

public class Task2 {
    //Расчёт зарплаты агента по продажам
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Input work hours and rate of the employee for count:\n" +
                "work hours:");
        int quantityWorkHours = scanner.nextInt();
        System.out.println("work rate employee");
        double basicRate = scanner.nextDouble();
        System.out.println("Input work experience:");
        int workExperience = scanner.nextInt();

    }

    static double CountSalary(int quantityworkHours, double basicRate) {
        double salary;
        return salary = quantityworkHours * basicRate;
    }


    static double CountSalaryByWorkHours(salary, double basicRate) {
        double salarybonus;
        if (quantityworkHours >= 0 & quantityworkHours <= 160) {
            return salarybonus = 1;

        } else if (quantityworkHours > 160) {
            return salarybonus = CountSalary(quantityworkHours - 160, basicRate) * 1.5;
        } else {
            System.out.println("Incorrect input");
            return 0;
        }
    }

    static double CountSalaryByWorkHoursAndWorkExperience(int quantityworkHours, double basicRate, int workExperience) {
        double salary;
        if (quantityworkHours >= 0 & quantityworkHours <= 160) {
            if (workExperience <= 2) {
                return salary = CountSalary(quantityworkHours, basicRate) * 1;
            } else if (workExperience > 2 & workExperience <= 4) {
                return salary = CountSalary(quantityworkHours, basicRate) * 1.2;
            } else if (workExperience > 4 & workExperience <= 6) {
                return salary = CountSalary(quantityworkHours, basicRate) * 1.2;
            } else if (workExperience > 6) {
                return salary = CountSalary(quantityworkHours, basicRate) * 1.2;
            }
        }
    }

    static double CountSalaryByQuantitySales(int quantityworkHours, double basicRate, int workExperience){

}

}
