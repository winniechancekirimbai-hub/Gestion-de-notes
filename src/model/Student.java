package model;

public class Student extends User {
    private String matricule;
    private String filiere;

    public Student(String nom, String prenom, String mail, String password, String mat, String filiere) {
        super(nom, prenom, mail, password);
        this.matricule = mat;
        this.filiere = filiere;
    }

    @Override
    public String  auth(String mail, String pass){
        

        return "Je suis etudiant";
    }

}
