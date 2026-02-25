public class ControlFlow{
    public static void main(String[] args) {
        // Control Flow -> Selection Conditional / Decision Making (if, if-else, nested-if, if-else-if ladder, switch)
        //              -> Iteration / Looping (while, do-while, for)
        //              -> Jump statements / Control transfer (break, continue, return)

        // Selection / Conditional
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

    }
}