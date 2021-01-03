class FinalEx{
    final public void display(){
        System.out.println("final method Cant be Override");
    }
    public void display(int i){
        System.out.println("overloading final method "+i);
    }
}
//class FinalEx1 extends FinalEx{
//    public void display(){
//        System.out.println("override");
//    }
//}
public class FinalKeyAsMethod {
    public static void main(String[] args) {
        FinalEx obj=new FinalEx();
        obj.display();
        obj.display(9);
    }
}
