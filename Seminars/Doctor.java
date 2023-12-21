/**
 * InnerDoctor
 */
public class Doctor extends Employee implements Work {

    private Nurse nurse;
    private String specialization;

    public Doctor(String name, double salary, String specialization) {
        super(name, salary, Position.DOCTOR);
        this.specialization = specialization;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void works() {
        if (nurse != null) {
            System.out.println("\nDoctor " + getName() + " is working");
            System.out.println("Assisted by nurse " + nurse.getName() + "\n");
        } else {
            System.out.println("\nDoctor " + getName() + " is working without nurse\n");
        }
    }
}
