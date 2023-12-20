import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Goable, Swimable {

    public Dog(String name, LocalDate birthDate, List<String> vaccination, String fillness, String owner) {
        super(name, birthDate, vaccination, fillness, owner);
    }

    @Override
    public void swim() {
        System.out.printf("%s is swimming", type);
    }

    @Override
    public void run() {
        System.out.printf("%s is srunning", type);
    }

    // @Override
    // public void lifeCycle() {

    // }
}
