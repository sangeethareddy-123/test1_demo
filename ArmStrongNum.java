import java.util.Scanner;
public class ArmStrongNum {
    public static void main(String[] args) {
        int r,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n=sc.nextInt();
        temp=n;
        while(n!=0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;

        }
        if(temp==n){
            System.out.println(n+"is armstrong Number");
        }
        else{
            System.out.println("not an ArmStrong Number");
        }


    }

}
