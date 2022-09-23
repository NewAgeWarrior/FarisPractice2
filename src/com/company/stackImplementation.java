package com.company;

import java.util.Scanner;
import java.util.Stack;

public class stackImplementation {

    public static void main(String[] args){
        Stack<String> stackElement = new Stack<String>();
        stackElement.push("CAR");
        stackElement.push("TOYS");
        stackElement.push("BAT");
        stackElement.push("BALL");
        stackElement.push("GLOVES");
        System.out.println(stackElement);

        System.out.println("Please select which function you want to perform:");


        //adding elements is stack using function
        addStackElement(stackElement);

        //poping Element from stack using function
        popStackElement(stackElement);

    }

    public static void addStackElement(Stack<String> a){
        Scanner input = new Scanner(System.in);  // Create a Scanner class object
        System.out.println("Enter List Elements");

        String s;


        String elementsToInput = input.nextLine();  // Read the user input
        System.out.println("Enter the limit of elements you want to push in stack: " + elementsToInput);

        int b= Integer.parseInt(elementsToInput);


        for(int i=1;i<=b;i++){

            s= input.nextLine();
            a.push(s);
            System.out.println(a);
        }
        System.out.println("Stack is:"+a);
    }

    public static void popStackElement(Stack<String> a){

        Scanner input = new Scanner(System.in);  // Create a Scanner class object
        System.out.println("Enter Elements you want to pop");






        String elementsToInput = input.nextLine();  // Read the user input

//        System.out.println("Enter the limit of elements you want to push in stack: " + elementsToInput);

        int b= Integer.parseInt(elementsToInput);


        for(int i=1;i<=b;i++){

            System.out.println(a.pop());

        }
        System.out.println("Stack after poped Elements are:"+a);
    }
}
