import java.time.LocalDate;
import java.util.List;

// 
public class AnimalRunningAndFlyingAndSwimming extends Animal implements Goable, Swimble, Flyble {

    public AnimalRunningAndFlyingAndSwimming(final String name, final LocalDate birthDate,
            final List<String> vaccination,
            final String fillness, final String owner) {
        super(name, birthDate, vaccination, fillness, owner);
    }

    @Override
    public void toGoAndFlyAndSwimAction() {
        super.toGoAndFlyAndSwimAction();
    }

    @Override
    public void fly() {
        System.out.printf("%s is flying\n", type);
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
