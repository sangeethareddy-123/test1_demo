import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx2 {
    public static void main(String[] args) {
        Collection values=new ArrayList();
        values.add(23);
        values.add("Sangeetha");
        values.add(21);
        for (Object i:values){
            System.out.println("values are"+":"+i);

        }
    }
}
