package br.com.erudio.util;

import br.com.erudio.exception.UnsupportedMathOperationException;

public class ConverterToValidate {

    public static Double convertToDouble(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) {
            throw new UnsupportedMathOperationException("This is not a number");
        }
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    public static Boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) {
            return false;
        }
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
