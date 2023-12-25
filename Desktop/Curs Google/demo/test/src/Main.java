package org.example;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void addNewLine(){
        System.out.println();
    }

    //* * * * *
    //*       *
    //*       *
    //*       *
    //* * * * *
    public static void printHallowPattern(int n){
        //***
        //***
        //***
        for(int i =1; i<=n; i++, addNewLine()){
            for(int j=1 ;j<=n; j++){
                if(i == 1 || j == 1 || i == n || j == n){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
        }
    }

    public static void printHallowPattern2(int n){
        for(int i =1; i<=n; i++, addNewLine()){
            if ( i ==1 || i==n){
                printLine(n);
            }else {
                printLineMargins(n);
            }
        }
    }

    public static void printLine(int n){
        for( var i = 1; i <= n; i++)
            System.out.print("* ");
    }

    public static void printLineMargins(int n){
        for( var i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
    }

    //right half triangle
    //*
    //* *
    //* * *
    //* * * *
    //* * * * *
    public static void printRightHalfTriangle(int n){
        for(int i =1; i<=n; i++, addNewLine()){
            for(int j=1 ;j<=i; j++){
                System.out.print("* ");
            }
        }
    }

    public static void printRightHalfTriangle2(int n){
        for(int i =1; i<=n; i++, addNewLine()){
            printLine(i);
        }
    }

    public static void main(String[] args) {
        printHallowPattern(5);
        printHallowPattern2(5);
        printRightHalfTriangle(5);
        printRightHalfTriangle2(5);

        byte b = 0;

        do{
            System.out.println("b = " + b);
            b++;
        }while(b!=0);

        for ( int i = 0; i<10; i++) {
            System.out.println(i++);
        }
        
    }
}