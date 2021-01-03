interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("rectangle implemnted");
    }
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("circle class");
    }

}
public class TestInterface {
    public static void main(String[] args) {
        Drawable obj=new Circle();
        obj.draw();

    }
}

