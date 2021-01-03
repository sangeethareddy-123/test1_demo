class Example2{
    public Example2(int x,float y){
        System.out.println("value of X is:"+x);
        System.out.println("value of Y is :"+y);
    }
    public Example2(int x){
       // x=5;
        System.out.println("value of x is"+x);

    }
}
public class ConstructorExample2 {
    public static void main(String[] args) {
        Example2 obj1=new Example2(2,2.3f);
        Example2 obj2=new Example2(3);


    }
}
