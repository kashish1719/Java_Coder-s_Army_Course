public class typeConversion{
    public static void main(String[] args){
        // Implicit
        // byte to int
        byte b = 24;
        int i = b;
        System.out.println("Implicit " + i); // 24
        // character to int
        char ch = 'a';
        int c = ch;
        System.out.println("Implicit " + c); // 97

        // Explicit
        // int to byte
        int d = 300;
        byte bb = (byte) d;
        System.out.println("Explicit " + bb); // 44
        
        // Truncating
        float f = 15.678f;
        int fi = (int) f;
        System.out.println("Truncating " + fi); // 15

        // Boolean to any data type
        // These conversions are not possible
    }
}
