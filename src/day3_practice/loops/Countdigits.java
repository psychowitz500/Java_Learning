package day3_practice.loops;

public class Countdigits {
    public static void main(String[] args) {
        int n = 12345;
        int c = 1;
        while(n>1){
            n/=10;
            c++;
        }
        System.out.println(c);}}
