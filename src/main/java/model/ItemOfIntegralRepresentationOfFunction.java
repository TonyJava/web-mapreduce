package model;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.util.CombinatoricsUtils;

/**
 * Created by Irina Kazantseva on 04.10.2017.
 */
public class ItemOfIntegralRepresentationOfFunction implements UnivariateFunction {
    private int k;
    private double p; //угол фи
    private double t;
    private double y;
    private int number;
    private double calc;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getCalc() {
        return calc;
    }

    public void setCalc(double calc) {
        this.calc = calc;
    }

    public ItemOfIntegralRepresentationOfFunction(int k, double p, double t, double y, int number) {
        this.k = k;
        this.p = p;
        this.t = t;
        this.y = y;
        this.number = number;
    }
    public ItemOfIntegralRepresentationOfFunction(int k,  double t, double y) {
        this.k = k;
        this.t = t;
        this.y = y;
    }

    public void calculateCurrentItem(){
        calc =  (Math.cos((2*k+1)*p)/Math.cos(p))*Math.cos((t*y/2)*Math.tan(p));
        if(number == 2){
            calc = 4*calc;
        }
    }

    @Override
    public double value(double v) {
        return (Math.cos((2*k+1)*v)/Math.cos(v))*Math.cos((t*y/2)*Math.tan(v));
    }
}