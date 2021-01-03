class Aa{
    public Aa(){
        System.out.println("Super KeyWord In Constructor");
    }
    public Aa(int i){
        System.out.println("Example of SuperKeyword");
    }
}
class Bb extends Aa{
    public Bb(){
        System.out.println("Inheritence used with super Keyword");
    }
    public Bb(int r){
        super(r);
        System.out.println("parameterized constructor");
    }
}
public class SuperKey {


    public static void main(String[] args) {
        Bb obj = new Bb(5);

    }
}

