public class CallByReference {
    // there is no concept of call by reference in java. It just viewed as reference but internally it is call by value only using another class object.
    public static void main(String[] args) {
        Random r1 = new Random(4, 5);
        Random r2 = new Random(r1); // Deep copy
        Random r3 = r1; // Shallow copy

        System.out.println(r1.x + " , " + r1.y);

        addTen(r1);
        System.out.println("After function");
        System.out.println(r1.x + " , " + r1.y);
    }
    // function to add 10 to x & y
    static void addTen(Random r){
        r.x = r.x + 10;
        r.y = r.y + 10;
    }
}

class Random{
    int x, y;
    Random(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Copy constructor -- for deep copy it is needed
    Random(Random r){
        this.x = r.x;
        this.y = r.y;
    }
}
