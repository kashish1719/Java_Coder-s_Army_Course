import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class positiveNumberCheck {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer: ");
        int num = Integer.parseInt(br.readLine());
        if(num >= 0){
            System.out.println("Positive number");
        }
    }
}
