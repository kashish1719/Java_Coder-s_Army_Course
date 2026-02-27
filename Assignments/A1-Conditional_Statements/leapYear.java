import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class leapYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer: ");
        int num = Integer.parseInt(br.readLine());
        if((num % 400 == 0) || (num % 4 == 0 && num % 100 != 0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}
