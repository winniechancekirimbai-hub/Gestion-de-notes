package model;

public class Teacher extends User {
    private String grade;
    private String specialite;

    public Teacher(String nom, String prenom, String email, String passwotd, String grade, String specialite) {
        super(nom, prenom, email, passwotd);
        this.grade = grade;
        this.specialite = specialite;
    }

        @Override
        public String auth(String mail, String pass){
          
        

          return "Je suis etudiant";
    }

    public String enseigner(){
        return "Je suis enseignant"; 
    }

}
