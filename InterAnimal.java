import java.lang.String;
import java.util.ArrayList;
interface  Animal{
    String getName();
    String makeNoise();
}
class Dog implements Animal
{
    private String name;
    public Dog(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public String makeNoise()
    {
        return "Bow Bow!";
    }
}
class Cat implements Animal
{
    private String name; // To hold name of cat.

    public Cat(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String makeNoise()
    {
        return "Meow!";
    }
}
public class InterAnimal {
    public static void main(String[] args) {
        // create an ArrayList of animals
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Krypto")); // append a Dog object to the list
        animals.add(new Cat("Bella")); // append a Cat object to the list
        animals.add(new Dog("Rocky")); // append a Dog object to the list
        animals.add(new Cat("Molly")); // append a Cat object to the list

        // generically process each element in arraylist animals
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " : " + animal.makeNoise());
        }
    }
}
