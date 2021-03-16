package de.thunderfrog;

public class Mitarbeiter {
    private String vorname;
    private String nachname;
    private double gehalt;
    private int personalnummer;
    private static int persoAnzahl = 0;

    public Mitarbeiter(String vorname, String nachname, double gehalt, int personalnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.gehalt = gehalt;
        this.personalnummer = personalnummer;
        persoAnzahl++;
    }

    public Mitarbeiter() {
        persoAnzahl++;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    public static int getPersoAnzahl() {
        return persoAnzahl;
    }
}
