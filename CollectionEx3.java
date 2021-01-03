import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class CollectionEx3 {
    public static void main(String[] args) {
        List<Integer> obj=new ArrayList<>();
        obj.add(23);
        obj.add(56);
        obj.add(21);
        obj.add(39);
        obj.add(1,3);
        Comparator<Integer> com=new ComImp();
        Collections.sort(obj,com);
        //Collections.sort();
        for(int i:obj){
            System.out.println(i);
        }

    }
}

