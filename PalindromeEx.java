import java.util.Scanner;
public class PalindromeEx {
    public static void main(String[] args) {
        int r,s=0;
        System.out.println("enter palindrome number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        while (n != 0) {

            r=n%10;
            n=n/10;
            s=s*10+r;

        }
        if (t == s) {

            System.out.println("Palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }
    }
}
