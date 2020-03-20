package com.revolutionit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //myBasicMethod();
        //myLoopMethods("Honda");
        //myCaseMethod();
        //Arrays2D.myMethod();
        my2DArrayMethod();

        int result1 = overloadMethod(5,9);
        double result2 = overloadMethod(4.7,7.4);
        System.out.println("The int result is: " + result1 + "\n" + "The double results is: " + result2);


/*  ==============================
    Needs to be looked into:
        int test1 = 20;
        test1 &= 4;
        test1 |= 4;
        test1 ^| 4;
        test1 >>= 4;
        test1 <<= 4;
        System.out.println(test1);
    ==============================  */

    }

    static int overloadMethod(int a, int b) {
        return a + b;
    }

    static double overloadMethod(double a, double b) {
        return a + b;
    }

    static void my2DArrayMethod() {
        int[][] myNumbers = { {1,2,3,4}, {5,6,7} };
        for (int count1=0; count1 < myNumbers.length; ++count1) {
            for (int count2=0; count2 < myNumbers[count1].length; ++count2) {
                System.out.println(myNumbers[count1][count2]);
            }
        }
    }

    static void myLoopMethods(String carName) {
        //  ==============================
    //  If else statements
        int timeHour =14;

        //Scanner myObj = new Scanner(System.in);
        //System.out.println("What is the time?");
        //String timeHour = myObj.nextLine();

        if (timeHour%24 < 12) {
            System.out.println("Good Morning!");
        }
        else if (timeHour%24 < 20) {
            System.out.println("Good Day!");
        }
        else {
            System.out.println("Good Evening!");
        }


        if (timeHour%24 < 12) {
            System.out.println("Easy Morning! ");
        }
        else {
            System.out.println("Easy Afternoon!");
        }

        String result = (timeHour%24 < 12) ? "Morning!" : "Evening!";
        System.out.println(result);

        //  =======================================
        //  Do while loops & For-Each loops & break/continue
        /*
        int i=0;

        while (i<5) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i++;
        }
        while (i<5);
        */
        String[] cars = {"Volvo", "BMW", "Honda", "Mercedes", "Ford", "Holden"};
        for (String carList : cars) {
            if (carList == carName) {
                continue;     // output is: Volvo BMW Mercedes Ford Holden
                //break;      // output is: Volvo BMW
            }
            System.out.println(carList);
        }
        /*
        for (int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }
        */
    }

    static void myCaseMethod() {
        //  ======================================
        //  Switch, cases and break

        int day=14;
        switch (day%3) {
            case 6:
                System.out.println("It's Saturday today!");
                break;
            case 0:
                System.out.println("It's Sunday today!");
                break;
            default:
                System.out.println("I hope the weekend comes soon!");
        }
    }
    static void myBasicMethod() {
        String name = "Simon";
        String company = "Revolution IT";
        System.out.println("Hello IntelliJ IDEA. This is "+ name +" from " + company + ".");
        String myText = "Hello, this is a test message of a Java string type.";

        int x=5; int y=6; int z=7;
        int total = x + y + z;
        System.out.print("The values are: " + x + y + z + "\n");
        System.out.print("The total is: " + total + "\n");
        System.out.print(x + y + z + "\n");


        float myFloatNum = 89.12345f;
        float myFloatExp = 420E7f;
        double myDouble = 90.12345678901234d;
        double myDoubleExp = 024E14d;
        long myLong = 1234567890123456789L;
        char myLetter = 'D';
        char asciiA = 0x41;
        char asciiB = 0x42;
        boolean myBool = true;


        System.out.println(myFloatNum + "\n" + myText);
        System.out.println(myFloatExp);
        System.out.println(myDouble);
        System.out.println(myDoubleExp);
        System.out.println(myLong);
        System.out.println(myLetter);
        System.out.println(asciiA);
        System.out.println(asciiB);
        System.out.println(myBool);

        System.out.println("The length of the string is: " + myText.length());
        System.out.println("The string in upper case is: " + myText.toUpperCase());
        System.out.println("The string in lower case is: " + myText.toLowerCase());
        System.out.println("The position of the word 'Java' in the above string is: " + myText.indexOf("Java")); // You need to be specific for the index (case sensitive)
        System.out.println(name.concat(company));
        System.out.println("You\'ll need to use the escape character \"\\\" (also known as backslash) to use special characters like: \' or \" or \\.");
    }
}

