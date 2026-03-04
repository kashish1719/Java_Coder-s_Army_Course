public class array2D {
    public static void main(String[] args) {
        int[][] marks = new int[3][3];
        // 101, 102, 103
        marks[0][0] = 22;
        marks[0][1] = 25;
        marks[0][2] = 45;

        marks[1][0] = 34;
        marks[1][1] = 11;
        marks[1][2] = 90;

        marks[2][0] = 56;
        marks[2][1] = 23;
        marks[2][2] = 78;

        /*
            int[][] marks = {
                {22, 25, 45},
                {34, 11, 90},
                {56, 23, 78}
            };
        */

        // 2-D using loops
        System.out.println("2 D array");
        for(int row = 0 ; row < marks.length; row++){
            for(int col = 0; col < marks.length; col++){
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }

        // Multi Dimensional array -> each with diff length
        int[][] mark = new int[3][]; // 3 rows
        
        mark[0] = new int[1];
        mark[1] = new int[2];
        mark[2] = new int[3];

        mark[0][0] = 23;
        mark[1][0] = 24;
        mark[1][1] = 90;
        mark[2][0] = 12;
        mark[2][1] = 78;
        mark[2][2] = 45;

        /*
            [23]
            [24] [90]
            [12] [78] [45]
        */

        System.out.println("Multi Dimensional each with different length");
        for(int row = 0 ; row < mark.length; row++){
            for(int col = 0; col < mark[row].length; col++){
                System.out.print(mark[row][col] + " ");
            }
            System.out.println();
        }
    }
}
