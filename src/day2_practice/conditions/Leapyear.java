package day2_practice.conditions;
import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scst = new Scanner(System.in);
        int year = scst.nextInt();
        if(year%4==0){
            System.out.println(year +" is a leap year");
        }
        else{
            System.out.println(year +" is not a leap year");
        }
    }}
