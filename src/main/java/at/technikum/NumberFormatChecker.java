package at.technikum;


import java.util.Locale;

public class NumberFormatChecker {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf(Locale.US, "%f", pi);
    }
}
