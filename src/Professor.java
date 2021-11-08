import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Professor extends Person{

    public Professor(String firstName, String lastName, Date dob, String adress, String phoneNumber) {
        super( firstName, lastName,  dob,  adress,  phoneNumber);
        
    }
    
    List <Course> listCourses= new ArrayList<Course>();
    public void addCourse(Course c){
        var test=false;
        if (listCourses.isEmpty())
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

    private float salary;
    public void displayCourses()
    {
        System.out.println("Professor "+this.getFirstName()+ " "+ this.getLastName());
        if (!listCourses.isEmpty())
            for (Course c: listCourses)
            {
                System.out.println("Course: "+ String.valueOf(c.getCode())+ "-- "+ c.getName());
            }
        else
            System.out.println("No attributed courses until now");

    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void addPrime()
    {
     if (listCourses.size()==4)
        this.setSalary(this.getSalary()+5000);   
    }

}
