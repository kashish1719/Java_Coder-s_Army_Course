public class functions {
    public static void main(String[] args) {
        System.out.println("Function is a block of code which is executed when a function is called.");
        System.out.println();
        System.out.println("\t\tTypes of function: ");

        System.out.println("1) No Input , No Output");
        greet();

        System.out.println("2)Input, No Output");
        // String name = "Kashish";
        // sayHello(name);
        sayHello("Kashish");  // Argument

         // No Input, Output
        System.out.println("3)  No Input, Output");
        // int x = getNumber();
        // System.out.println(x);
        System.out.println(getNumber());

        // Input, Output
        System.out.println("4) Input, Output");
        int a = 5, b = 2;
        // int c = multiply(a, b);
        // System.out.println(c);
        System.out.println(multiply(a, b));

    }

    // -------------------------------- FUNCTIONS TYPES ----------------------------------
    // No Input , No Output
    static void greet(){
        System.out.println("Hello");
        // return; optional
    }
    //Input, No Output
    static void sayHello(String name){    // number of parameter can be anything
        System.out.println("Hello, " + name);
        // return; optional
    }
    // No Input, Output
    static int getNumber(){
        return 10;
    }
    // I
    // Input, Output
    static int multiply(int a, int b){
        // int mul = a * b;
        // return mul;
        return a * b;
    }
}
