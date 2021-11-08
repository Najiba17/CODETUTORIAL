import java.text.ParseException;
import java.text.SimpleDateFormat;


public class App {
    public static void main(String[] args) throws ParseException {

    
    Professor p1= new Professor("Lotfi", "Sallemi",new SimpleDateFormat("dd/MM/yyyy").parse("15/03/1974"), "Sfax", "98 957 125");
    Professor p2= new Professor("Monji", "Gargouri",new SimpleDateFormat("dd/MM/yyyy").parse("27/04/1968"), "Sfax", "98 215 888");
    Course c1= new Course(1234, "Software Engineering", 10, 30, new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2021"), new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2021"));
    Course c2= new Course(1235, "Software Design", 10, 30, new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2021"), new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2021"));
    Course c3= new Course(1236, "Mobile Development", 10, 30, new SimpleDateFormat("dd/MM/yyyy").parse("12/09/2021"), new SimpleDateFormat("dd/MM/yyyy").parse("12/12/2021"));
    
    Student std1= new Student("Mohamed", "Said",new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2000"), "Sfax", "22 157 125");
    Student std2= new Student("Ramzi", "Tounsi",new SimpleDateFormat("dd/MM/yyyy").parse("18/01/1999"), "Tunis", "27 107 125");
    Student std3= new Student("Wassim", "Said",new SimpleDateFormat("dd/MM/yyyy").parse("15/07/2001"), "Sfax", "22 566 478");
    Student std4= new Student("karim", "Masmoudi",new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2001"), "Tunis", "22 157 125");
    Student std5= new Student("Mariem", "Damak",new SimpleDateFormat("dd/MM/yyyy").parse("25/07/2002"), "Nabeul", "97 157 125");
    Student std6= new Student("Basma", "Sallemi",new SimpleDateFormat("dd/MM/yyyy").parse("07/02/2002"), "Mahdia", "44 157 105");
    Student std7= new Student("Mohamed", "Salah",new SimpleDateFormat("dd/MM/yyyy").parse("21/09/2001"), "Sfax", "22 885 125");
    Student std8= new Student("Mouna", "Tousni",new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2000"), "Sfax", "22 000 125");
    Student std9= new Student("Mohamed", "Trimech",new SimpleDateFormat("dd/MM/yyyy").parse("28/06/2000"), "Tunis", "22 157 000");
    Student std10= new Student("Sahar", "Louati",new SimpleDateFormat("dd/MM/yyyy").parse("04/12/2001"), "Sfax", "22 137 225");
    Student std11= new Student("Mohamed", "Ahmadi",new SimpleDateFormat("dd/MM/yyyy").parse("15/10/2000"), "Sfax", "21 057 977");

        p1.addCourse(c1);
        p1.addCourse(c2);
        p2.addCourse(c3);
        p2.addCourse(c2);
    new Enroll(std1,c1);
    new Enroll(std2,c1);
    new Enroll(std3,c1);
    new Enroll(std10,c1);
    new Enroll(std9,c1);

    new Enroll(std1,c2);
    new Enroll(std2,c2);
    new Enroll(std4,c2);
    new Enroll(std5,c2);
    new Enroll(std10,c2);
    new Enroll(std9,c2);

    new Enroll(std2,c3);
    new Enroll(std6,c3);
    new Enroll(std7,c3);
    new Enroll(std8,c3);
    new Enroll(std10,c3);
    new Enroll(std11,c3);
    System.out.println("**********");
    System.out.println("List of subjects for each professor ");
    System.out.println("**********");
    System.out.println("**********");
    System.out.println("  ");
    p1.displayCourses();
    System.out.println("  ");
    p2.displayCourses();

    System.out.println("**********");
    System.out.println("List of subscribed Students for each course ");
    System.out.println("**********");
    System.out.println("**********");
    System.out.println("  ");
    c1.displayStudents();
    System.out.println("  ");
    c2.displayStudents();
    System.out.println("  ");
    c3.displayStudents();
    System.out.println("  ");
    System.out.println("**********");
    System.out.println("List of subjects for each Student  ");
    System.out.println("**********");
    System.out.println("**********");
    System.out.println("  ");
    std1.displayCourses();
    System.out.println("  ");
    std2.displayCourses();
    System.out.println("  ");
    std3.displayCourses();
    System.out.println("  ");
    std4.displayCourses();

    }
}
