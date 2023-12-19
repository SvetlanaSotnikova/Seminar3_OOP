/**
 * Класс описывающий сотрудников
 */
public class Employee {
    private long id;
    private String name;
    private double salary;
    private int countOfChildren;
    
    public Employee(String name, double salary) {
        this(name);
        this.salary = salary;
    }
    public Employee(String name) {
        this.name = name;
    }
    public Employee(String name, double salary, int countOfChildren) {
        this(name, salary);
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