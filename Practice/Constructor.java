public class Constructor {
    // If you create object with no parameter and in class only parameterized constructor then will throw error. To solve we use constructor overloading

    public static void main(String[] args) {
        // default constructor
        Student s1 = new Student();
        // parameterized constructor
        Student s2 = new Student("Aakruti", 25, 18, "VIT");


        // default constuctor value
        System.out.println("default constuctor");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        // Parameterized constructor value
        System.out.println("Parameterized constructor");
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.rollNumber);
        System.out.println(s2.college);

        // int x; // local variable -> No default value
        // System.out.println(x);
    }
}
/*
    Default value of -> Integer - 0
                        floating - 0.0
                        Boolean - false
                        String - null (nothing)
*/
class Student{
    // characteristic / instance variables
        String name, college;
        int rollNumber, age;

    // behaviour / instance methods
        void markAttendance(){
            System.out.println("Attendance marked by " + name);
        }

    // Default constructor
    Student(){
        name = "Kashish";
        age = 24;
        rollNumber = 17;
        college = "AUC";
    }

    // Parameterized constructor
    Student(String n, int a, int rn, String c){
        name = n;
        age = a;
        rollNumber = rn;
        college = c;
    }
}