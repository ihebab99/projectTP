package model;

public class Etudiant {
    private int id;
    private String nom;
    private int cin;

    public Etudiant(int id, String nom, int cin) {
        this.id = id;
        this.nom = nom;
        this.cin = cin;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", cin=" + cin +
                '}';
    }
}
