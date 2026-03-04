public class ConstructorOverload {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Arya");
        Student s3 = new Student("Arya", 25);
        Student s4 = new Student("Arya", 25, 104);
        Student s5 = new Student("Arya", 25, 104, "BIT");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
}

class Student{
    // characteristic / instance variables
        String name, college;
        int rollNumber, age;

    // behaviour / instance methods
        void markAttendance(){
            System.out.println("Attendance marked by " + name);
        }


    // ----------------------------------------------------------------------------
    // Constructor CHaining  -- > One way
    /*
    // Default constructor
    Student(){
        // we wont assign null to string value as it is a problem in java (null pointer)
        this.name = "unknown";
        this.age = 0;
        this.rollNumber = 0;
        this.college = "unknown";
    }

    // Parameterized constructor
    Student(String name){
        // this.name = name;
        this(name, 0, 0, "unknown");
    }
    Student(String name, int age){
        // this.name = name;
        // this.age = age;
        this(name, age, 0, "unknown");
    }
    Student(String name, int age, int rollNumber){
        // this.name = name;
        // this.age = age;
        // this.rollNumber = rollNumber;
        this(name, age, rollNumber, "unknown");
    }
    Student(String name, int age, int rollNumber, String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }
    
    */

    // ----------------------------------------------------------------------------
    // Constructor CHaining  -- > Another way
    Student(){
        this("unknown");
        System.out.println("This is my first constructor");
    }
    Student(String name){
        this(name, 0);
        System.out.println("This is my second constructor");
    }
    Student(String name, int age){
        this(name, age, 0);
        System.out.println("This is my third constructor");
    }
    Student(String name, int age, int rollNumber){
        this(name, age, rollNumber, "unknown");
        System.out.println("This is my fourth constructor");
    }
    Student(String name, int age, int rollNumber, String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
        System.out.println("This is my fifth constructor");
    }
}