import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccination;
    protected String fillness;
    protected String owner;

    public Animal(String name, LocalDate birthDate, List<String> vaccination, String fillness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccination = vaccination;
        this.fillness = fillness;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccination() {
        return vaccination;
    }

    public String getFillness() {
        return fillness;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", birthDate=" + birthDate + ", vaccination=" + vaccination + ", fillness="
                + fillness + ", owner=" + owner + "]";
    }

    private void wakeup() {
        System.out.println("Animal is wakwup !!");
    }

    public void wakeup(int time) {
        System.out.println("Animal is wakwup in " + time); // называется перегрузка
    }

    private void Eat() {
        System.out.println("Animal ate");
    }

    private void Play() {
        System.out.println("Animal playd");
    }

    private void Sleep() {
        System.out.println("Animal sleeping");
    }

    public void lifeCycle() {
        wakeup();
        Eat();
        Play();
        Sleep();
    }

    // -----HOMEWORK-----
    public void toGo() {
        System.out.println("Animal is moving");
    }

    public void fly() {
        System.out.println("Animal is flying");
    }

    public void swim() {
        System.out.println("Animal is swimming");
    }
}
