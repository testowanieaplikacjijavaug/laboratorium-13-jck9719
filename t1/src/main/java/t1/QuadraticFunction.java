package t1;

import java.io.Serializable;

public final class QuadraticFunction {

    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public void calc() {
        final double delta = (b * b) - (4 * a * c);
        if (delta > 0) {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);

        }
        else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
        }
        else {
            throw new IllegalArgumentException("No real solution for these parameters");
        }
    }



}
