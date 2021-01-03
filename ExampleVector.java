import java.util.Vector;

public class ExampleVector {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>();
        v.add(1);
        v.add(43);
        v.add(29);
        v.add(20);
        v.add(54);
        v.add(45);
        v.add(65);
        v.add(60);
        v.add(32);
        v.add(43);
        v.add(29);
        v.add(20);
        v.add(23);
        v.add(66);
        v.add(78);
        v.add(90);

        System.out.println(v.capacity());
        for(int i:v){
            System.out.println("values are"+":"+i);
        }
    }


}
