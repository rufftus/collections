import metier.Employe;
import metier.Service;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    private static List<Employe> chargerListe() {
        List<Employe> mesEmployes = new ArrayList<>();

        Service comptabilite = new Service("Comptabilité");
        Service commercial = new Service("Commercial");

        Employe aEmploye= new Employe("Paul", "Auchon", comptabilite);
        Employe bEmploye= new Employe("Ali", "Gathor", comptabilite);
        Employe cEmploye= new Employe("Annie", "Zhetta", commercial);
        Employe dEmploye= new Employe("Vincent", "Pourcent", commercial);

        mesEmployes.add(aEmploye);
        mesEmployes.add(bEmploye);
        mesEmployes.add(cEmploye);
        mesEmployes.add(dEmploye);

        return mesEmployes;
    }

    private static void parcourirListe(List<Employe> lesEmployes) {
        for (Employe unEmploye : lesEmployes) {
            System.out.println(unEmploye.getPrenom() + " " + unEmploye.getNom() + ", Service : " + unEmploye.getService().getLibelle());
        }
    }

    private static void chercherEmployeWhile(String nom, List<Employe> lesEmployes) {
        boolean sortie = false;
        int nbEmploye = lesEmployes.size();
        int cpt = 0;
        while ((cpt < nbEmploye) && (!sortie)) {
            if (lesEmployes.get(cpt).getNom().equals(nom)) {
                sortie = true;
            } else {
                cpt++;
            }
        }
        if (sortie) {
            /* A completer : cpt est l'indice de l'employé trouvé */
            System.out.println(unEmploye.getPrenom() + " " + unEmploye.getNom() + ", Service : " + unEmploye.getService().getLibelle());
        } else {
            System.out.println("L'employé : " + nom + " n'existe pas !");
        }
    }
}
