package year2023.week4.labs.people;

import java.util.ArrayList;
import java.util.List;

public class Student extends  Person{
    private int credits;
    private int student_id;
    private List<Double> grades;

    public Student(String name, String address){
        super(name, address);
        this.credits = 0;
        this.grades = new ArrayList<>();
    }

    public int credits(){
        return this.credits;
    }

    public void study(){
        this.credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tcredits " + this.credits;
    }

    public int getStudentId() {
        return this.student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public List<Double> getGrades() {
        return this.grades;
    }
    public void addGrade(double grade) {
        if (grade >= 0.0 && grade <= 100.00 ) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Grade should be between 0 and 100");
        }
    }
}
