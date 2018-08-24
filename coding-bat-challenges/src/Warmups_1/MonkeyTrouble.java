package Warmups_1;

/*We have two monkeys, a and b, and the parameters aSmile and bSmile
indicate if each is smiling. We are in trouble if they are both smiling
or if neither of them is smiling. Return true if we are in trouble.

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false */

public class MonkeyTrouble {
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || !aSmile && !bSmile;
    }

    public static void main(String[] args) {
        System.out.println("Both monkeys are smiling. Now you\'re in trouble: " + monkeyTrouble(true,true));
        System.out.println("One monkey is smiling. Now you\'re in trouble: " + monkeyTrouble(false,true));
    }

}
