package br.com.erudio.Math;

public class SimpleMath {

    public Double sum (Double number01, Double number02) {
        return number01 + number02;
    }

    public Double subtraction (Double number01, Double number02) {
        return number01 - number02;
    }

    public Double multiplication (Double number01, Double number02) {
        return number01 * number02;
    }

    public Double division (Double number01, Double number02) {
        return number01 / number02;
    }

    public Double average (Double number01, Double number02) {
        return (number01 + number02) / 2;
    }

    public Double rootSquare (Double number) {
        return Math.sqrt(number);
    }
}
