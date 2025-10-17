package arraysinjava;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        int[] array1D = {1,7,4,2,8,3,9,5,6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element you want to search:");
        int element = scanner.nextInt();
        int elementIndex = -1;
        for (int i = 0; i < array1D.length; i++) {
            if (array1D[i] == element){
                elementIndex = i;
                break;
            }
        }
        if(elementIndex >= 0){
            System.out.println("Element "+element+" found at index "+elementIndex);
        }else{
            System.out.println("Element not found in array!");
        }
    }
}
