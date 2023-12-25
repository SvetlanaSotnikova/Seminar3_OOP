package pharmacy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PharmacyMain {
    public static void main(String[] args) {
        Component paracetamol = new Component("Paracetamol", "10mg", 100);
        Component valeriana = new Component("Valeriana", "10mg", 10);
        Component ugoli = new Component("Ugoli", "25g", 120);
        Component ibufen = new Component("Ibufen", "50mg", 140);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(paracetamol, valeriana, ugoli);

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponents(ibufen);

        Iterator<Component> iterator = pharmacy1;
        Iterator<Component> iterator2 = pharmacy2;

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        // --- HOMEWORK SEMINAR 3 ---
        Set<Pharmacy> sPharmacies = new HashSet<>(Arrays.asList(pharmacy1, pharmacy2));
        System.out.println(sPharmacies.size());
        
        for (Pharmacy pharmacy : sPharmacies) {
            System.out.println(pharmacy );
        }
    }
}