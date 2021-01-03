class Ex2{
    static int i;
    public static void show(){
        System.out.println("Static Example");
    }
}
public class StaticEx2 {
    public static void main(String[] args) {
        Ex2.i=5;
        Ex2.show();
        System.out.println("value of i is "+Ex2.i);

    }
}
