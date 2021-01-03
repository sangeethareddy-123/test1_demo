interface Drawable1{
//    static String cube() {
//    }

    void draw();
    static int cube(int x){
        return x*x*x;
    }


}
class Rectangle1 implements Drawable1{

    @Override
    public void draw() {
        System.out.println("static keyword is used");
    }
}
public class TestInterfaceStatic {
    public static void main(String[] args) {
        Drawable1 obj= new Rectangle1();
        obj.draw();
       // Drawable1.cube(4);
        System.out.println("value of cube "+Drawable1.cube(4));

    }
}
