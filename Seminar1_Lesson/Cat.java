import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Goable {
    private int lengsCount;

    public Cat(String name, LocalDate birthDate, List<String> vaccination, String fillness, String owner,
            int lengsCount) {
        super(name, birthDate, vaccination, fillness, owner);
        this.lengsCount = lengsCount;
    }

    public int getLengsCount() {
        return lengsCount;
    }

    @Override
    public void run() {
        System.out.printf("%s is running", type);
    }

    // @Override
    // public void lifeCycle() {

    // }
}
