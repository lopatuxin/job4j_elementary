package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String specialization;

    public Surgeon(String name, String surname, String education, String birthday, int experience, String specialization) {
        super(name, surname, education, birthday, experience);
        this.specialization = specialization;
    }

    public void operation(Pacient pacient) {

    }

}
