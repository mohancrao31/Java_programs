package com.udemycourse;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double realnumber, double imaginarynumber){
        this.imaginary = imaginarynumber;
        this.real = realnumber;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }



    public void add(ComplexNumber number2){
        add(number2.getReal(),number2.getImaginary());
    }

    public void add(double real, double imaginary){
        double realnumbersum = getReal()+real;
        double imaginarysum = getImaginary() + imaginary;
        this.real = real+getReal();
        this.imaginary = imaginary + getImaginary();

    }

    public void subtract(double real, double imaginarynumber){
        double realnumbersum = -real + getReal();
        double imaginarysum = -imaginarynumber + getImaginary();
        this.real = realnumbersum;
        this.imaginary = imaginarysum;
    }

    public void subtract(ComplexNumber complexNumber){
        subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }

}
