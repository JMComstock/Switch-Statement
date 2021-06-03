package com.company;

import java.util.Locale;

public class Main {

   public static void main(String[] args) {
// 	    int value = 3;
//	    if (value ==1) {
//            System.out.println("Value was 1");
//        }
//	    else if(value == 2) {
//            System.out.println("Value was 2");
//        }
//	    else {
//            System.out.println("Was not 1 or 2");
//        }

	    int switchValue = 3;

	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        char switchValueChar = 'J';

	    switch (switchValueChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The char value was " + switchValueChar);
                break;
            default:
                System.out.println("The char value wasn't in the list");
                break;
        }

        String month = "January";
	    switch (month.toLowerCase()) {
            case "january":
                System.out.println("January was found");
                break;
            case "june":
                System.out.println("June was found");
                break;
            default:
            System.out.println("Not sure");
        }
    }
}
