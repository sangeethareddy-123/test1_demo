class StaticEx9{
    static void print(){
        System.out.println("use of static KeyWord");
    }
    static void print(int n){
        System.out.println("static Overloading"+n);
    }

}
public class StaticOverloading {
    public static void main(String[] args) {
        StaticEx9.print();
        StaticEx9.print(5);
    }
}
