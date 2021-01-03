/* import java.util.ArrayList; */
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionEx6 {
    public static void main(String[] args) {
        LinkedList<String> LL=new LinkedList<>();
        LL.add("Ravi");
        LL.add("Vijay");
        LL.add("Ajay");
        Iterator i=LL.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
