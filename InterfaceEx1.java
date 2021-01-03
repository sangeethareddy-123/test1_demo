interface ClassA {
    public abstract void show();
}
class ClassB implements ClassA{

    @Override
    public void show() {
        System.out.println("Interface method is used");
    }
}
public class InterfaceEx1 {
    public static void main(String[] args) {
        ClassB obj=new ClassB();
        obj.show();
    }
}
