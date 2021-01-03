class Add{
    int n1,n2,re=0;
    public void add(){
        re=n1+n2;
        System.out.println("Addition result is"+re);
    }
}
class AddSub extends Add{
    public void sub(){
        re=n1-n2;
        System.out.println("Subtraction result is:"+re);
    }
}
class AddSubMul extends AddSub{
    public void mul(){
        re=n1*n2;
        System.out.println("Multiplication is :"+re);
    }
}
public class MultilevelInherit {
    public static void main(String[] args) {
        AddSubMul obj=new AddSubMul();
        obj.n1=9;
        obj.n2=4;
        obj.add();
        obj.sub();
        obj.mul();
    }
}
