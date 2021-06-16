import java.util.ArrayList;

public class Student {

    private long id;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        double gradeCount = 0;
        for (int grade : this.grades) {
            gradeCount += grade;
        }
        return gradeCount / this.grades.size();
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

}
