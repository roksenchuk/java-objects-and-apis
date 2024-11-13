package exceptions;

public class ThrowingExceptions {

    public static double calculatePay(double hours, double payRate) {
        if (hours > 40) {
            throw new IllegalArgumentException("Hours exceeds 40");
        }
        return hours * payRate;
    }
}
