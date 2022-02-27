public class Q1 {
    public static void main(String[] args) {
        // deep copy
        Student s1 = new Student("Fang",001,3.7);
        Student s2 = new Student(s1);
        System.out.println(s1);
        System.out.println(s2);

        // shallow copy
        Student s3 = new Student("Cong",003,4.0);
        Student s4 = s3;
        System.out.println(s3);
        System.out.println(s4);
    }
}
class Student {
    private String name;
    private int studentID;
    private double gpa;


    public Student(String name, int studentID, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;

    }

    public Student() {
        name = "student";
        studentID = 0;
        gpa = 4.0;
    }

    public Student(Student student){
        Student s = new Student();
        this.name = student.name;
        this.studentID = student.studentID;
        this.gpa = student.gpa;

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


