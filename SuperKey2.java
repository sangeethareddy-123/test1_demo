class Sb{
    public void show(){
        System.out.println("Superr Class Method");
    }

}
class Sc extends Sb{
    public void show(){
        //super.show();
        System.out.println("super in sub class");
    }
}
public class SuperKey2 {
    public static void main(String[] args) {
        Sc obj=new Sc();
        obj.show();
    }

}
