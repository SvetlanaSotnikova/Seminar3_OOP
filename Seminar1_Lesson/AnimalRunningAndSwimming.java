import java.time.LocalDate;
import java.util.List;

public class AnimalRunningAndSwimming extends Animal implements Swimble, Goable {

    public AnimalRunningAndSwimming(String name, LocalDate birthDate, List<String> vaccination, String fillness,
            String owner) {
        super(name, birthDate, vaccination, fillness, owner);
    }

    @Override
    public void toGoAndSwimAction() {
        super.toGoAndSwimAction();
    }

    @Override
    public void swim() {
        System.out.printf("%s is swimming\n", type);

    }

    @Override
    public void run() {
        System.out.printf("%s is running\n", type);
    }

    // @Override
    // public void lifeCycle() {

    // }

}
