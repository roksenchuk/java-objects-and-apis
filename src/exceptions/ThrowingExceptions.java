package exceptions;

public class ThrowingExceptions {

    public static double calculatePay(double hours, double payRate) throws NegativeInputException {
        if (hours > 40) {
            throw new IllegalArgumentException("Hours exceeds 40");
        }
        if (hours < 0) {
            throw new NegativeInputException();
        }
        return hours * payRate;
    }
}
