import java.util.ArrayList;
import java.util.List;

class Student {
    int rollno;
    int marks;

    public Student(int rollno, int marks) {

        this.rollno = rollno;
        this.marks = marks;
    }
    @Override
    public String toString(){
        return "Student("+ "rollno " + rollno + " marks " + marks+")";
    }
}
public class CollectionEx7 {
    public static void main(String[] args) {
        List<Student> ll=new ArrayList<>();
        ll.add(new Student(1,78));
        ll.add(new Student(2,67));
        ll.add(new Student(3,89));
        ll.add(new Student(4,98));
        for(Student s:ll){
            System.out.println("List of student Details "+s);
        }
    }
}
