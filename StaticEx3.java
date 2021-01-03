class Ex3{
    static int i;
    void show(){
        System.out.println("Example Of Staic Keyword");
        i=7;
        System.out.println("Value os staitic member" +i);
    }
}
public class StaticEx3 {
    public static void main(String[] args) {
        Ex3 obj=new Ex3();
        obj.show();
        System.out.println("value of I is " +Ex3.i);

    }

}
