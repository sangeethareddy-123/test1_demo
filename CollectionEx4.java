import java.util.ArrayList;

public class CollectionEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> values=new ArrayList<>();
        values.add(23);
        values.add(34);
        values.add(22);
        values.add(88);
        for(int i:values)
            System.out.println("values are" + ":" + i);

    }
}
