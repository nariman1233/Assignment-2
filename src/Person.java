public abstract class Person implements  Payable , Comparable<Person> {
    private static int id_gen=1;
    private int id;
    private String name;
    private String surname;

    public Person(){
        id = id_gen++;
    }
    public Person(String name , String surname){
        this();
        setName(name);
        setSurname(surname);

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return  name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname(){
        return  surname;
    }

    public int getId() {
        return id;
    }

    public String getPosition(){
        return "Student";
    }
    public abstract double getPaymentAmount();

    @Override
    public int compareTo(Person person) {
        return Double.compare(getPaymentAmount() , person.getPaymentAmount());
    }

    @Override
    public String toString() {
        return id + "." + name + " " + surname;

    }

}


