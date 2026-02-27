public class floydTriangle {
    public static void main(String[] args) {
        int num = 5, count = 1;
        for(int i = 0; i < num; i++){
            for(int k = 0; k <= i; k++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
