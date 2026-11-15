package model;

public abstract class User{
    
    private String nom;
    private String prenom;
    private String email;
    private String password;

    public User(String nom, String prenom, String email, String password){
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
    }

    public void info(){
        System.out.println("Les informations de l'utilisateur sont :");
        System.out.println("Nom & Prenom :" + nom + " " + prenom);
        System.out.println("Email :" + email);
    }

    public String Update(String pass, String mail){
        this.email = mail;
        this.password = pass;

        return this.toString();
    }

    public abstract String auth(String mail, String pass);

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}
