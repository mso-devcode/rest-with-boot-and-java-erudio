package br.com.erudio.controller;

import br.com.erudio.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{number01}/{number02}")
    public Double sum(@PathVariable String number01,
                      @PathVariable String number02)  throws IllegalArgumentException {
            if (!isNumeric(number01) || !isNumeric(number02))  {
                throw new IllegalArgumentException("This is not a number");
            }
            return convertToDouble(number01) + convertToDouble(number02);
    }

    @RequestMapping("/subtraction/{number01}/{number02}")
    public Double subtraction(@PathVariable String number01,
                      @PathVariable String number02)  throws IllegalArgumentException {
        if (!isNumeric(number01) || !isNumeric(number02))  {
            throw new IllegalArgumentException("This is not a number");
        }
        return convertToDouble(number01) - convertToDouble(number02);
    }

    @RequestMapping("/multiplication/{number01}/{number02}")
    public Double multiplication(@PathVariable String number01,
                      @PathVariable String number02)  throws IllegalArgumentException {
        if (!isNumeric(number01) || !isNumeric(number02))  {
            throw new IllegalArgumentException("This is not a number");
        }
        return convertToDouble(number01) * convertToDouble(number02);
    }

    @RequestMapping("/division/{number01}/{number02}")
    public Double division(@PathVariable String number01,
                                 @PathVariable String number02)  throws IllegalArgumentException {
        if (!isNumeric(number01) || !isNumeric(number02))  {
            throw new IllegalArgumentException("This is not a number");
        }
        return convertToDouble(number01) / convertToDouble(number02);
    }

    @RequestMapping("/average/{number01}/{number02}")
    public Double average(@PathVariable String number01,
                          @PathVariable String number02)  throws IllegalArgumentException {
        if (!isNumeric(number01) || !isNumeric(number02))  {
            throw new IllegalArgumentException("This is not a number");
        }
        return (convertToDouble(number01) + convertToDouble(number02))/ 2;
    }

    @RequestMapping("/rootSquare/{number}")
    public Double rootSquare(@PathVariable String number) throws IllegalArgumentException {
        if (!isNumeric(number))  {
            throw new UnsupportedMathOperationException("This is not a number");
        }
        return Math.sqrt(Double.parseDouble(number));
    }




    private Double convertToDouble(String strNumber) throws IllegalArgumentException{
        if (strNumber == null || strNumber.isEmpty()) {
            throw new UnsupportedMathOperationException("This is not a number");
        }
        String number = strNumber.replace(",", ".");
        return Double.parseDouble(number);
    }

    private Boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) {
            return false;
        }
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }


}
