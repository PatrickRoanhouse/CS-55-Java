// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(){
        numerator = 1;
        denominator = 1;
    }

    public Rational(int num, int denom){
        numerator = num;
        denominator = denom;
    }

    public Rational(Rational r2){
        numerator = r2.getNumerator();
        denominator = r2.getDenominator();
    }

    //These functions return a new Rational for the solution, they don't change of the inputs

    public Rational reduce(){
        Rational reduced = new Rational(this);
        int x = numerator < denominator ? numerator : denominator;

        for(int i = x; i >= 1; i--){
            if((numerator % i == 0) && (denominator % i == 0)){
                reduced.setNumerator(numerator/i);
                reduced.setDenominator(denominator/i);
                break;
            }
        }
        return reduced;
    }

    public Rational inverse(){
        Rational inverted = new Rational(this);
        int num = numerator;
        int denom = denominator;
        inverted.setNumerator(denom);
        inverted.setDenominator(num);
        return inverted;
    }

    public Rational add(Rational r2) {
        Rational r3 = new Rational();
        int num = (this.getNumerator() * r2.getDenominator()) + (r2.getNumerator() * this.getDenominator());
        int denom = this.getDenominator() * r2.getDenominator();
        r3.setNumerator(num);
        r3.setDenominator(denom);
        r3 = r3.reduce();
        return r3;
    }

    public Rational sub(Rational r2){
        Rational r3;
        r3 = new Rational(r2);
        r3.setNumerator(r3.getNumerator() * -1);
        r3 = this.add(r3);
        return r3;
    }

    public Rational mult(Rational r2){
        Rational r3 = new Rational();
        int num = this.getNumerator() * r2.getNumerator();
        int denom = this.getDenominator() * r2.getDenominator();
        r3.setNumerator(num);
        r3.setDenominator(denom);
        r3 = r3.reduce();
        return r3;
    }

    public Rational divide(Rational r2){
        Rational r3 = r2.inverse();
        r3 = r3.mult(this);
        return r3;
    }

    public int compare(Rational r2){
        if((this.getNumerator() * r2.getDenominator()) > (r2.getNumerator() * this.getDenominator())){
            return 1;
        }else if((this.getNumerator() * r2.getDenominator()) < (r2.getNumerator() * this.getDenominator())){
            return -1;
        }else{
            return 0;
        }
    }

    public String toString(){
        return numerator + "/" + denominator;
    }

    public int getNumerator(){ return numerator; }
    public int getDenominator(){ return denominator; }
    public void setNumerator(int n){ numerator = n; }
    public void setDenominator(int n){ denominator = n; }
}
