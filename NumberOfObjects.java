class Ex5{
    static int i;
    public Ex5(){
        i++;
    }
    public void Counter(){
        System.out.printf("Number of Objects created Are "+i);
    }
}
public class NumberOfObjects {
    public static void main(String[] args) {
        Ex5 obj=new Ex5();
        Ex5 obj1=new Ex5();
        Ex5 obj2=new Ex5();
        obj.Counter();
    }
}
