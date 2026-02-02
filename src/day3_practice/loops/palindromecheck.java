package day3_practice.loops;

public class palindromecheck {
    public static void main(String[] args) {
        int org = 121;
        int n = org ;
        int rev = 0;
        while(n>0){
            int last = n%10;
            rev = (rev*10) + last ;
            n/=10;
        }

        System.out.println(rev);
        if (org==rev){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome"
            );
        }

    }
}
