// import java.util.Arrays;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // int[] i = new int[] {6,1,3,4,5};

        // Arrays.sort(i);
        // System.out.println(Arrays.toString(i));

        // Employee employee = new Employee("Vasea", 2000);
        // System.out.println(employee.getName());

        Cat Barsik = new Cat("Barsik", LocalDate.of(2023, 12, 1), new ArrayList<>(), "healthy", "You", 4);
        System.out.println(Barsik.toString());
        System.out.println(Barsik.getLengsCount());

        Animal Dog = new Dog("Barsik", LocalDate.of(2023, 12, 1), new ArrayList<>(), "healthy", "You");

        List<Animal> animals = new ArrayList<>();
        animals.add(Barsik);
        animals.add(Dog);
        Dog.wakeup(4);
        System.out.println(".................................");

        // Barsik.lifeCycle();
        System.out.println("\n\n---Homework---\n");

        // ---HOMEWORK---
        Duck Duck = new Duck("Kostea",
                LocalDate.of(2023, 12, 1), new ArrayList<>(), "healthy", "You");

        Penguin Penguin = new Penguin("mySister", LocalDate.of(2009, 12, 5),
                new ArrayList<>(), "healthy", "me");

        System.out.println("--Duck");
        // Duck.fly();
        // Duck.toGo();
        // Duck.swim();
        Duck.toGoAndFlyAndSwimAction(); // такое себе, знаю

        System.out.println("--Penguin");
        // // Penguin.fly(); // я могу это использовать но делать этого нельзя, понимаю
        // Penguin.toGo();
        // Penguin.swim();
        Penguin.toGoAndSwimAction();

        // --SEMINAR 2--
        System.out.println("\n\n---Seminar 2---\n");
        // Goable goable = (x, y) -> x + y;
        // System.out.println(goable.run(3, 2));
        // ИЛИ
        // если метод будет void
        // Goable goable = (x, y) -> System.out.println(x + y);
        // goable.run(6, 4);
        // ИЛИ
        // Goable goable = Double::sum;
        Penguin.run();
        Penguin.swim();

        Duck.run();
        Duck.swim();
        Duck.fly();

        Barsik.run();

        System.out.println();

        Parrot parrot = new Parrot("Kesha",
                LocalDate.of(2023, 12, 1), new ArrayList<>(), "healthy", "You");

        parrot.run();
        parrot.fly();

        System.out.println();

        VeterinaryClinic veterinaryClinic = new VeterinaryClinic();

        veterinaryClinic.addPatients(Penguin, Barsik, Dog, Duck, parrot);
        System.out.println(veterinaryClinic.getGlobles());
        System.out.println(veterinaryClinic.getPatients());

        // ---HOMEWORK SEMINAR 2---
        System.out.println("\n\n---Homework----Seminar 2---");

        Employee ValentinaStick = new Nurse("Valentina Stick", 9000);
        Employee AndreyPup = new Nurse("Anrdey Pup", 8500);

        Employee CosteaDup = new Doctor("Costea Dup", 10000, "Common");
        Employee MarinaDef = new Doctor("Marina Def", 15000, "Super common");

        Doctor SashaCutir = new Doctor("Sasha Cutir", 8000, "Common"); // вау оно все равно работает, неожиданно, вы не знаете почему?

        Employee GaleaDudina = new Nurse("Galea Dudina", 8000); 

        System.out.println();
        veterinaryClinic.addDoctorWithNurse(MarinaDef, AndreyPup);
        veterinaryClinic.addDoctorWithNurse(CosteaDup, ValentinaStick);
        veterinaryClinic.addDoctor(SashaCutir);
        veterinaryClinic.addNurse(GaleaDudina);

        System.out.println();
        for (Doctor doctor : veterinaryClinic.getDoctors()) {
            System.out.println(doctor);
            doctor.works();
        }
        for (Nurse nurse : veterinaryClinic.getNurses()) {
            System.out.println(nurse);
            nurse.assist();
        }

        System.out.println("\nВсе плавающие животные--\n");
        for (Swimable swimble : veterinaryClinic.getSwimbles()) {
            System.out.println(swimble);
        }
        System.out.println("\nВсе летающие животные--\n");
        for (Flyable flyble : veterinaryClinic.getFlyables()) {
            System.out.println(flyble);
        }
        System.out.println("\nВсе бегающие животные--\n");
        for (Goable goable : veterinaryClinic.getGlobles()) {
            System.out.println(goable);
        }
    }
}
