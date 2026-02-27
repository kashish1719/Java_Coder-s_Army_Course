public class pyramid {
    public static void main(String[] args) {
        int num = 5;
        for(int i = 0; i < num; i++){
            // space
            for(int j = 0; j < num-i; j++){
                System.out.print(" ");
            }
            // star
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
