package org.example;

import java.time.LocalDate;

public class Angajat {
    private String nume;
    private String postul;
    private LocalDate dataAngajarii;
    private float salariu;

    public Angajat() {

    }

    public Angajat(String nume, String postul, LocalDate dataAngajarii, float salariu) {
        this.nume = nume;
        this.postul = postul;
        this.dataAngajarii = dataAngajarii;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPostul() {
        return postul;
    }

    public void setPostul(String postul) {
        this.postul = postul;
    }

    public LocalDate getDataAngajarii() {
        return dataAngajarii;
    }

    public void setDataAngajarii(LocalDate dataAngajarii) {
        this.dataAngajarii = dataAngajarii;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }


    @Override
    public String toString() {
        return nume + ", " + postul + ", " + dataAngajarii + ", " + salariu;
    }
}
