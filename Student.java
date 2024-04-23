import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private static int indexCounter = 1;

    private int indexNumber;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private String address;
    private String phoneNumber;
    private StudyProgramme studyProgramme;
    private int currentSemester;
    private String studentStatus;
    private List<Grade> grades;

    public Student(String firstName, String lastName, String email, String address, String phoneNumber, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.indexNumber = indexCounter++;
        this.grades = new ArrayList<>();
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }

    public void setStudyProgramme(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
    }


    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }


    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public void promoteToNextSemester() {
        if (currentSemester < studyProgramme.getNumberOfSemesters()) {
            currentSemester++;
            System.out.println("Student " + firstName + " " + lastName + " został promowany do semestru " + currentSemester);
        } else {
            System.out.println("Student " + firstName + " " + lastName + " już ukończył program studiów");
            studentStatus = "Absolwent";
        }
    }

    public void addGrade(int grade, String courseName) {
        Grade newGrade = new Grade(grade, courseName);
        grades.add(newGrade);
        System.out.println("Grade added: " + courseName + " - " + grade);
    }
}

