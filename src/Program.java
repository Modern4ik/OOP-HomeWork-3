import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий",
                "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов",
                "Горбунов", "Лыткин", "Соколов" };

        int employeeType = random.nextInt(2);
        int salaryIndex = 0;

        switch (employeeType) {
            case 1:
                int workedHours = random.nextInt(10, 80);
                salaryIndex = 1500;
                return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)],
                        random.nextInt(18, 65), workedHours * salaryIndex);
            default:
                salaryIndex = random.nextInt(200, 500);
                return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)],
                        random.nextInt(18, 65), 160 * salaryIndex);
        }
    }

    public static Employee[] generateEmployees(int count) {
        Employee[] workers = new Employee[count];
        for (int i = 0; i < count; i++) {
            workers[i] = generateEmployee();
        }
        return workers;
    }

    public static void main(String[] args) {

        Employee[] workers = generateEmployees(12);

        for (Employee worker : workers) {
            System.out.println(worker);
        }

        Arrays.sort(workers, new AgeComparator());

        System.out.println();

        for (Employee worker : workers) {
            System.out.println(worker);
        }

    }

}
