public class StudyProgramme {
    private String name;
    private String description;
    private int numberOfSemesters;
    private int numberOfITNsAllowed;

    public StudyProgramme(String name, String description, int numberOfSemesters, int numberOfITNsAllowed) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.numberOfITNsAllowed = numberOfITNsAllowed;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }
    public void setNumberOfSemesters(int numberOfSemesters) {
        this.numberOfSemesters = numberOfSemesters;
    }


    public int getNumberOfITNsAllowed() {
        return numberOfITNsAllowed;
    }
    public void setNumberOfITNsAllowed(int numberOfITNsAllowed) {
        this.numberOfITNsAllowed = numberOfITNsAllowed;
    }
}
