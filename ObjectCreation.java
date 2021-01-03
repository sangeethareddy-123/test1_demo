class Abc{
    public Abc(){
        System.out.println("A class Constructor");

    }
    public Abc(int i){

        System.out.println("A class parametrConstructor");
    }
}
class Bcd extends Abc{
    public Bcd(){
        System.out.println("B class Constructor");
    }
    public Bcd(int i){
        System.out.println("B class Parameter Constructor");
    }
}
public class ObjectCreation {
    public static void main(String[] args) {
        Bcd obj=new Bcd(9);

    }
}
