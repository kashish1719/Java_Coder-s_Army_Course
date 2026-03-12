public class StringsArgs {
    public static void main(String[] args) {
        System.out.println("Numbers of arguments are: " + args.length);

        for(int i = 0; i < args.length; i++){
            System.out.println("Argument " + i + " = " + args[i]);
        }

        /*
            Strings args is useful for old code but now for Springboot
            java Demo5 input.txt output.txt            // old code
            java Demo5 --run         // Springboot - used for giving configuration internally
        */
    }
}
