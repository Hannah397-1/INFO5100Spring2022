package Q1;

public class Main {
    public static void main(String[] args) {
        // shallow copy
        Student s1 = new Student("Fang",001,3.7);
        Student s2 = new Student(s1);
        System.out.println(s1);
        System.out.println(s2);


        Student s3 = new Student("Cong",003,4.0);
        Student s4 = s3;
        System.out.println(s3);
        System.out.println(s4);
    }
}
