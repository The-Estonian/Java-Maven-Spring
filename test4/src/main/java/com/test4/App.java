package com.test4;

import java.time.LocalDate;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person tom = new Person("Tom", "Tommeh", LocalDate.of(2025, 02, 22));
        Person janet = new Person("Janet", "Jackson", LocalDate.of(2000, 1, 1));

        tom.setSpouse(janet);

        Dog fido = new Dog("Fido", LocalDate.of(1900, 2, 22));
        tom.setPet(fido);

        Cat pepa = new Cat("Pepa", LocalDate.of(1999, 1, 1));
        janet.setPet(pepa);

        tom.getSpouse().getPet().meow();
    }
}
