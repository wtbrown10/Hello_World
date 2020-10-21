package com.will;

public class Main {

    public static void main(String[] args) {
	// calls method
        String message = greetUser("Will", "brown");
        System.out.println(message);



    }
    //access modifier
    // 1. this way concats multiple strings and prints it to the terminal
//    public static void greetUser(String firstName, String lastName) {
//        System.out.println("Hello " + firstName + " " + lastName);
//    }
    // 2. this way returns a string
    public static String greetUser(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }
}
