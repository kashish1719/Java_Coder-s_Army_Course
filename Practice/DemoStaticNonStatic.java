class DemoStaticNonStatic {

    static int a = 10;   // static
    int b = 20;          // instance
    static void show() {
        System.out.println("Accessing static variable a inside  static function/method");
        System.out.println("a = " + a);
        // System.out.println(b); ❌ not allowed
    }

    void display() {
        System.out.println("Accessing static variable a inside non static function/method");
        System.out.println("a = " + a); // allowed
        System.out.println("Non static variable/ class instance variable b");
        System.out.println("b = " + b); // allowed
    }

    public static void main(String[] args) {
        DemoStaticNonStatic obj = new DemoStaticNonStatic();
        obj.display();
        show();
        System.out.println("Accessing static variable a using ClassName.member inside main function");
        System.out.println("a = " + DemoStaticNonStatic.a);
    }
}