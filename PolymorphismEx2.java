class MethodOverride{
    public void override(int i,String s){
        System.out.println("value of String is "+ s +" value of i :"+i);
    }

}
class MethodOveride1 extends MethodOverride{
    @Override
    public void override(int i, String s) {
        //super.override(i, s);
        System.out.println("value of i "+ i + " value of Strings "+s);
    }
}
public class PolymorphismEx2 {
    public static void main(String[] args) {
        MethodOveride1 obj=new MethodOveride1();
        obj.override(2,"sR");
    }
}
