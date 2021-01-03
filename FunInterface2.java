import java.lang.String;
interface Doable{
    default void doIt(){
        System.out.println("doIt method");
    }
}
@FunctionalInterface
interface Sayable {
    void say(String msg);
    default void doIt()
    {
        System.out.println("Functional Interface");
    }

        }
public class FunInterface2 implements Sayable {


    @Override
    public void say(String msg) {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        FunInterface2 obj=new FunInterface2();
      //  Doable obj1=new FunInterface2();
        obj.say("this msg says");
        obj.doIt();
     //   obj1.doIt();

    }
}
