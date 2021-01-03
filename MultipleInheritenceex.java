interface Printable{
    void print();
}
interface Showable{
    void show();

}
public class MultipleInheritenceex implements Printable,Showable {
    @Override
    public void print() {
        System.out.println("First Interface Printable");
    }

    @Override
    public void show() {
        System.out.println("Second Interface Showable");

    }

    public static void main(String[] args) {


        MultipleInheritenceex obj = new MultipleInheritenceex();
        obj.print();
        obj.show();

    }
}
