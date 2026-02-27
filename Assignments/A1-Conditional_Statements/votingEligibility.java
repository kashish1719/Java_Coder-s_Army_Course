import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class votingEligibility {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter age to check eligible or not for voting: ");
        int num = Integer.parseInt(br.readLine());
        if(num >= 18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
