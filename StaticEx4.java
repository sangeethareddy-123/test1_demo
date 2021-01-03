class Ex4{
    static int num1;
    int num2;
    public void show()
    {
        num1=9;
        System.out.println(num1);
    }

}
public class StaticEx4 {
    public static void main(String[] args) {
        Ex4 obj=new Ex4();
        Ex4 obj1=new Ex4();
        obj.show();
        Ex4.num1=6;
        obj.num2=9;
        obj1.num2=10;
        System.out.println(Ex4.num1);
        System.out.println(obj.num2);
        System.out.println(obj1.num2);

    }
}
