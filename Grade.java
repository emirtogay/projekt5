public class Grade {
    private int gradeValue;
    private String courseName;

    public Grade(int gradeValue, String courseName) {
        this.gradeValue = gradeValue;
        this.courseName = courseName;
    }

    public int getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(int gradeValue) {
        this.gradeValue = gradeValue;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}