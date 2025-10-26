package OOPs;

public class UserDefinedDataTypes {
    public static void main(String[] args) {

        // x and y are two object of the class Student

        Student x = new Student();
        x.name = "Salauddin";
        x.rollNo = 112;
        x.cgpa = 7.3;

        System.out.println(x.name + " " + x.rollNo + " " + x.cgpa);
        x.cgpa = 8.5;
        System.out.println(x.name + " " + x.rollNo + " " + x.cgpa);

        Student y = new Student();
        y.name = "Sakil";
        y.rollNo = 9;
        y.cgpa = 7.6;

        System.out.println(y.name + " " + y.rollNo + " " + y.cgpa);

        Student z = y; // z is shallow copy of y
        z.name = "Toumik";
        System.out.println(y.name + " " + y.rollNo + " " + y.cgpa);
    }
}
