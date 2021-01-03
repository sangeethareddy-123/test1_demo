final class FinalClass{
    public void show(){
        System.out.println("Hello");
    }
}
//class KeyClass extends FinalClass{}
public class FinalKeyAsClass {
    public static void main(String[] args) {
        FinalClass obj=new FinalClass();
        obj.show();
    }
}
