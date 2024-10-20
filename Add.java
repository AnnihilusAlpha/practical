public class Add {
 
    public static void main(String[] args) {
        // Check if two arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide two integer arguments.");
            return;
        }
 
        // Parse the command-line arguments
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
 
        // Add the two numbers
        int sum = first + second;
 
        // Print the result
        System.out.println(first + " + " + second + " = " + sum);
    }
}