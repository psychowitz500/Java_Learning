package day3_practice.loops;
import  java.util.Scanner;



public class calculatormenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println(" -----menu-----");
            System.out.println("1- Addition");
            System.out.println("2- Subtraction");
            System.out.println("3-Multiplication");
            System.out.println("4-Division");
            System.out.println("5- Exit");
            System.out.println("Enter your Choice");
            choice  = sc.nextInt();

            if (choice>=1 && choice<=4){
                System.out.println("enter num 1");
                int a = sc.nextInt();
                System.out.println("enter num 2");
                int b = sc.nextInt();

                switch (choice){
                    case 1:
                        System.out.println(a+b);
                        break;
                    case 2:
                        System.out.println(a-b);
                        break;
                    case 3:
                        System.out.println(a*b);
                        break;
                    case 4:
                        if (b!=0) {
                            System.out.println((float) a / b);
                        }
                        else{
                            System.out.println("icannot divide by zero");
                        } break;
                }
            }else if (choice!=5) {
                System.out.println("invalid choice");
            }
        }while (choice!=5);
        System.out.println("program ended");


    }
}
