interface InterfaceExample {
        void add();

        default void show() {
            System.out.println("Hello World");


        }

    }
    class Example{
    public void show(){
        System.out.println("Interface Example");
    }
    }
class Inter extends Example implements InterfaceExample{
    public void add(){
        System.out.println("HII");

    }
    public static void main(String args[]){
        Inter obj=new Inter();
        obj.show();
    }

}

