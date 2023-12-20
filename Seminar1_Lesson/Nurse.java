/**
 * InnerNurse
 */
public class Nurse extends Employee implements isAssist {

    private Doctor doctor;

    public Nurse(String name, double salary) {
        super(name, salary, Position.NURSE);
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public void assist() {
        if (doctor != null) {
            System.out.println("\nNurse " + getName() + "is assisting");
            System.out.println("Works with doctor " + doctor.getName() + "\n");
        } else {
            System.out.println("\nNurse " + getName() + "is working without doctor\n");
        }
    }
}
