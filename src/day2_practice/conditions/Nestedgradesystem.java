package day2_practice.conditions;
import java.util.Scanner;

public class Nestedgradesystem {
    public static void main(String[] args) {
        Scanner scst = new Scanner(System.in);
        int marks = scst.nextInt();
        if(marks>=90){
            System.out.println("Grade A");
        }
        else if (marks>=80)
        {System.out.println("Grade B");
        }
        else if (marks>=70)
        {System.out.println("Grade C");
        }
        else if (marks>=60)
        {System.out.println("Grade D");
        }else {
            System.out.println("Grade F");}
    }
}
