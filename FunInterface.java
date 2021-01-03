//import java.util.function.*;
@FunctionalInterface
interface sayable{
    void say(String msg);
    default void print(){
        System.out.println("Use Of Functional Interfce");
    }
}
class FunInterface implements sayable {
    @Override
    public void say(String msg) {
        System.out.println("implementing Abstract method");
    }

    public static void main(String[] args) {
        sayable obj=new FunInterface();
        obj.print();
        obj.say("FunctionalInterface");
    }
}
