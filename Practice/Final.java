public class Final {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);

        // PI cannot be re-assigned
        // r1.PI = 3.16;

        // final keyword allowed inside main function
        final int x = 4;
        System.out.println(x);
        // allowed for once
        final int y;
        y = 5;
        System.out.println(y);
        // not allowed twice
        // y = 10;


        // static final keyowrd together PI_VALUE
        System.out.println(Random.PI_VALUE);
    }
}

class Random{
    // declare and define same line
    // final double PI = 3.14;

    // if not then also can be defined inside constructor because whenever object is created constructor is called
    final double PI;

    Random() {
        this.PI = 3.14;
    }


    // static final keyword
    // static final double PI_VALUE = 3.141;
    static final double PI_VALUE;
    static{
        PI_VALUE = 3.141;
    }

}

// Why main is static in java ??
/*
    without static JVM has to create object and from that it has to call main.
    Demo d1 = new Demo();
    d1.main();

    with static JVM directly calls main without creating object for it.
    Demo.main();
*/