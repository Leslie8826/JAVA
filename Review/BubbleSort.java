/**
  Bubble Sort Algorithm example
**/
public class BubbleSort {
    public static void main(String[] args) {
    // int[] array = {3, 2, 1};
    int[] array = {3, 2, 1, 8, 4, 7};

    // Initial print
    System.out.println("Initial array: ");
    for(int i=0; i<array.length; i++) {
        System.out.print(array[i] + " ");
    }

    // Bubble sort
    for(int i=0; i<array.length; i++) {
    int numberOfSwaps = 0;
    int temp = 0;

    for(int j=0; j<array.length-i-1; j++) {
        if(array[j] > array[j+1]) {
            temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
            }
        }
    }

    // Printing the array for the second time
    System.out.println("\n \n New array: ");
        for(int i=0; i<array.length; i++) {
        System.out.print(array[i] + " ");
        }

    }
}
