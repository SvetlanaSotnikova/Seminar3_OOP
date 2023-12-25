package pharmacy;

public class Component {
    private String name;
    private String weigth;
    private int power;

    public Component(String name, String weigth, int power) {
        this.name = name;
        this.weigth = weigth;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component [name=" + name + ", weigth=" + weigth + ", power=" + power + "]";
    }
}
