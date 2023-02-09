package dao;

import dao.impl.IDaoImplEtudiant;
import model.Etudiant;

public class main {
    public static void main(String[] args) {
        Etudiant e= new Etudiant(1,"iheb",14003232);
        Etudiant e1= new Etudiant(2,"ahmed",14553232);
        Etudiant e2= new Etudiant(3,"wael",14563212);
        IDaoImplEtudiant etudiant = new IDaoImplEtudiant();
        etudiant.ajouter(e);
        etudiant.ajouter(e1);
        etudiant.ajouter(e2);

        //System.out.println(e.toString());
    }
}
