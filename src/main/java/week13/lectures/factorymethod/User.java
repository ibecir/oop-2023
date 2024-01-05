package week13.lectures.factorymethod;

// This can be an interface, or even a concrete class
abstract class Student {

    public abstract int getStudentAge();

    public abstract int getEcts();

    @Override
    public String toString() {
        return "Age= " + this.getStudentAge() + ", ECTS=" + this.getEcts();
    }
}

class Undergraduate extends Student {

    @Override
    public int getStudentAge() {
        return 18;
    }

    @Override
    public int getEcts() {
        return 180;
    }
}

class Graduate extends Student {

    @Override
    public int getStudentAge() {
        return 23;
    }

    @Override
    public int getEcts() {
        return 240;
    }
}

class PhDGraduate extends Student {

    @Override
    public int getStudentAge() {
        return 26;
    }

    @Override
    public int getEcts() {
        return 400;
    }
}

// This can also be a String, enums are not the part of the pattern
enum StudentType {
    UNDERGRADUATE,
    GRADUATE,
    PHD_GRADUATE
}

class StudentFactoryMethod {
    // This can also be a String, enums are not the part of the pattern
    public static Student getStudent(StudentType type){
        if(type.equals(StudentType.UNDERGRADUATE))
            return new Undergraduate();
        else if(type.equals(StudentType.GRADUATE))
            return new Graduate();
        else if(type.equals(StudentType.PHD_GRADUATE))
            return new PhDGraduate();

        return null;
    }
}

class FactoryMethodTest {
    public static void main(String[] args) {
        Student undergraduateStudent = StudentFactoryMethod.getStudent(StudentType.UNDERGRADUATE);
        System.out.println(undergraduateStudent.getEcts());

        Student graduateStudent = StudentFactoryMethod.getStudent(StudentType.GRADUATE);
        System.out.println(graduateStudent.getEcts());

        Student phdGraduate = StudentFactoryMethod.getStudent(StudentType.PHD_GRADUATE);
        System.out.println(phdGraduate.getEcts());
    }
}