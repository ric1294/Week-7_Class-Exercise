package com.richa;

public class Day8 {
    public static void main(String[] args) {
        int[] myIntArray = { 50 ,20 , 60, 40 , 10 , 90 , 100 , 70 , 56 ,23};
        System.out.println("==========Original array:===========");
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.print(myIntArray[i] + " ");
        }
        reverseArray(myIntArray);
        ascendingArray(myIntArray);
        descendingArray(myIntArray);
        displayOddElements(myIntArray);
        displayEvenElements(myIntArray);
        sumOfElements(myIntArray);

    }


    static void reverseArray(int[] arr){
        System.out.println();
        System.out.println("==========Array in reverse order:===========" );
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    static void ascendingArray(int[] arr){
        int temp = 0;
        System.out.println();
        System.out.println("==========Array in ascending  order=============");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void descendingArray(int[] arr){
        int temp = 0;
        System.out.println();
        System.out.println("===========Array in descending  order============");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void displayOddElements(int[] arr) {
        System.out.println();
        System.out.println("=============Odd Elements in array============");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

    }

    static void displayEvenElements(int[] arr){
        System.out.println();
        System.out.println("=============Even Elements in array=============");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void sumOfElements(int[] arr){
        int sum = 0;
        System.out.println();
        System.out.println("=============Sum of all elements==============");
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of all elements is: "+ sum);
    }


}
