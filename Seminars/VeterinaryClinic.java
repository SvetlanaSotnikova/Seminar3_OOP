import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Nurse> nurses = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public void addPatient(Animal animal) {
        patients.add(animal);
    }

    public void addPatients(Animal... animals) {
        Collections.addAll(patients, animals);
    }

    // --HOMEWORK SEMINAR 2

    public void addDoctorWithNurse(Employee doctor, Employee nurse) {
        if (doctor instanceof Doctor && nurse instanceof Nurse) {
            doctors.add((Doctor) doctor);
            nurses.add((Nurse) nurse);
            setDoctorForNurse((Doctor) doctor, (Nurse) nurse);
            setNurseForDoctor((Nurse) nurse, (Doctor) doctor);
            employees.add((Doctor) doctor);
            employees.add((Nurse) nurse);

        }
    }

    public void addNurse(Employee nurse) {
        nurses.add((Nurse) nurse);
        employees.add((Nurse) nurse);
    }

    public void addDoctor(Employee doctor) {
        doctors.add((Doctor) doctor);
        employees.add((Doctor) doctor);
    }

    private void setDoctorForNurse(Doctor doctor, Nurse nurse) {
        if (doctor != null) {
            doctor.setNurse(nurse);
        }
    }

    private void setNurseForDoctor(Nurse nurse, Doctor doctor) {
        if (nurse != null) {
            nurse.setDoctor(doctor);
        }
    }

    public List<Goable> getGlobles() {
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Goable) // нельзя злоупотреблять этой штукой
                result.add((Goable) animal);
        }
        return result;
    }

    public List<Flyable> getFlyables() { // попыталась избавиться от инстенсоф, я забыла как вы это на семинаре сделали
        return patients.stream()
                .filter(Flyable.class::isInstance)
                .map(Flyable.class::cast)
                .collect(Collectors.toList());
    }

    public List<Swimable> getSwimbles() {
        return patients.stream()
                .filter(Swimable.class::isInstance)
                .map(Swimable.class::cast)
                .collect(Collectors.toList());
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public List<Animal> getPatients() {
        return patients;
    }

    public List<Employee> getEmployees(){
        return employees;
    }
}