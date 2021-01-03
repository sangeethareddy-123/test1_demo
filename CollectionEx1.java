class Container<T>{
    T value;
    public void show(){
        System.out.println(value.getClass().getName());
    }
}
public class CollectionEx1 {
    public static void main(String[] args) {
        Container<Integer> obj=new Container<>();
        obj.value=5;
        obj.show();

    }
}
