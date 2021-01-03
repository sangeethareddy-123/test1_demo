interface Runnable{
    void draw();
    public default void print(){
        System.out.println("Example for Default");
    }
    default void print(int n){
        System.out.println("Example for default overloading");
    }
}
class Printable1 implements Runnable {

    @Override
    public void draw() {
        System.out.println("Implemented draw method");
    }
    public void print(){
        System.out.println("Example");
    }
}

public class DefaultInterfaceEx {
    public static void main(String[] args) {
        Printable1 obj=new Printable1();
        obj.draw();
        obj.print();
        obj.print(3);

        }
    }

