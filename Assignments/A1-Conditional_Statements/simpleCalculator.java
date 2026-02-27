import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class simpleCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter one integer: ");
        int num1 = Integer.parseInt(br.readLine());
        // System.out.println("Enter character (+ - * / %) to perform operation: ");
        char op;
        while (true) {
            System.out.print("Enter operator (+ - * / %): ");
            op = br.readLine().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                break; // valid operator → exit loop
            } else {
                System.out.println("Invalid operator! Try again.");
            }
        }
        System.out.println("Enter one integer: ");
        int num2 = Integer.parseInt(br.readLine());
        
        /*
        switch(op){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
        }

        */
        switch(op){
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.println(num1 * num2);
            case '/' -> System.out.println(num1 / num2);
            case '%' -> System.out.println(num1 % num2);
        }

    }
}
