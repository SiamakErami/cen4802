public class Fibonacci {
    public static int recursive(int n){
        if (n <= 0){
            throw new IllegalArgumentException("n must be a positive integer.");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return recursive(n - 1) + recursive(n - 2);
    }

    public static void main(String[] args){
        int n = 10;

        try{
            int nthTerm = recursive(n);
            System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
