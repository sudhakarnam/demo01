package session01;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatTest {
public static void main(String[] args) {
	
	NumberFormat format =NumberFormat.getCurrencyInstance(Locale.ENGLISH);
	format.setCurrency(Currency.getInstance("INR"));
	format.setMaximumFractionDigits(3);
	format.setMaximumIntegerDigits(5);
	format.setMinimumIntegerDigits(0);
	System.out.println(format.format(56.5845845));
	format.setCurrency(Currency.getInstance("USD"));
	System.out.println(format.getRoundingMode().getDeclaringClass());
	
}
}
