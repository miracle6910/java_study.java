package Stepik._3_OOP;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    public static void main(String[] args) {
        byte [] b = {15,127,66};
        AsciiCharSequence asci = new AsciiCharSequence(b);
        asci.subSequence(1,10);
        System.out.println(asci);
    }
    private byte[] charSequence;

    AsciiCharSequence(byte[] byteSequence) {
        charSequence = byteSequence;
    }

    @Override
    public int length() {
        return charSequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char) charSequence[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(charSequence, start, end));
    }

    @Override
    public String toString() {
        return new String(charSequence);
    }
}