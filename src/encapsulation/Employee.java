public class Employee extends Person {
    private int salary;
    public Employee(String firstName, String lastName, Byte age, Integer ssn, int salary) {
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }

    public String speak() {
        return "My name is " + firstName + " " + lastName + " and my salary is $" + salary;
    }
}