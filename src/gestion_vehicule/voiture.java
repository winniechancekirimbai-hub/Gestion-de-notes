package gestion_vehicule;

import java.util.List;

public class voiture{
    private String nom;
    private String marque;
    private List < Passager > passagers ;
    private List <Siege> sieges;

public voiture (String nom,String marque,List <Passager> p) {
    this.nom = nom;
    this.marque = marque;
this.passagers = p;
for( int i=1 ;i < 4 ;i++) {
    this.sieges.add(new Siege(i,"bleu"));
}

}
}