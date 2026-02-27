public class invertedPyramid {
    public static void main(String[] args) {
        int num = 5;
        for(int i = 0; i < num; i++){
            // space
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            // star
            for(int k = 0; k < num-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
