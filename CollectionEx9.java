import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionEx9 {
    public static void main(String[] args) {
        Map<String,Integer> mm=new HashMap<>();
        mm.put("Sangeetha",80);
        mm.put("Mounika",67);
        mm.put("SR",60);
        //System.out.println(mm);
        //System.out.println(mm.get("Sangeetha"));
        Set<String> keys=mm.keySet();
        for(String key:keys){
            System.out.println(key +" "+mm.get(key));

        }



    }
}
