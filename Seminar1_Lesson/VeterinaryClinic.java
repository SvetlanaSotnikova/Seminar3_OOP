import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();

    public void addPatient(Animal animal) {
        patients.add(animal);
    }

    public void addPatients(Animal... animals) {
        Collections.addAll(patients, animals);
    }

    public List<Goable> getGlobles() {
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Goable) // нельзя злоупотреблять этой штукой
                result.add((Goable) animal);
        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }
}