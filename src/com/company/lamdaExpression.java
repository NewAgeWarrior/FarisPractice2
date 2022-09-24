package com.company;

interface lamdaExpressionInterface{

    String add(String str);

}
public class lamdaExpression {

    public static void main(String[] args){

        lamdaExpressionInterface firstLamdaFunction = (s) -> s + " Shaikh"; //(s) -> s is an lamba expression

        addExpressionToLamda("Faris",firstLamdaFunction); //Creating Fucntion for adding


    }

    public static void addExpressionToLamda(String str, lamdaExpressionInterface value){

        String result = value.add(str);
        System.out.println("Printing Out Result:"+ result);
    }
}
