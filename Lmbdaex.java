interface  LambdaExample{
    public void show();

}
public class Lmbdaex {
    public static void main(String[] args) {
        LambdaExample obj=()-> System.out.println("in Show");
        obj.show();
    }
}
