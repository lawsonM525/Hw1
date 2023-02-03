public class Helpers {
    
    public static void printArray(int[] array){
        for(int i=0; i<array.length-1; i++){
            System.out.print(i+", ");
        }
        System.out.println(array[array.length -1]);
    }
}
