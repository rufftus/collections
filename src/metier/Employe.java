package metier;

public class Employe {
     private String nom;
     private String prenom;
     private Service service;

     public Employe(String nom, String prenom, Service service){
         this.nom=nom;
         this.prenom=prenom;
         this.service=service;
     }


    public void setNom(String nom){
        this.nom=nom;
    }
    public String getNom(){
        return nom;
    }

    public void setPrenom(String mdp){
        this.prenom=prenom;
    }
    public String getPrenom(){
        return prenom;
    }

    public void setService(Service service){ this.service=service;}
    public Service getService(){ return service;}


}
