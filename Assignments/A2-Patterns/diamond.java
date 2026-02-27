public class diamond {
    public static void main(String[] args) {
        int num = 5;
        // upper traingle
        for(int i = 0; i < num; i++){
            // space
            for(int j = 0; j < num-i-1; j++){
                System.out.print(" ");
            }
            // star
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // lower triangle
        for(int i = 0; i < num-1; i++){
            // space
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            // star
            for(int k = 0; k < num-i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
