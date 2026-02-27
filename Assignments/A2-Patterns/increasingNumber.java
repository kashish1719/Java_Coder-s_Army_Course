public class increasingNumber {
    public static void main(String[] args) {
        int num = 4;
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}