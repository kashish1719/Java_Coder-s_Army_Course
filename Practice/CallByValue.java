public class CallByValue {
    public static void main(String[] args) {
        int x = 4, y = 5;
        System.out.println(x + " , " + y);

        addTen(x,y);
        System.out.println("After function");
        System.out.println(x + " , " + y);
    }

    static void addTen(int a, int b){
        a = a + 10;
        b = b + 10;
        // No changes even after updating because in memory x & y value has diffrent memory .... a & b has different memory
    }
}
