//import java.io.*;
class Ex6{
    private int empId;
    private String empName;
    public void setEmpId(int empId){
        this.empId=empId;
    }
    public int getEmpId(){
        return empId;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }

    public String getEmpName() {
        return empName;
    }
}
public class EncapsulationEx2 {
    public static void main(String[] args) {
        Ex6 obj1=new Ex6();
        obj1.setEmpId(101);
        System.out.println("Employeee ID "+obj1.getEmpId());
        obj1.setEmpName("SangeethaR");
        System.out.println("Employee NAme "+obj1.getEmpName());
    }
}
