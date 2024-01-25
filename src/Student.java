import java.util.Collection;
import java.util.Collections;

public class Student extends Person implements  Payable{

    private double gpa;


    final int scholarship = 36600;
    public Student(){
        super();
    }


    public Student(String name , String surname , double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    public double getPaymentAmount(){
        if(getGpa() > 2.67){
            return scholarship;
        }
        return 0;
    }



    @Override
    public String toString() {
        return "Student:" +
                 getId() + "." +
                 getName() + " " +
                 getSurname();


    }
}
