import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input basic price internet package");
        double basicInternetPrice = scanner.nextDouble();
        System.out.println("Input used GB internet:");
        double usedGB = scanner.nextDouble();
        System.out.println("input minutes of talk by phone around Ukraine:");
        double minutesPhoneTalkUKR = scanner.nextDouble();
        System.out.println("Input quantity sent sms messages:");
        int quantitySentSms = scanner.nextInt();
        System.out.println("Input abroad calls zone1:");
        double abroadCallsZone1 = scanner.nextDouble();
        System.out.println("Input abroad calls zone2:");
        double abroadCallsZone2 = scanner.nextDouble();

        System.out.println("The total price is: ");
        double total = basicInternetPrice+ CountPriceGBQuantity(usedGB)+ CountPricePhoneAroundUkraine(minutesPhoneTalkUKR) +
                CountPriceSMSmessage(quantitySentSms) + CounrPriceCallsAbroadZone1(abroadCallsZone1) + CounrPriceCallsAbroadZone2(abroadCallsZone2);
        System.out.println(total);
    }

    static double CountPriceGBQuantity(double usedGB){
        double pricecount;
        if(usedGB<=8){
            return pricecount = (usedGB - 8) * 100;
        }else{
            return 0;
        }

    }

    static double CountPricePhoneAroundUkraine(double minutesPhoneTalkUKR){
        double phoneTalkUKRPrice;
        if(minutesPhoneTalkUKR <= 500){
            return phoneTalkUKRPrice = minutesPhoneTalkUKR * 0.5;

        }else{
            return phoneTalkUKRPrice = (500 * 0.5) + ((minutesPhoneTalkUKR -500) * 0.5);
        }
    }
    static double CountPriceSMSmessage(int quantitySentSms){
        double sentSmsPrice;
        if(quantitySentSms <= 50){
            return sentSmsPrice = quantitySentSms*1;

        }else {
            return sentSmsPrice = (50*1) + ((quantitySentSms-50)*1.5);
        }
    }

    static double CounrPriceCallsAbroadZone1(double abroadCallsZone1){
        double priceCallsAbroadZone1;
        return priceCallsAbroadZone1 = abroadCallsZone1 * 1.5;
    }
    static double CounrPriceCallsAbroadZone2(double abroadCallsZone2){
        double priceCallsAbroadZone2;
        return priceCallsAbroadZone2 = abroadCallsZone2 * 2;
    }
}
