import java.util.Date;

public class Person {
    
    
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String adress;
    private String phoneNumber;

    
    public Person(String firstName, String lastName, Date dob, String adress, String phoneNumber) {
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.setDateOfBirth(dob);
        this.setPhoneNumber(phoneNumber);
        this.setAdress(adress);
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
}
