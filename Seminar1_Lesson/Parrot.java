import java.time.LocalDate;
import java.util.List;

public class Parrot extends Animal implements Flyable, Goable {

    public Parrot(String name, LocalDate birthDate, List<String> vaccination, String fillness, String owner) {
        super(name, birthDate, vaccination, fillness, owner);
    }

    @Override
    public void fly() {
        System.out.printf("%s is flying\n", type);
    }

    @Override
    public void run() {
        System.out.printf("%s is running\n", type);
    }
}
