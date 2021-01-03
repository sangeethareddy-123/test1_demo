class MethodOverload{
    public void show(){
        System.out.println("HelloWorld");
    }
    public void show(int i,float y){
        System.out.println("value of i is "+i);
        System.out.println("value of y is "+y);
    }

}
public class PolymorphismEx1 {
    public static void main(String[] args) {
        MethodOverload obj= new MethodOverload();
        obj.show();
        obj.show(3,2.5f);

    }
}
