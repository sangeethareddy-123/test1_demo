interface ExampleInterfacable{
    void print();

}
 class Interface1 implements ExampleInterfacable{
     @Override
     public void print() {
         System.out.println("Interface Example");
     }

     public static void main(String[] args) {
         Interface1 obj=new Interface1();
         obj.print();
     }
 }
