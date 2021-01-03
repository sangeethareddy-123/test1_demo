class ThisKey1{
    private int i;
   static private int y;
   public void setI(int i){
       this.i=i;
       //i=7;
       System.out.println("value of I is "+i);
   }
   public void setY(int y){
       this.y=y;
       //y=9;
   }
   public int getI(){
       return i;
   }

    public static int getY() {
        return y;
    }
}
public class ThisKeyExample2 {
    public static void main(String[] args) {
        ThisKey1 obj=new ThisKey1();
        obj.setY(4);
        obj.setI(5);
        System.out.println(obj.getI());
        System.out.println(ThisKey1.getY());

    }
}
