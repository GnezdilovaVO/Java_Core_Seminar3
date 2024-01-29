import java.util.Comparator;

public class Worker implements Comparator<Worker> {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String post;
    private String phoneNumber;

    private double salary;

    public Worker(String firstName, String middleName, String lastName, int age, String post, String phoneNumber, double salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.post = post;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compare(Worker o1, Worker o2) {
        if (o1.getSalary() > o2.getSalary()) return 10;
        else if (o1.getSalary() < o2.getSalary()) return -10;
        return 0;
    }
}
