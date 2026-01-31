
package day2_practice.conditions;
import java.util.Scanner;

public class Taxcalculate{
    public static void main(String[] args) {
        System.out.println("enter the salary in lakhs");
        Scanner scst = new Scanner(System.in);
        double salary = scst.nextDouble();
        if (salary >= 10) {
            System.out.println("tax 30%");
        } else if (salary >= 5 ) {
            System.out.println("tax 20%");
        } else if (salary >= 2.5) {
            System.out.println("tax 10%");
        } else {
            System.out.println("no tax");
        }
    }}