import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class largest3Number{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three integers: ");
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        if(num1 > num2 && num1 > num3){
            System.out.println("Largest number is " + num1);
        }
        else if(num2 > num3 && num2 > num1){
            System.out.println("Largest number is " + num2);
        }
        else{
            System.out.println("Largest number is " + num3);
        }
    }
}