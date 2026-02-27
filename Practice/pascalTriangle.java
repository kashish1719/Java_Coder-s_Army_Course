public class pascalTriangle {
    public static void main(String[] args) {
        int num = 5;
        for(int i = 0; i < num; i++){
            // number
            int value = 1;
            for(int k = 0; k <= i; k++){
                System.out.print(value + " ");
                value = value * (i - k)/(k + 1);
            }
            System.out.println();
        }
    }
}
