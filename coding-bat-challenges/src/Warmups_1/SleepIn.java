package Warmups_1;

 /*The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


        sleepIn(false, false) → true
        sleepIn(true, false) → false
        sleepIn(false, true) → true*/

public class SleepIn {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }


    public static void main(String[] args) {
        System.out.println("It\'s Tuesday and you\'re not on vacation. You\'re sleeping in: " + sleepIn(true, false));
        System.out.println("It\'s Wednesday and you\'re on vacation. You\'re sleeping in: " +sleepIn(true,true));
    }
}

