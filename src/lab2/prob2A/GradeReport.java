package lab2.prob2A;

public class GradeReport {
    private String grade;
    private Student owner;

    GradeReport (Student student) {
        this.owner = student;
        this.grade = "N/A";
    }

    public String getGrade() {
        return grade;
    }

    public Student getStudent() {
        return owner;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

}
