package dao.impl;

import dao.IDaoEtudiant;
import model.Etudiant;

import java.util.ArrayList;

public class IDaoImplEtudiant implements IDaoEtudiant {
    @Override
    public void ajouter(Etudiant etudiant) {
        ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
        etudiants.add(etudiant);
        System.out.println(etudiant);
    }


}
