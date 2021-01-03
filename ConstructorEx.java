class Example1{
    public Example1(){
        System.out.println("HelloWorld");
    }
    public Example1(int x){
        System.out.println("Example of constrructor");
        System.out.println("value of x is"+":"+x);
    }
}
public class ConstructorEx {
    public static void main(String[] args) {
        Example1 obj=new Example1();
        Example1 obj1=new Example1(3);

    }

}
