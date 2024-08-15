package com.example;
public class Ratio {
    private int denominator;
    private int numerator;
    public Ratio(int den, int nume){
        this.denominator = den;
        this.numerator = nume;
    }

    /**約分*/
    protected Ratio getIrreducibleRatio() {
        int GCD = IntArrayListUtil.getGCDOf(denominator, numerator);
        int newDenominator = this.denominator / GCD;
        int newNumerator = this.numerator / GCD;
        if(newDenominator < 0) {
            return new Ratio(- newDenominator,- newNumerator);
        }else {
            return new Ratio(newDenominator,newNumerator);
        }
    }

    /**掛け算*/
    protected Ratio getProductRatio(Ratio ratio) {
        int multipliedDenominator = this.denominator * ratio.denominator;
        int multipliedNumerator = this.numerator * ratio.numerator;
        Ratio multipliedRatio = new Ratio(multipliedDenominator,multipliedNumerator);
        return multipliedRatio.getIrreducibleRatio();
    }
    /**足し算*/
    public Ratio getAddedRatio(Ratio ratio) {
        int addedDenominator = this.denominator * ratio.denominator;
        int firstNumerator = this.numerator * ratio.denominator;
        int secondNumerator = this.denominator * ratio.numerator;
        int addedNumerator = firstNumerator + secondNumerator;
        Ratio addedRatio = new Ratio(addedDenominator,addedNumerator);
        return addedRatio.getIrreducibleRatio();
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    @Override
    public boolean equals(Object o) {
        Ratio ratio = (Ratio) o;
        if(this.denominator == ratio.denominator && this.numerator == ratio.numerator) {
            return true;
        }else {
            return false;
        }
    }

    /**割り算*/
    protected Ratio divide (Ratio ratio) {
        int dividedDenominator = this.denominator * ratio.numerator;
        int dividedNumerator = this.numerator * ratio.denominator;
        Ratio dividedRatio = new Ratio(dividedDenominator,dividedNumerator);
        return dividedRatio.getIrreducibleRatio();
    }

    /**引き算*/
    protected Ratio minus (Ratio ratio) {
        int minusedDenominator = this.denominator * ratio.denominator;
        int firstNumerator = this.numerator * ratio.denominator;
        int secondNumerator = this.denominator * ratio.numerator;
        int minusedNumerator = firstNumerator - secondNumerator;
        Ratio minusedRatio = new Ratio(minusedDenominator,minusedNumerator);
        return minusedRatio.getIrreducibleRatio();
    }

}
