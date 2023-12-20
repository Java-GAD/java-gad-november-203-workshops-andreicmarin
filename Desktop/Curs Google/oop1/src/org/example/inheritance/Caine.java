package org.example.inheritance;

public class Caine extends AnimalDomestic {
    public Caine(String nume) {
        super(nume);
    }

    public void latra() {
        System.out.println("ham ham");
    }
}