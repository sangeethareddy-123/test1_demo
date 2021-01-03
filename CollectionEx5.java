import java.util.Collections;
import java.util.LinkedList;

public class CollectionEx5 {
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<>();
        al.add("ravi");
        al.add("Mounika");
        al.add("Sangeetha");
        al.add("Raju");
       // Collections.sort(al);
       //al.descendingIterator();
        for (String s:al){
            System.out.println("String Values Are"+":"+s);
        }
    }
}
