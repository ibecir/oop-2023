package week11.labs;

class Student {
    private int id;
    private String name;
    private String university;
    private String department;
    private double gpa;

    public Student(int id, String name, String university, String department, double gpa ) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.department = department;
        this.gpa = gpa;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public String getUniversity() {
        return this.university;
    }
    public String getDepartment() {
        return this.department;
    }
    public double getGPA() {
        return this.gpa;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", GPA=" + this.gpa +
//                '}';
//    }
    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
