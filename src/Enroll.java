
import java.util.Date;

public class Enroll {
    private Date date;
    private int grade;
    
    public Enroll(Student std, Course course){
        std.addCourse(course);
        course.addStudent(std);
        this.setDate(new Date());
    }

    
    public Date getDate() {
        return date;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
