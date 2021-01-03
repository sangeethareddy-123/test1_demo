import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionEx8 {
    public static void main(String[] args) {
        Set<Integer> sr=new TreeSet<>();
        System.out.println(sr.add(5));
        System.out.println(sr.add(3));
        System.out.println(sr.add(6));
        System.out.println(sr.add(5));
        for (int i:sr){
            System.out.println("values are "+i);
        }
    }
}
