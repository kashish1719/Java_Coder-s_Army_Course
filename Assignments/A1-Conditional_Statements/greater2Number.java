import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class greater2Number{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two integers: ");
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        if(num1 > num2){
            System.out.println(num1 + " is greater");
        }
        else{
            System.out.println(num2 + " is greater");
        }
    }
}