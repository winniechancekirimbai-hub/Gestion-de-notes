package gestion_vehicule;
public  class Passager{ 

    private String nom;
    private  String prenom ;
    private  String cni ;
     public Passager (String nom,String prenom,String cni) {
        this.nom = nom;
        this.prenom = prenom;
        this.cni = cni;
     }
     public String getNom(String nom){
 return nom;
     }

public void setNom(String nom){
    this.nom =nom;
}

public String getprenom(String prenom){

 return prenom;
     }

public void setprenom(String prenom){

    this.prenom =prenom;
}
public String getcni(String cni){

 return cni;
     }


public void setcni(String cni){
    this.cni = cni;
}
}
