import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class evenOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer: ");
        int num = Integer.parseInt(br.readLine());
        if(num % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
