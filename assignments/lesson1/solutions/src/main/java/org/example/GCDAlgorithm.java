package org.example;

public class GCDAlgorithm {
    public static int findGCD(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println("GCD of 12 and 8: " + findGCD(12, 8));
    }
}


