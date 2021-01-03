class StaticEx7{
    static int show(int n){
        System.out.println("static as Method with value "+n);
        return n;
    }
}
class StaticA extends StaticEx7{
    static int show(int n){
        System.out.println(n);
        return n;
    }
}
public class StaticOverriding {
    public static void main(String[] args) {
        //StaticA.show(7);
        StaticEx7.show(6);

    }
}
