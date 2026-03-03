public class chainingFunction {

    static int x = 6, y = 7;

    public static void main(String[] args) {
        // chaining of functions
        fun1();
        System.out.println("Bye");

        // scope of variable
        int x = 4, y = 5;
        System.out.println("Local");
        System.out.println("x = " + x + " y = " + y);
        fun4();
    }
    static void fun1(){
        fun2();
        System.out.println("Hi");
    }
    static void fun2(){
        fun3();
        System.out.println("Hello");
    }
    static void fun3(){
        System.out.println("How are you? ");
    }
    static void fun4(){
        // x, y is local variable that's why not accessible
        // System.out.println(x + " " + y);
        int a = 4, b = 5; // local to this fun4()
        System.out.println("Local");
        System.out.println("a = " + a + " b = " + b);

        // global variable - x, y
        System.out.println("Global");
        System.out.println("x = " + x + " y = " + y);
    }

}
