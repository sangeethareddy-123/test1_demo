import java.util.Arrays;
import java.util.List;
public class StreamApi1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
//        for(int i:list){
//            System.out.println("values are :"+i);
//        }
        list.forEach(i-> System.out.println(i));
//        list.forEach(System.out::println);
    }
}
