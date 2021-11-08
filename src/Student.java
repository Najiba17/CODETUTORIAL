import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Person{

    public Student(String firstName, String lastName, Date dob, String adress, String phoneNumber) {
        super( firstName, lastName,  dob,  adress,  phoneNumber);
        
    }
    

    public boolean isOnProbation() {
        return isOnProbation;
    }

    public void setOnProbation() {
        this.isOnProbation = true;
    }

    public boolean isPartTime() {
        return isPartTime;
    }
    public void setPartTime() {
        this.isPartTime = true;
    }

    private boolean isInternational=false;
    private boolean isPartTime=false;
    private boolean isOnProbation=false;
    List <Course> listCourses= new ArrayList<Course>();
    public void addCourse(Course c){
        var test=false;
        if ((listCourses.isEmpty() && (c.getStartDate().before(new Date()))))
            listCourses.add(c);
        else
            {
                for (Course course : listCourses) {
                    if (course.getCode()==c.getCode())
                    {
                        test=true;
                        break;
                    }

                }
                if(!test)
                    listCourses.add(c);
                
            }

    }
    public void displayCourses()
    {
        System.out.println("Student : "+ this.getFirstName()+ " " +this.getLastName());
        if (!listCourses.isEmpty())
            for (Course c: listCourses)
            {
                System.out.println("Course: "+ String.valueOf(c.getCode())+ "-- "+ c.getName());
            }
        else
            System.out.println("No courses until now");

    }
    public boolean isInternational() {
        return isInternational;
    }

    public void setInternational() {
        this.isInternational = true;
    }
   
    
}
