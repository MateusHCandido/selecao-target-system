package target.system;

import java.util.Arrays;
import java.util.Locale;

public class Ex3 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        double [] invoicing =  {22174.1664, 24537.6698, 26139.6134, 0.0d, 0.0, 26742.6612, 0.0, 42889.2258,
                46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0,
                35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025,0.0, 0.0, 25681.8318, 1718.1221, 13220.495,
                8414.61};

        //DOCUMENT DATA IN JSON
        System.out.println("BILLING SUMMARY");
        dayLowestBilling(invoicing);
        dayBiggestBilling(invoicing);
        double monthlyAverage = monthlyAvgCalc(invoicing);
        aboveAvgBilling(invoicing, monthlyAverage);

    }

    static void dayLowestBilling(double[] dailyBilling){
        //CALCULATION OF THE LOWEST BILLING
        int day=0;
        double smaller = dailyBilling[0];
        for(int i = 1; i < dailyBilling.length; i++){
            if (smaller > dailyBilling[i] && dailyBilling[i] != 0){
                smaller = dailyBilling[i];
                day = i;
            }
        }
        System.out.println("THE LOWEST REVENUE OF THE DAY, IN A MONTH WAS: ");
        System.out.println("Day: " + day +  String.format(" U$ %.2f", smaller));
    }
    static void dayBiggestBilling(double[] dailyBilling) {
        //CALCULATION OF THE HIGHEST BILLING
        int day=0;
        double biggest = dailyBilling[0];
        for(int i = 1; i < dailyBilling.length; i++){
            if (biggest < dailyBilling[i] && dailyBilling[i] != 0){
                biggest = dailyBilling[i];
                day = i;
            }
        }
        System.out.println("THE BIGGEST REVENUE OF THE DAY, IN A MONTH WAS: U$ " + String.format("%.2f", biggest));
        System.out.println("Day: " + day +  String.format(" U$ %.2f", biggest));
    }
    static double monthlyAvgCalc(double[] dailyBilling){
        double sum = 0d;
        double average = 0d;
        for (double invoicing : dailyBilling) {
            if (invoicing != 0d) sum += invoicing;
        }
        average = sum / dailyBilling.length;
        return average;
    }
    static void  aboveAvgBilling(double[] dailyBilling, double average){
        int days = 0;
        for (double v : dailyBilling) {
            if (v > average) {
                days += 1;
            }
        }
        System.out.println("NUMBER OF DAYS IN THE MONTH IN WHICH THE DAILY BILLING VALUE WAS HIGHER THAN THE MONTHLY AVERAGE: " + days + " days");
    }
}
