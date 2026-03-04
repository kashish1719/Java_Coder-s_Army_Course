public class array1D {
    public static void main(String[] args) {
        int[] rollNums = new int[3];
        // 101, 102, 103
        rollNums[0] = 101;
        rollNums[1] = 102;
        rollNums[2] = 103;

        // int[] rollNums = {101, 102, 103};

        System.out.println(rollNums[0]);
        System.out.println(rollNums[1]);
        System.out.println(rollNums[2]);

        // 1-D using loops
        int x = 101;
        for(int i = 0 ; i < rollNums.length; i++){
            rollNums[i] = x;
            System.out.print(rollNums[i] + " ");
            x++;
        }
    }
}
