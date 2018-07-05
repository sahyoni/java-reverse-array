package com.company;



public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = {12,321,5465,98,148};
        int[] moha ;
        moha = reverseFun(numbers);
        for (int i = 0; moha.length > i; i++){
            System.out.println(moha[i]);
        }

    }
    public static int[] reverseFun (int[] arr) {
        int[] result = new int[arr.length];

        for (int i=0, j=result.length-1; i<arr.length; i++, j--) {
            result[j] = arr[i];
        }

        return result;
    }
}
