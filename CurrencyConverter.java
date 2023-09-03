package introS;
import java.text.DecimalFormat;

public class CurrencyConverter {
    public static void main(String[] args) {
        double exchangeRate = 75.0; // Assumed exchange rate: 1 USD = 75 INR
        double amountINR = 5000.0; // Amount in Indian Rupees

        double amountUSD = amountINR / exchangeRate;

        DecimalFormat decimalFormat = new DecimalFormat("#.##"); // Format the result to two decimal places
        String formattedAmountUSD = decimalFormat.format(amountUSD);

        System.out.println(amountINR + " INR is approximately equal to " + formattedAmountUSD + " USD");
    }
}
