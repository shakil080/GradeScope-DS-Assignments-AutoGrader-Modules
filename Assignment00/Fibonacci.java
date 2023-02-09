package assignment;

public class Fibonacci {

    public static int fibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        // while(true){
        //     number++;
        // }
    
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
    
}
