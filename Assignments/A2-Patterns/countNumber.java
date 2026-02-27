public class countNumber {
    public static void main(String[] args) {
        int num = 4, count = 1;
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}