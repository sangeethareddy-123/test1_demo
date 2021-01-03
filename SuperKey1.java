class Sa{
    int i=5;

}
class Sr extends Sa{
    int i=4;
    public void show(){
        System.out.println(super.i);
    }

}

public class SuperKey1 {
    public static void main(String[] args) {
        Sr obj=new Sr();
        obj.show();
    }

}
