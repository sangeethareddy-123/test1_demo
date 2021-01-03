interface Animal1 {
     void animalSound(); // interface method (does not have a body)
    // void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Dog1 implements Animal1 {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("TheD Dog says: BoW BoW!");
    }
//    public void sleep() {
//        // The body of sleep() is provided here
//        System.out.println("Zzz");
//    }
}
class Cat1 implements Animal1{
    public void animalSound(){
        System.out.println("cat says "+";"+"meow meow");

    }
}
public class InterAinmal1 {

    public static void main(String[] args) {
        Cat1 obj=new Cat1();
        obj.animalSound();

    }
}
