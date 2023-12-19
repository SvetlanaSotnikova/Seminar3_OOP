import java.time.LocalDate;
import java.util.List;

public class AnimalRunningAndFlyingAndSwimming extends Animal{

    public AnimalRunningAndFlyingAndSwimming(final String name, final LocalDate birthDate, final List<String> vaccination,
            final String fillness, final String owner) {
        super(name, birthDate, vaccination, fillness, owner);
    }

    @Override
    public void toGoAndFlyAndSwimAction() {
        super.toGoAndFlyAndSwimAction();
    }
}
