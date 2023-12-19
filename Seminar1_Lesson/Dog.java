import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal {

    public Dog(String name, LocalDate birthDate, List<String> vaccination, String fillness, String owner) {
        super(name, birthDate, vaccination, fillness, owner);
    }
}
