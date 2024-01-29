import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Worker firstWorker = new Worker("John", "Whane", "Gayce", 30,
                "manager", "12345678", 21415);
        Worker secondWorker = new Worker("Bob", "Lush", "Marley", 50,
                "ice creamMan", "12345678", 5235345);
        Worker thirdWorker = new Worker("Victor", "Lucky", "Race", 25,
                "programmer", "12345678", 5235235);
        Worker fourthWorker = new Worker("Hanna", "Tom", "Soyer", 47,
                "developer", "12345678", 5235235);
        Worker fifthWorker = new Worker("Lizzy", "Whizzy", "Fill", 70,
                "tester", "12345678", 123214);
        Ceo firstCeo = new Ceo("Ben", "Jon", "Winter", 45,
                "supervizor", "123654987", 235);
//        System.out.println(worker);
//        System.out.println(Arrays.toString(new Worker[]{firstWorker, secondWorker,
//                thirdWorker, fourthWorker, fifthWorker}));
//        WorkerUtils.upSalary(new Worker[]{firstWorker, secondWorker,
//                thirdWorker, fourthWorker, fifthWorker});
        Worker[] workers = new Worker[]{firstWorker, secondWorker,
                thirdWorker, fourthWorker, fifthWorker, firstCeo};

//        WorkerUtils.upSalary(workers);
//        System.out.println(Arrays.toString(workers));
        System.out.println(firstWorker.compare(fifthWorker,thirdWorker));
        System.out.println(Arrays.toString(workers));
        firstCeo.upSal(workers);
        System.out.println(Arrays.toString(workers));
    }
}