public class functionOverloading {
    public static void main(String[] args) {
        int x = sum(2, 3);
        System.out.println(x);

        int y = sum(5, 6);
        System.out.println(y);

        System.out.println("Function Overloading -> same function name with different number of parameter / different types of parameter / ordering of parameter");

        System.out.println("Different number of parameter");
        int z = sum(3, 5, 6);
        System.out.println(z);

        System.out.println("Different types of parameter");
        int d = sum(2.5, 7.5);
        System.out.println(d);

        // ordering of parameter
        greet("Kashish", 22);
        greet(24, "Aakruti");
    }

    static int sum(int a, int b){
        return (a + b);
    }
    static int sum(int a, int b, int c){
        return (a + b + c);
    }
    static int sum(double a, double b){
        return (int)(a + b);
    }
    static void greet(String name, int age){
        System.out.println("Hi " + name + " . Your age is " + age);
    }
    static void greet(int age, String name){
        System.out.println("Hi " + name + " . Your age is " + age);
    }
}
