package Stepik._3_OOP;

import java.util.Objects;

public final class complexNumber {
    private final double re;
    private final double im;

    public complexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        complexNumber that = (complexNumber) o;
        return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}