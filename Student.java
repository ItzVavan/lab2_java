import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades != null ? grades : new int[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void setGradesCopy(int[] grades) {
        this.grades = grades != null ? grades.clone() : new int[0];
    }

    @Override
    public String toString() {
        return name + ": " + Arrays.toString(grades);
    }
}