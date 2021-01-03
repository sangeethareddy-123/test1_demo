import java.util.Scanner;
public class FibanocciEx {
    public static void main(String[] args) {
       int k=0,a=1,b=1;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number");
        int n=sc.nextInt();
        System.out.println("1 1");
        while(k<=50){
            k=a+b;
            System.out.println(k+" ");
            a=b;
            b=k;
        }
    }
}
