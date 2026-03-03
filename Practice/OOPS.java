public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Kashish";
        s1.age = 24;
        s1.rollNumber = 17;
        s1.college = "AUC";

        s2.name = "Aakruti";
        s2.age = 25;
        s2.rollNumber = 18;
        s2.college = "VIT";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();
    }
}

class Student{
        String name, college;
        int rollNumber, age;
        void markAttendance(){
            System.out.println("Attendance marked by " + name);
        }
        void print(){
            System.out.println(name + " , " + age + " , " + rollNumber + " , " + college);
        }
    }