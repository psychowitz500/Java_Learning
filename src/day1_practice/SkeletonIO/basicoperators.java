/*  INITIAL mistake
 package day1_practice.SkeletonIO;
import java.util.Scanner;

public class basicoperators {

    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum= a+b;
        int product= a*b;
        int subs=a-b;
        float div= a/b;
        --- float div= (float) a/b; -----

        System.out.println(sum);
        System.out.println(product);
        System.out.println(subs);
        System.out.println(div);


    }
}*/

package day1_practice.SkeletonIO;
import java.util.Scanner;

public class basicoperators {

    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum= a+b;
        int product= a*b;
        int subs=a-b;
        float div= (float) a/b;

        System.out.println(sum);
        System.out.println(product);
        System.out.println(subs);
        System.out.println(div);


    }
}


