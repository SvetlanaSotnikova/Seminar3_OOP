import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {
    private int lengsCount;

    public Cat(String name, LocalDate birthDate, List<String> vaccination, String fillness, String owner,
            int lengsCount) {
        super(name, birthDate, vaccination, fillness, owner);
        this.lengsCount = lengsCount;
    }

    public int getLengsCount() {
        return lengsCount;
    }
}
