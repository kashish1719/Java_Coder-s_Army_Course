public class Static {
    public static void main(String[] args) {
        Student s1 = new Student("Kashish", 24, 101);
        Student s2 = new Student("Aakruti", 25, 102);

        // Student.college = "AUC";

        System.out.println(s1.name + " , " + s1.age + " , " + s1.rollNo + " , " + s1.college);
        System.out.println(s2.name + " , " + s2.age + " , " + s2.rollNo + " , " + Student.college);
    }
}

class Student{
    String name;
    int age, rollNo;
    //  static String college = "AUC";
    static String college;
    static int grade;
    // Before creating object static variables are initialized

    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // static block
    static{
        college = "AUC";
        grade = 10;
    }
}