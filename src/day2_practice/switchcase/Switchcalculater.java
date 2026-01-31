package day2_practice.switchcase;
import java.util.Scanner;

public class Switchcalculater {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        System.out.println("+ -> 1 , - ->2 , * -> 3 , / -. 4 ");
        int op = sc.nextInt();

        switch (op){
        case 1 :
            System.out.println(a+b);
            case 2:
                System.out.println(a-b);
            case 3 :
                System.out.println(a*b);
            case 4:
                System.out.println((float) a/b);

        }


    }
}
