package CodingChallenge;

import java.util.*;

class HelloTillStop { // use to demonstrate while-loop
    ScannerChallenge sc = new ScannerChallenge(System.in);

    // outputs hello while user wants to
    void showHello() {
        String choice; // guard variable

        System.out.println("For hello type h, anything else to stop");
        choice = sc.next(); // set guard variable
        while ("h".equals(choice)) { // check guard
            System.out.println("Hello");
            choice = sc.next(); // update guard variable
        }
    }

    public static void main(String[] args) {
        HelloTillStop hello = new HelloTillStop();
        hello.showHello();
    }
}