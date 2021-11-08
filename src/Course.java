
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {
    private String name;
    private int code;
    private int minStudents;
    private int maxStudents;
    private Date startDate;
    private Date endDate;
    

    public Course (int code, String name, int min, int max, Date start, Date end){
        this.setCode(code);
        this.setName(name);
        this.setMinStudents(min);
        this.setMaxStudents(max);
        this.setStartDate(start);
        this.setEndDate(end);

    }
    List <Student> listStudents= new ArrayList<Student>();

    public void addStudent(Student std){
        var test=false;
        if (listStudents.isEmpty() && listStudents.size()<this.getMaxStudents()&& !this.isCancelled())
            listStudents.add(std);
        else
            {
                for (Student stdd  : listStudents) {
                    if ((std.getFirstName()).equalsIgnoreCase(stdd.getFirstName())&&(std.getLastName()).equalsIgnoreCase(stdd.getLastName()) )
                    {
                        test=true;
                        break;
                    }

                }
                if(!test)
                    listStudents.add(std);
                
            }
    }
    public void displayStudents()
    {
        System.out.println("Course "+ String.valueOf(this.getCode())+" -- "+this.getName());
        if (!listStudents.isEmpty())
            for (Student std: listStudents)
            {
                System.out.println("Student: "+ std.getFirstName()+ "  "+ std.getLastName());
            }
        else
            System.out.println("No subscribed students yet");

    }
    public boolean isCancelled(){
        if ((listStudents.size()< this.minStudents)&& ((this.startDate).before(new Date())))
            return true;
       return false;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public int getMinStudents() {
        return minStudents;
    }

    public void setMinStudents(int minStudents) {
        this.minStudents = minStudents;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
