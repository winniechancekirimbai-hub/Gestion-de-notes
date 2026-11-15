import model.Student;
import model.Teacher;
import model.User;

public class App {
    public static void main(String[] args) throws Exception {

        User student = new Student("KIRIMBAI", "Winnie","winniechancekirimbai@gmail.com", "1234", "MAT001", "Informatique");
        User teacher = new Teacher("Djionang", "Berlin", "berlin@gmail.com", "2345", "professeur", "modelisation");
   
        student.info();
        student.Update("2536", "winniechancekirimbai@gmail.com");
        student.info();
        System.out.println(student.auth( "winniechancekirimbai@gmail.com", "2536"));
        teacher.info();
        teacher.auth("winniechancekirimbai@gmail.com", "2536");
        teacher.Update("2436", "winniechancekirimbai@gmail.com");
        teacher.info();

        


        
    }
}
