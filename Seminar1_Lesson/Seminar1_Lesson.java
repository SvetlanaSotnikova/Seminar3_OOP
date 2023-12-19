// import java.util.Arrays;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Seminar1_Lesson {
    public static void main(String[] args) {
        // int[] i = new int[] {6,1,3,4,5};

        // Arrays.sort(i);
        // System.out.println(Arrays.toString(i));

        Employee employee = new Employee("Vasea", 2000);
        System.out.println(employee.getName());

        Cat Barsik = new Cat("Barsik", LocalDate.of(2023, 12, 1), new ArrayList<>(), "healthy", "You", 4);
        System.out.println(Barsik.toString());
        System.out.println(Barsik.getLengsCount());

        Animal Dog = new Dog("Barsik", LocalDate.of(2023, 12, 1), new ArrayList<>(), "healthy", "You");

        List<Animal> animals = new ArrayList<>();
        animals.add(Barsik);
        animals.add(Dog);
        Dog.wakeup(4);
        System.out.println(".................................");

        Barsik.lifeCycle();
    }
}
