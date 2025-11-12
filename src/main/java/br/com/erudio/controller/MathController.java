package br.com.erudio.controller;

import br.com.erudio.Math.SimpleMath;
import br.com.erudio.exception.UnsupportedMathOperationException;
import br.com.erudio.util.ConverterToValidate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    SimpleMath math = new SimpleMath();

    @RequestMapping("/sum/{number01}/{number02}")
    public Double sum(@PathVariable String number01,
                      @PathVariable String number02) throws Exception{

            if (!ConverterToValidate.isNumeric(number01) ||
                    !ConverterToValidate.isNumeric(number02))  {
                throw new UnsupportedMathOperationException("This is not a number");
            }
            return math.sum(ConverterToValidate.convertToDouble(number01), ConverterToValidate.convertToDouble(number02));
    }

    @RequestMapping("/subtraction/{number01}/{number02}")
    public Double subtraction(@PathVariable String number01,
                      @PathVariable String number02)  {
        if (!ConverterToValidate.isNumeric(number01) || !ConverterToValidate.isNumeric(number02))  {
            throw new UnsupportedMathOperationException("This is not a number");
        }
        return math.subtraction(ConverterToValidate.convertToDouble(number01), ConverterToValidate.convertToDouble(number02));
    }

    @RequestMapping("/multiplication/{number01}/{number02}")
    public Double multiplication(@PathVariable String number01,
                      @PathVariable String number02)  {
        if (!ConverterToValidate.isNumeric(number01) || !ConverterToValidate.isNumeric(number02))  {
            throw new UnsupportedMathOperationException("This is not a number");
        }
        return math.multiplication(ConverterToValidate.convertToDouble(number01), ConverterToValidate.convertToDouble(number02));
    }

    @RequestMapping("/division/{number01}/{number02}")
    public Double division(@PathVariable String number01,
                                 @PathVariable String number02) {
        if (!ConverterToValidate.isNumeric(number01) || !ConverterToValidate.isNumeric(number02))  {
            throw new UnsupportedMathOperationException("This is not a number");
        }
        return math.division(ConverterToValidate.convertToDouble(number01), ConverterToValidate.convertToDouble(number02));
    }

    @RequestMapping("/average/{number01}/{number02}")
    public Double average(@PathVariable String number01,
                          @PathVariable String number02)   {
        if (!ConverterToValidate.isNumeric(number01) || !ConverterToValidate.isNumeric(number02))  {
            throw new UnsupportedMathOperationException("This is not a number");
        }
        return math.average(ConverterToValidate.convertToDouble(number01), ConverterToValidate.convertToDouble(number02));
    }

    @RequestMapping("/rootSquare/{number}")
    public Double rootSquare(@PathVariable String number)  {
        if (!ConverterToValidate.isNumeric(number))  {
            throw new UnsupportedMathOperationException("This is not a number");
        }
        return math.rootSquare(ConverterToValidate.convertToDouble(number));
    }







}
