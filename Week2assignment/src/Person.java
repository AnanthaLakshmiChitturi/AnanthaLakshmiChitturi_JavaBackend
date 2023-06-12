public class Person implements Comparable{

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;

    }

    @Override

    public int compareTo(Object O) {

        Person comparingTo = (Person)O;
        int difference =this.toString().compareTo(O.toString());
        return difference;


    }

}