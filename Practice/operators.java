public class operators{
    public static void main(String[] args) {
        // Operators

        // Arithmetic & Assignment Operators --> +, -, *, /, %, +=, -=, *=, /=, %=
        int a = 5, b =10;
        int c = a + b;  // 15
        int d = a - b;  // -5
        int e = a * b;  // 50
        int f = b / a;  // 2
        int g = b % a;  // 0
        System.out.println("Arithmetic Operators ");
        System.out.println("Addition " + c + "\nSubtraction " + d + "\nMultiplication " + e + "\nDivision " + f + "\nModulus " + g);
        
        int h = a + 2;  // 5 + 2 = 7
        System.out.println("Assignment Operators ");
        h += 2; // h = h + 2 = 7 +2 = 9
        System.out.println(h);
        h -= 2; // h = h - 2 = 9 - 2 = 7
        System.out.println(h);
        h *= 3; // h = h * 3 = 7 * 3 = 21
        System.out.println(h);
        h /= 3; // h = h / 3 = 21 / 3 = 7
        System.out.println(h);
        h %= 2; // h = h % 2 = 7 % 2 = 1
        System.out.println(h);

        // Increement & Decreement --> ++, --
        int i = 6;
        System.out.println("Increement - increase by one");
        ++i;
        System.out.println("Pre-increement " + i);
        i++;
        System.out.println("Post-increement " + i);
        int j = 10;
        System.out.println("Decreement - decrease by one");
        --j;
        System.out.println("Pre-decreement " + j); // 9
        j--;
        System.out.println("Post-decreement " + j); // 8

        // Relational operators --> <, >, <=, >=, ==, !=
        boolean k = (a==b);
        System.out.println("Relational Operator");
        System.out.println(k);
        System.out.println(a!=b);
        System.out.println(b>a);
        System.out.println(b>=a);
        System.out.println(a<b);
        System.out.println(a<=b);

        // Bitwise Operators --> &, |, ~ (unary operator), ^, <<, >>, >>>, >>>=, <<=, >>=, &=, |=
        int aa = 2, bb =3; // 2 - 10 , 3 - 11  binary
        int cc = aa & bb;  // 2 --> 10
        int dd = aa | bb;  // 3 --> 11
        int ee = aa ^ bb;  // 1 --> 01
        int ff = ~aa;      // -3 --> 11111111 11111111 11111111 11111101
        System.out.println("Bitwise Operator ");
        System.out.println(cc + " , " + dd + " , " + ee + " , " + ff);
        // shift operations
        int gg = 1;
        gg = gg << 31;
        System.out.println("Shift Operator - left & right ");
        System.out.println(gg);

        byte hh = 1;
        // cannot use integer as byte , so we need to type cast it  (byte)
        hh = (byte)(hh << 1);
        System.out.println(hh);

        // Logical Operator --> &&, ||, !
        int x = 5, y = 10, z = 15;
        boolean xyz1 = (x < y) && (x < z);
        System.out.println("Logical Operator ");
        System.out.println("Logical AND " + xyz1);
        boolean xyz2 = (x > y) || (x < z);
        System.out.println("Logical OR " + xyz2);


    }
}