package com.company;

public class Main {

    public static void main(String[] args) {
	long n = 567;
        System.out.println("Sum = " + sumDigits(n));
    }

    public static int sumDigits(long n)
    {
        int sum = (int) (n/100 + ((n % 100) / 10) + n % 10);
        return sum;
    }
}
