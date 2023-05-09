public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(9));
        
    }

    private static int factorial(int num) {
        if (num < 1) // base case
            return 1;
        return num * factorial(num - 1); //recursive case
    }
}