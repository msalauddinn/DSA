package OOPs;
class Student { // here 'Student' is a user defined data type
    private String teacher = "Raghav";
    String name;
    int rollNo;
    double cgpa;
    String getTeacher() { // getter
        return teacher;
    }
    void setTeacher(String s) { // setter
        teacher = s;
    }
    void print() {
        System.out.println(teacher + " " + name + " " + rollNo + " " + cgpa);
    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
         Student s1 = new Student();
         s1.name = "Salauddin";
         s1.cgpa = 7.4;
         s1.rollNo = 22;
         s1.setTeacher("Sandeep Sir");
         // s1.teacher = "jky";
         // s1.printTeacher();
         System.out.println(s1.getTeacher() + " " + s1.name + " " + s1.rollNo + " " + s1.cgpa);
    }
}
