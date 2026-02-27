import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class temperature {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter temperature: ");
        int temp = Integer.parseInt(br.readLine());
        if(temp < 10){
            System.out.println("Very Cold");
        }
        else if (temp >= 10 && temp < 25){
            System.out.println("Moderate");
        }
        else{
            System.out.println("Hot");
        }
    }
}
