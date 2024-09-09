package org.example;

public class SleepIn {

    // Method to check if you can sleep in
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    // Main method to run the program
    public static void main(String[] args) {
        SleepIn app = new SleepIn();

        // Example usage
        boolean canSleepIn = app.sleepIn(false, true); // Example: It's not a weekday but you're on vacation
        System.out.println("Can sleep in: " + canSleepIn);
    }
}
