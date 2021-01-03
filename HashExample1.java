import java.util.HashMap;

public class HashExample1 {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("cat","meow meow");
        hm.put("Dog","Bow Bow");
        //hm.put("Cow","");
        String value=hm.get("cat");
        System.out.println(value);
    }

}
