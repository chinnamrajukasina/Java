package exception_handling;

public class CustomException {

    public static void main(String[] args) {
        try {
            // Simulate a condition that triggers the custom exception
            int age = 15;
            if (age < 18) {
                System.out.printf("You have to wait for %d years\n", 18 - age);
                throw new MyCustomException("Age is below 18. You cannot proceed.");
            }

            // Other code that follows if the condition is met
            System.out.println("You are eligible.");
        } catch (MyCustomException e) {
            // Catch and handle the custom exception
            System.err.println("Custom Exception: " + e.getMessage());
        }
    }
}

// Custom exception class that extends Exception
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}
