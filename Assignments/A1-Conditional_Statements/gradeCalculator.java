import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class gradeCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter marks to get grade: ");
        int mark = Integer.parseInt(br.readLine());
        if(mark >= 90){
            System.out.println("Grade A");
        }
        else if (mark >= 75){
            System.out.println("Grade B");
        }
        else if(mark >= 60){
            System.out.println("Grade C");
        }
        else if(mark >= 40){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
