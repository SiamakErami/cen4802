/**
* The Fibonacci class has methods for calculating the Fibonacci numbers
*/
public class Fibonacci {
    /**
    * Calculates the nth term in the sequence using recursion
    * @param n the position in the sequence to be calculated 
    * @return the nth term in the sequence
    * @throws IllegalArgumentException if n is negative
    */
    public static int recursive(int n){
        if (n <= 0){
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        //The first two numbers in the sequence both return 1
        if (n == 1 || n == 2) {
            return 1;
        }
        //Calculate the nth term recursively
        return recursive(n - 1) + recursive(n - 2);
    }

    /**
    * The main method calculates and displays the nth term in the sequence
    */
    public static void main(String[] args){
        //Specifies the psotion in the sequence 
        int n = 10;

        try{
            int nthTerm = recursive(n);
            //Displays to user
            System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
