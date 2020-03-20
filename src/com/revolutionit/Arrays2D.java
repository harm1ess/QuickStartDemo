package com.revolutionit;

public class Arrays2D {

    static void myMethod() {
        int[][] myNumbers = { {1,2,3,4}, {5,6,7} };
        for (int count1=0; count1 < myNumbers.length; ++count1) {
            for (int count2=0; count2 < myNumbers[count1].length; ++count2) {
                System.out.println(myNumbers[count1][count2]);
            }
        }
    }
}
