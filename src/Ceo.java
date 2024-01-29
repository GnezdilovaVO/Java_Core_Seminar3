import java.util.List;

public class Ceo extends Worker{

    public Ceo(String firstName, String middleName, String lastName, int age,
               String post, String phoneNumber, double salary) {
        super(firstName, middleName, lastName, age, post, phoneNumber, salary);
    }
    public void upSal(Worker[] workers) {
        for (Worker worker: workers) {
            if (!(worker instanceof Ceo)) {
                worker.setSalary(worker.getSalary() + 5000);
            }

        }
    }
}
