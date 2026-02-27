import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class numberSignCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer to check if it is positive, negative or zero: ");
        int num = Integer.parseInt(br.readLine());
        if(num > 0){
            System.out.println("Positive number");
        }
        else if(num < 0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Zero");
        }
    }
}
