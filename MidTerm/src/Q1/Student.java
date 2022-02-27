package Q1;

public class Student {
    String name;
    int studentID;
    double gpa;
    Department department;

    public Student(String name, int studentID, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;

    }
    public Student(Student student){
        this.name = student.name;
        this.studentID = student.studentID;
        this.gpa = student.gpa;
    }
//    public Student(Student student){
//        this.name = student.name;
//        this.studentID = student.studentID;
//        this.gpa = student.gpa;
//    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

}
