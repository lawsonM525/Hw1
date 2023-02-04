package com.gradescope.arrays;

import java.util.Arrays;
import java.util.Random;


public class MyArray2{

    //1. Helper Functions
    /**
     * prints all ements within array on terminal
     * @param array to be printed out
     */
    public static void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }

    /**
     * creates an array with a continuous range from 0 to the max-1
     * @param max maximum number in range for array
     * @return int array with range
     */
    public static int[] newArray(int max){
        int[] array = new int[max];
        for (int i=0; i<max; i++){
            array[i] = i;
        }
        return array;
    } 

    /* Creates an integer array of a given where each element is between 0 and max */
    public static int[] newRandArray(int size, int max){
        Random random = new Random();//initialize random number generator
        int[] array = new int[size];
        for (int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(max);//generate a random integer in the range 0 to max
        }
        return array;
    }
    
    //2. Homework Functions for int arrays

    /**
     * Copies an array
     * @param array array to be copied
     * @return copy of array
     */
    public static int[] copy (int[] array){
        int[] copy = new int[array.length];
        for(int i=0; i < array.length; i++){//loops through array and copies each element into copy
            copy[i] = array[i];
        }
        return copy;
    }

    /**
     * Tests the copy function
     * @param array array to be copied
     */
    // public static void test_copy(int[] array){
    //     System.out.println("Testing copy on the following array");
    //     printArray(array);
    //     System.out.println("The memory location of the array is "+array);
    //     System.out.println("The result of the copied array:");
    //     int[] newArr = copy(array);
    //     printArray(newArr);
    //     System.out.println("The memory location of the copy is "+newArr);
    // }

    /**
     * adds all elements within an array
     * @param array array with elements to be added
     * @return integer sum of elements
     */
    public static int addAll(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){ //loops through array and adds each element to sum
            sum = sum + array[i];
        }
        return sum;
    }

    /**
     * Tests the addAll function
     * @param arr array to be added
     */
    // public static void test_addAll(int[] arr){
    //     System.out.println("Testing addAll on the following array");
    //     printArray(arr);
    //     System.out.println("The result of the sum of the array:");
    //     System.out.println(addAll(arr));
    // }

    /**
     * adds the elements of two arrays
     * @param array1 first array to be added
     * @param array2 second array to be added
     * @return array with the sum of the elements
     */
    public static int[] addArrays(int[] array1, int[] array2){
        int[] sumArray = new int[array1.length];
        for(int i=0; i<array1.length; i++){ //loops through arrays and adds sum of elements to sumArray
            sumArray[i] = array1[i] + array2[i];
        }
        return sumArray;
    }

    /**
     * Tests the addArrays function
     * @param array1 first array to be added
     * @param array2 second array to be added
     */
    // public static void test_addArrays(int[] array1, int[] array2){
    //     System.out.println("Testing addArrays on the following arrays");
    //     System.out.println("Array 1:");
    //     printArray(array1);
    //     System.out.println("Array 2:");
    //     printArray(array2);
    //     System.out.println("The result of the sum of the arrays:");
    //     printArray(addArrays(array1, array2));
    // }

    /**
     * multiplies all elements within an array
     * @param array array with elements to be multiplied
     * @return integer product of elements
     */
    public static int multiplyAll(int[] array){
        int product = 1;
        for(int i=0; i<array.length; i++){ //loops through array and multiplies each element to product
            product *= array[i];
        }
        return product;
    }

    /**
     * Tests the multiplyAll function
     * @param array array to be multiplied
     */
    // public static void test_multiplyAll(int[] array){
    //     System.out.println("Testing multiplyAll on the following array");
    //     printArray(array);
    //     System.out.println("The result of the product of the array:");
    //     System.out.println(multiplyAll(array));
    // }

    /**
     * finds average of all elements within an array
     * @param array array with elements to be averaged
     * @return double average of elements
     */
    public static double findAverage(int[] array){
        return(addAll(array)/array.length);//calls addAll to  get sum of all elements and divides by length of array
    }

    // /**
    //  * Tests the average function
    //  * @param array array to be averaged
    //  */
    // public static void test_findAverage(int[] array){
    //     System.out.println("Testing average on the following array");
    //     printArray(array);
    //     System.out.println("The result of the average of the array:");
    //     System.out.println(findAverage(array));
    // }

    /**
     * swap two elements within an araay in-place
     * @param array array with elements to be swapped
     * @param index1 index of first element to be swapped
     * @param index2 index of second element to be swapped
     */
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1]; //stores value of index1 in temp
        array[index1] = array[index2]; //sets value of index1 to value of index2
        array[index2] = temp; //sets value of index2 to value of temp
    }

    /**
     * Tests the swap function
     * @param array array with elements to be swapped
     * @param index1 index of first element to be swapped
     * @param index2 index of second element to be swapped
     */
    // public static void test_swap(int[] array, int index1, int index2){
    //     System.out.println("Testing swap on the following array");
    //     printArray(array);
    //     System.out.println("Swapping index "+index1+" with index "+index2);
    //     swap(array, index1, index2);
    //     System.out.println("The result of the swap:");
    //     printArray(array);
    // }

    /**
     * checks if an array contains a value
     * @param array array to be checked
     * @param value value we are looking for
     * @return boolean true if value is in array, false if not
     */
    public static boolean isElement(int[] array, int value){
        for(int i=0; i<array.length; i++){
            if(array[i] == value){//loops through array and checks if value is in array
                return true;
            }
        }
        return false;
    }

    /**
     * Tests the isElement function
     * @param array array to be checked
     */
    // public static void test_isElement(int[] array){
    //     int value = array[0];
    //     System.out.println("Testing isElement on the following array");
    //     printArray(array);
    //     System.out.println("Testing isElement on value: "+ value);
    //     System.out.println("Result from isElement: " + isElement(array,value));
    //     System.out.println("Testing isElement on value: "+ "1000");
    //     System.out.println("Result from isElement: "+isElement(array, 1000));
    // }

    /**
     * finds the index of a value in an array
     * @param array array to be checked
     * @param element element with index we are looking for
     * @return int index of value in array
     */
    public static int indexOf(int[] array, int element){
        for(int i=0; i<array.length; i++){
            if(array[i] == element){//loops through array and checks for element within array
                return i;//returns index of element
            }
        }
        return -1;//returns -1 if element is not in array
    }

    /**
     * Tests the indexOf function
     * @param array array to be checked
     */
    // public static void test_indexOf(int[] array){
    //     int element = array[0];
    //     System.out.println("Testing indexOf on the following array");
    //     printArray(array);
    //     System.out.println("Testing indexOf on element: "+ element);
    //     System.out.println("Result from indexOf: " + indexOf(array,element));
    //     System.out.println("Testing indexOf on element: "+ "1000");
    //     System.out.println("Result from indexOf: "+indexOf(array, 1000));
    // }

    /**
     * finds the smallest element in an array
     * @param array array to be checked
     * @return int smallest element in array
     */
    public static int findMin(int[] array){
        int min = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] < min){//loops through array and checks if element is smaller than smallest
                min = array[i];//sets smallest to element if element is smaller than smallest
            }
        }
        return min;
    }

    /**
     * Tests the findMin function
     * @param array array to be checked
     */
    // public static void test_findMin(int[] array){
    //     System.out.println("Testing findMin on the following array");
    //     printArray(array);
    //     System.out.println("The result of the smallest element in the array:");
    //     System.out.println(findMin(array));
    // }

    /**
     * finds the index of the smallest element in an array
     * @param array array to be checked
     * @return int index of smallest element in array
     */
    public static int findMinIndex(int[] array){
        int min = array[0];
        int index = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] < min){//loops through array and checks if element is smaller than smallest
                min = array[i];//sets smallest to element if element is smaller than smallest
                index = i;//sets index to index of element if element is smaller than smallest
            }
        }
        return index;
    }
    
    /**
     * Tests the findMinIndex function
     * @param array array to be checked
     */
    // public static void test_findMinIndex(int[] array){
    //     System.out.println("Testing findMinIndex on the following array");
    //     printArray(array);
    //     System.out.println("The result of the index of the smallest element in the array:");
    //     System.out.println(findMinIndex(array));
    // }

    /**
     * finds the largest element in an array
     * @param array array to be checked
     * @return int largest element in array
     */
    public static int findMax(int[] array){
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] > max){//loops through array and checks if element is larger than largest
                max = array[i];//sets largest to element if element is larger than largest
            }
        }
        return max;
    }

    /**
     * Tests the findMax function
     * @param array array to be checked
     */
    // public static void test_findMax(int[] array){
    //     System.out.println("Testing findMax on the following array");
    //     printArray(array);
    //     System.out.println("The result of the largest element in the array:");
    //     System.out.println(findMax(array));
    // }

    /**
     * finds the index of the largest element in an array
     * @param array array to be checked
     * @return int index of largest element in array
     */
    public static int findMaxIndex(int[] array){
        int max = array[0];
        int index = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > max){//loops through array and checks if element is larger than largest
                max = array[i];//sets largest to element if element is larger than largest
                index = i;//sets index to index of element if element is larger than largest
            }
        }
        return index;
    }

    /**
     * Tests the findMaxIndex function
     * @param array array to be checked
     */
    // public static void test_findMaxIndex(int[] array){
    //     System.out.println("Testing findMaxIndex on the following array");
    //     printArray(array);
    //     System.out.println("The result of the index of the largest element in the array:");
    //     System.out.println(findMaxIndex(array));
    // }

    /**
     * reverse an array in-place
     * @param array array to be reversed
     */
    public static void reverse(int[] array){
        for(int i=0; i<array.length/2; i++){
            swap(array, i, array.length-1-i);
        }
    }

    /**
     * Tests the reverseInPlace function
     * @param array array to be reversed
     */
    // public static void test_reverse(int[] array){
    //     System.out.println("Testing reverse on the following array");
    //     printArray(array);
    //     reverse(array);
    //     System.out.println("The result of the array after reversing it:");
    //     printArray(array);
    // }

    /**
     * reverse an array out of place
     * @param array array to be reversed
     * @return int[] reversed array
     */
    public static int[] returnReverse(int[] array){
        int[] reversed = new int[array.length];
        for(int i=0; i<array.length; i++){
            reversed[i] = array[array.length-1-i];//sets element at index i to element at index array.length-1-i
        }
        return reversed;
    }

    /**
     * Tests the reverse function
     * @param array array to be reversed
     */
    // public static void test_returnReverse(int[] array){
    //     System.out.println("Testing returnReverse on the following array");
    //     printArray(array);
    //     System.out.println("The result of the reversed array:");
    //     printArray(returnReverse(array));
    // }

    /**
     * finds element that intersect between two arrays
     * @param array1 first array to be checked
     * @param array2 second array to be checked
     * @return int[] array of elements that intersect between the two arrays
     */
    public static int[] intersection(int[] array1, int[] array2){
        int[] temp = new int[array1.length];
        int count = 0;
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if(array1[i] == array2[j]){//checks if element at index i in array1 is equal to element at index j in array2
                    if(isElement(temp, array1[i])==false){
                        temp[count] = array1[i];//sets element at index count in intersect to element at index i in array1
                        count++;//increments count
                    }
                }
            }
        }
        if(isElement(array1, 0)==true||isElement(array2,0)==true){
            temp[count] = 0;
            count++;
        }
        int[] intersect = new int[count];
        for(int i=0; i<intersect.length; i++){
            intersect[i] = temp[i];//adds all newly added intersection elements in temp to intersect
        }
        return intersect;
    }

    /**
     * Tests the intersect function
     * @param array1 first array to be checked
     * @param array2 second array to be checked
     */
    // public static void test_intersection(int[] array1, int[] array2){
    //     System.out.println("Testing intersect on the following arrays");
    //     printArray(array1);
    //     printArray(array2);
    //     System.out.println("The result of the intersecting elements between the two arrays:");
    //     printArray(intersection(array1, array2));
    // }

    /**
     * finds the union of two arrays
     * @param array1 first array to be checked
     * @param array2 second array to be checked
     * @return int[] array of elements that are in either array1 or array2
     */
    public static int[] union(int[] array1, int[] array2){
        int[] union = new int[array1.length+array2.length];
        int count = 0;
        for(int i=0; i<array1.length; i++){
            if(isElement(union, array1[i])==false){
                union[count] = array1[i];//sets element at index count in union to element at index i in array1
                count++;//increments count
            }
        }
        for(int i=0; i<array2.length; i++){
            if(isElement(union, array2[i])==false){
                union[count] = array2[i];//sets element at index count in union to element at index i in array2
                count++;//increments count
            }
        }
        if(isElement(array1, 0)==true||isElement(array2,0)==true){
            temp[count] = 0;
            count++;
        }
        int[] union2 = new int[count];
        for(int i=0; i<count; i++){
            union2[i] = union[i];//sets element at index i in union2 to element at index i in union
        }
        return union2;
    }

    /**
     * Tests the union function
     * @param array1 first array to be checked
     * @param array2 second array to be checked
     */
    // public static void test_union(int[] array1, int[] array2){
    //     System.out.println("Testing union on the following arrays");
    //     printArray(array1);
    //     printArray(array2);
    //     System.out.println("The result of the union of the two arrays:");
    //     printArray(union(array1, array2));
    // }

    /**
     * sorts an array in ascending order in-place
     * @param array array to be sorted
     */
    public static void sort(int[] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length-1; j++){
                if(array[j] > array[j+1]){//checks if element at index j is greater than element at index j+1
                    swap(array, j, j+1);//swaps elements at index j and j+1
                }
            }
        }
    }

    /**
     * Tests the sort function
     * @param array array to be sorted
     */
    // public static void test_sort(int[] array){
    //     System.out.println("Testing sort on the following array");
    //     printArray(array);
    //     sort(array);
    //     System.out.println("The result of the sorted array:");
    //     printArray(array);
    // }
    

    //Main Function
    public static void main(String[] args){
        // System.out.println("PROGRAM START!");
        // System.out.println("=================");
        // System.out.println(" ");

        // //make helper functions to make arrays
        // // something small
        // // something big
        // // something random
        // int[] array = newArray(7);
        // int[] array2 = newRandArray(7, 10);



        // //Calling testers
        // test_copy(array2);
        // System.out.println("--------------------");
        // test_addAll(array);
        // System.out.println("--------------------");
        // test_addArrays(array, array2);
        // System.out.println("--------------------");
        // test_multiplyAll(array);
        // System.out.println("--------------------");
        // test_findAverage(array);
        // System.out.println("--------------------");
        // test_swap(array, 0, array.length-3);
        // System.out.println("--------------------");
        // test_isElement(array2);
        // System.out.println("--------------------");
        // test_indexOf(array2);
        // System.out.println("--------------------");
        // test_findMin(array2);
        // System.out.println("--------------------");
        // test_findMinIndex(array2);
        // System.out.println("--------------------");
        // test_findMax(array2);
        // System.out.println("--------------------");
        // test_findMaxIndex(array2);
        // System.out.println("--------------------");
        // test_reverse(array);
        // System.out.println("--------------------");
        // test_returnReverse(array);
        // System.out.println("--------------------");
        // test_intersection(array, array2);
        // System.out.println("--------------------");
        // test_union(array, array2);
        // System.out.println("--------------------");
        // test_sort(array2);
        // System.out.println("Thank you and have a great day! :)");
    }
}
