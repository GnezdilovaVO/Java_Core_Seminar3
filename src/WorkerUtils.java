public class WorkerUtils {
    public static void upSalary (Worker[] workers) {
        for (Worker worker: workers) {
            if(worker.getAge() > 45) worker.setSalary(worker.getSalary()+5000);
        }
    }
}
