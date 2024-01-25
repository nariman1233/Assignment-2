import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    ArrayList<Person> personArrayList = new ArrayList<>();
    Student student = new Student("Michael" , "Jordan" , 2.68);
    Employee employee = new Employee("Sergey" , "loloolo" , "worker" , 2);
    Employee employ = new Employee("Altair" , "Smagulov" , "security" , 3000000);
    personArrayList.add(student);
    personArrayList.add(employee);
    personArrayList.add(employ);
        Collections.sort(personArrayList);
    printData(personArrayList);
    }



    public static void printData(Iterable<Person> personArrayList){
        for(Person person:personArrayList){
            System.out.print(person.toString());
            System.out.println(" earns " + person.getPaymentAmount());
        }
    }
}