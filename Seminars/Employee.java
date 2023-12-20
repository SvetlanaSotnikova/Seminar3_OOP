/**
 * Класс описывающий сотрудников
 */
public class Employee {

    private long id;
    private String name;
    private double salary;
    private int countOfChildren;
    private Employee.Position position;

    public Employee(String name, double salary, Position position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public enum Position {
        DOCTOR,
        NURSE
    }

    @Override
    public String toString() {
        return String.format("%s, salary: %.2f, position: '%s'", getName(), getSalary(), getPosition());
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double salary, int countOfChildren, Position position) {
        this(name, salary, position);
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public int getCountOfChildren() {
        return countOfChildren;
    }
}