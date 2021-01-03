class One{
    int n1,n2,re;
    public void Add(){
        re=n1+n2;
        System.out.println("result is"+re);
    }
}
class Two extends One{
    int n1,n2,re;
    public void Sum(){
        re=n1+n2;
        System.out.println("result is"+re);
    }
    public void Mul(){
        re=n1-n2;
        System.out.println("result of Subtraction"+re);
    }
}
public class InheritenceEx {
    public static void main(String[] args) {
        Two obj=new Two();
        obj.n1=5;
        obj.n2=2;
        obj.Mul();
        obj.Sum();

    }
}
