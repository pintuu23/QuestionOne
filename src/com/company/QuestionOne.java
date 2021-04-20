package com.company;

public class QuestionOne {



    public void findDivisibleBy18(int i, int j, int k) {

        int a, b, c;
        int count = 0;
        while (i<=j) {

            if (i % 18 == 0) {

                int same = i;
                a = same / 100;
                same = (same - (a * 100));
                b = same / 10;
                same = (same - (b * 10));
                c = same;

                int sum = a + b + c;
                if(sum==k & a!=b & b!=c & c!=a) {

                    System.out.println(i);
                    System.out.println("number is divisible by 18");

                    System.out.println("Finding Sum of three Numbers");

                    System.out.println("Sum of Numbers " + sum);
                    count++;

                }

            }

            i++;

        }
        System.out.println("Total Number Divisible by 18 Count :  " +count);

    }


}
