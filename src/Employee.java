public class Employee extends Person implements  Payable{
    private String position;
    private double salary;
    private static int id_gen =1;
    public  Employee(){
        super();
    }

    public Employee(String name , String surname ,String position, double salary ){
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }

    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String getPosition() {
        return position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }


    public double getPaymentAmount(){
        return getSalary();
    }

    @Override
    public String toString() {
        return "Employee:" +
                   getId() + ". " +
                   getName() + " " +
                 getSurname();


    }
}
