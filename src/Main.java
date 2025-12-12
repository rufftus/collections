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
        for (List<Employe> mesEmployes) {
            System.out.println(unEmploye.getPrenom() + " " + unEmploye.getNom() + ", Service : " + unEmploye.getService().getLibelle());
        }
    }
}
