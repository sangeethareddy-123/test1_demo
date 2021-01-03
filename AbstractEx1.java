abstract class Phone{
    public abstract void call();
    public abstract void camera();
}
abstract class Samsung extends Phone{
    public void call(){
        System.out.println("Call is defined");
    }
}
abstract class Vivo extends Samsung{
    public void camera(){
        System.out.println("camera is defined");
    }

}
class Iphone extends Vivo{
    public void map(){
        System.out.println("Concrete Class");
    }
}

public class AbstractEx1 {
    public static void main(String[] args) {
        Iphone obj=new Iphone();
            obj.call();
            obj.camera();
            obj.map();

        }
    }

