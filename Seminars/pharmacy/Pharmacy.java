package pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {
    private int index;
    private final List<Component> components;

    public Pharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();
    }

    public void addComponents(Component...components) {
        if (components.length == 0) System.out.println("А че ничего не добавили:(");
        else Collections.addAll(this.components, components);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }

    //--- HOMEWORK SEMINAR 3 ---
    @Override
    public int compareTo(Pharmacy o) {
        return Objects.compare(this, o, Comparator.comparingInt(p -> p.components.size()));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() == obj.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) obj;
        return Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components);
    }

    @Override
    public String toString() {
        return String.format("Pharmasy -> Component: %s",components);
    }
}
