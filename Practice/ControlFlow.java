public class ControlFlow{
    public static void main(String[] args) {
        // Control Flow -> Selection Conditional / Decision Making (if, if-else, nested-if, if-else-if ladder, switch)
        //              -> Iteration / Looping (while, do-while, for)
        //              -> Jump statements / Control transfer (break, continue, return)

        // Selection / Conditional - if, if-else, nested-if,  if-else-if ladder, switch case
        boolean b = true;
        // normal if
        System.out.println("Normal if");
        if(b == true){
            System.out.println("True");
        }
        // if-else
        System.out.println("\nif else");
        if(b == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        int i = 6;
        // nested if
        System.out.println("\nnested if");
        if(i > 5){
            if(i < 10){
                System.out.println(i + " is more than 5 and less than 10");
            }
            else{
                System.out.println(i + " is more than 5 and also more or equal to 10");
            }
        }
        else{
            System.out.println(i + " is less than or equal to 5");
        }

        // if-else-if ladder
        System.out.println("\nif-else-if ladder");
        if(i > 0){
            System.out.println("Positive number");
        }
        else if (i < 0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Number is Zero");
        }

        // switch case
        int day = 5;
        System.out.println("\nSwitch case");

        /* old java version switch
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
        */

        // new java 14+ switch syntax using rule switch
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Day");
        }


        // Iteration / Looping - while , do-while, for
        int num = 1;
        // While loop --> Entry control loop
        System.out.println("\nWhile Loop");
        // condition - boolean True or False
        while (num <= 10) {
            System.out.print(num + " ");
            // increement / decreement
            num++;
        }

        int num2 = 0;
        // do-while loop --> Exit control loop
        System.out.println("\ndo-while Loop");
        do{
            System.out.print(num2 + " ");
            // increement / decreement
            num2 += 2;
        } while (num2 <= 10);
        // condition - boolean True or False
        // for menu item selection - do-while
        /*
            1. Play Game
            2. Return saved Game
            3. Exit
        */

        
        // for while
        System.out.println("\nfor Loop");
        // for(initialization; condition; increement/decreement)
        for(int j = 1; j <= 10; j++){
            // do something
            System.out.print(j + " ");
        }

        // -------------- variation in loops --------------
        // infinite loop
        /*
            int i = 5;
            while(i < 10){
            
            }
            System.out.println(i);


            for(int i = 1; i < 10; ){
                System.out.println(i);
            }


            int j = 1;
            for(; j < 10; ){
                System.out.println(j);
            }
        
            for(;;){
                System.out.println(j);
            }
        */

        // --------------- Comma separated variations -------------
        /*
        // condition --> can be logical operator - &&  || not comma (,)
            for(int i = 1, j = 1; i <= 10; i++, j++){
                System.out.println(i * j);
            }
        */

        /*
            boolean b = true;
            for(int i = 1; b == true; i++){
                if(condition){
                    b = false;
                }
            }
        */

        /*
            Integers --> byte, short, int, long
            even if i declare byte / short by default it will be type promoted to int , so it is preferrable to take int
            for(byte i = 1; i < 10; ){
                System.out.println(i);
            }
        */

        // Nested loop
        System.out.println("\nNested Loop");
        for(int k = 1; k <= 5; k++){
            for(int j = 2; j <= 10; j += 2){
                System.out.println(k + " , " + j);
            }
            System.out.println();
        }

        // Printing Pattern
        /*
            *
            * *
            * * *
            * * * *
            * * * * *
        */
    // outer loop for number of lines
    for(int l = 1; l <= 5; l++){
        // inner loop for what to print on each line
        for(int m = 1; m <= l; m++){
            System.out.print("* ");
        }
        System.out.println();
    }

    // Jump statements - break, continue
    System.out.println("\nBreak & Continue");
    for(int n = 1; n <= 10; n++){
        if(n == 5){
            continue;
        }
        System.out.println(n);
        if(n > 7){
            break;
        }
    }

    // Label
    System.out.println("Label for break / continue");
    outer: for(int o = 1; o <= 10; o++){
        inner: for(int p = 1; p <= o; p++){
            System.out.print("* ");
            if(p >= 5){
                break outer;
                // continue outer;
            }
        }
        System.out.println();
    }

    // code block
    first: {
        second: {
            third: {
                System.out.println("Hello, code Blocks");
                break first;
            }
        }
    }

    }
}