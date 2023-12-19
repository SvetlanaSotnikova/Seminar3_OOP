import java.time.LocalDate;
import java.util.List;

public class AnimalRunningAndSwimming extends Animal{

    public AnimalRunningAndSwimming(String name, LocalDate birthDate, List<String> vaccination, String fillness,
            String owner) {
        super(name, birthDate, vaccination, fillness, owner);
    }

    @Override
    public void toGoAndSwimAction() {
        super.toGoAndSwimAction();
    }  
    
}
