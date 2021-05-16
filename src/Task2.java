import java.util.Scanner;

public class Task2<quantityworkHours> {
    //Расчёт зарплаты агента по продажам
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Input work hours and rate of the employee for count:\n" +
                "work hours:");
        int quantityWorkHours = scanner.nextInt();
        System.out.println("work rate employee");
        double basicRate = (double) scanner.nextDouble();
        System.out.println("Input work experience:");
        int workExperience = scanner.nextInt();
        System.out.println("Input quantity sales:");
        int quantitySales = scanner.nextInt();
        System.out.println("Input Amount sales:");
        double salesAmount = scanner.nextDouble();
        System.out.println("The total amount of salary is:");
        double salary = CountBasicSalary(quantityWorkHours,basicRate) + CountSalaryByWorkHours(quantityWorkHours,basicRate) +
                CountSalaryByWorkHoursAndWorkExperience(quantityWorkHours,basicRate,workExperience) + CountSalaryByQuantitySales(quantitySales)+
                CountSalaryByAmountSales(salesAmount);
        System.out.println(salary);
    }

    static double CountBasicSalary(int quantityworkHours, double basicRate) {
        double salary;
        return salary = 160 * basicRate;
    }


    static double CountSalaryByWorkHours(int quantityworkHours, double basicRate) {
        double salarybonus;

        if (quantityworkHours > 160) {
            return salarybonus = ((quantityworkHours - 160)*basicRate) * 1.5;
        } else {
            //System.out.println("The person doesn't get overtime bonus");
            return 0;
        }
    }

    static double CountSalaryByWorkHoursAndWorkExperience(int quantityworkHours, double basicRate, int workExperience) {
        double salaryBonus;
        switch (workExperience){
            case 0:
            case 1:
            case 2:return salaryBonus = CountBasicSalary(quantityworkHours,basicRate) *.01;

            case 3:
            case 4:return salaryBonus = CountBasicSalary(quantityworkHours,basicRate) *.012;
            case 5:
            case 6:return salaryBonus = CountBasicSalary(quantityworkHours,basicRate) *.013;
            default:return salaryBonus = CountBasicSalary(quantityworkHours,basicRate) *.014;

        }
    }

    static double CountSalaryByQuantitySales(int quantitySales){
        double salaryBonus;
        if(quantitySales > 20){
            return salaryBonus = 250.0;
        }else if(quantitySales < 10){
            return salaryBonus = -150.0;
        }else {
            return 0;
        }
}
    static double CountSalaryByAmountSales(double salesAmount){
        double salaryBonus;
        if(salesAmount > 15000){
            return salaryBonus = 1000.0;
        }else{
            return 0;
        }
    }

}
