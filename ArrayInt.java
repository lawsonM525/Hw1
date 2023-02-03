public class ArrayInt {

    //Helper Functions
    /**
     * Prints out all elements within the array
     * @param array array to be printed out
     */
    public static void printArray(int[] array){
        for(int i=0; i<array.length-1; i++){
            System.out.print(i+", ");
        }
        System.out.println(array[array.length -1]);
    }
    /**
     * Creates a new array up to range max
     * @param max maximum number in continuous range
     * @return created array with range
     */
    public static int[] newArray(int max){
        int[] array = new int[max];
        for (int i=0; i<max; i++){
            array[i] = i;
        }
        return array;
    }

    //1. Copy Function
    /**
     * Copies an array and creates a nw array in adifferent memory location
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
    public static void test_copy(int[] array){
        System.out.println("Testing copy on the following array");
        printArray(array);
        System.out.println("The memory location of the array is "+array);
        System.out.println("The result of the copied array:");
        int[] newArr = copy(array);
        printArray(newArr);
        System.out.println("The memory location of the copy is "+newArr);
    }

    // Main Fuction
    public static void main(String[] args){
        System.out.println("PROGRAM START!");
        System.out.println("----------------");
        System.out.println(" ");
        test_copy(newArray(10));
        System.out.println(" ");
        System.out.println("PROGRAM END");
    }
    
}


