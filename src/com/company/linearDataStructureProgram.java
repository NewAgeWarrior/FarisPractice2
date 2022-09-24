package com.company;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Scanner;

public class linearDataStructureProgram {

    public static void main(String[] args){

        //Creating a linked list.
        LinkedList<String> list1= new LinkedList<String>();

        list1.add("CAR");
        list1.add("TOYS");
        list1.add("BAT");
        list1.add("BALL");
        list1.add("GLOVES");
        list1.add("BAT");

        //Printing the list.
        System.out.println("Printing out the list"+list1);

        //removing the element from the list using function
        removeListElement(list1);

        //Adding the elements to the linked list using function
        addListElement(list1);
        System.out.println("List after adding is:"+list1);

        //Setting elements using function
        setListElements(list1);
    }


    //Removing Element form the list function program
    public static void removeListElement(LinkedList<String> a){

        String firstRemove = String.valueOf(a.remove("BALL"));
        System.out.println("The String after First remove is:"+firstRemove);
        String secondRemove = a.remove(4);
        System.out.println("The String after Second remove is:"+secondRemove);
        String thirdRemove = String.valueOf(a.removeFirstOccurrence("BAT"));
        System.out.println("The string after Third remove is"+thirdRemove);


    }

    //Adding element to the list program
    public static void addListElement(LinkedList<String> a){

        Scanner input = new Scanner(System.in);  // Create a Scanner class object
        System.out.println("Enter List Elements");

        String s = null;


        String elementsToInput = input.nextLine();  // Read the user input
        System.out.println("Enter the limit of elements you want to input: " + elementsToInput);

        int b= Integer.parseInt(elementsToInput);


        for(int i=1;i<=b;i++){

           s= input.nextLine();
           a.add(s);
        }
        System.out.println("Linked list is:"+a);



    }

    //Changing CAR element to BMW using Set function.
    public static void setListElements(LinkedList<String> a){

        a.set(0,"BMW");
        System.out.println("After Change Linked list is"+a);
    }



}
