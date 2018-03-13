/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

public class Fraction {
    private int numerator;
    private int denominator;
    
    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    public String toString(){
        String s = numerator + "/" + denominator;
        return s;
    }
    public void add(Fraction fraction){
        this.numerator = (this.numerator*fraction.denominator)+(this.denominator*fraction.numerator);
        this.denominator = fraction.denominator*this.denominator;
        reduce();
    }
    public void sub(Fraction fraction){
        this.numerator += (this.numerator*fraction.denominator) - (this.denominator*fraction.numerator);
        this.denominator+= fraction.denominator*this.denominator;
        reduce();
    }
    public void multiplication(Fraction fraction){
        this.numerator *= fraction.numerator;
        this.denominator *= fraction.denominator;
        reduce();
    }
    public void division(Fraction fraction){
        this.numerator *= fraction.denominator;
        this.denominator *= fraction.numerator;
        reduce();
    }
    
    private int gcd(int a, int b){
        if(b == 0)
            return a;
        else 
            return gcd(b, a%b);  
    }
    private void reduce(){
        int a = gcd(numerator, denominator);
        this.numerator = numerator/a;
        this.denominator = denominator/a;
    }    
}
