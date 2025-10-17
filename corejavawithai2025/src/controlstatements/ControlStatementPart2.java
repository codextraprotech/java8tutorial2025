package controlstatements;

/*
* Loops - It means repetition of a task.
* Step 1: Stepper/Counter variable initialization. Go to step 2.
* Step 2: Conditional statement - this helps us to know when to close the loop. Go to step 3 if true.
* Step 3: Logical task - this is the actual set of statements to be repeated. Go to step 4.
* Step 4: Increment/Decrement of Stepper/Counter variable. After this, the loop goes back to step 2.
*
* Types of loops in java - for loop, while loop, do-while loop and for-each loop.
*/
public class ControlStatementPart2 {
    public static void main(String[] args) {
//        System.out.println("BEGIN :: controlstatements.ControlStatementPart2 program execution.");
        // for loop
//        for (int i = 0; i <= 50; i = i + 5) {
//            System.out.println("i = "+i);
//        }

//        System.out.println("Out of for loop.");
//
//        // while loop
        int j = 10;
        while (j >= 0){
            System.out.println("3 x " + j + " = " + (3*j));
            j = j-2;
        }
//
//        System.out.println("Out of while loop.");
//
//        // do-while loop
//        int k = 0;
//        do {
//            System.out.println(k*k);
//            k++;
//        }while (k < 5);
//
//        System.out.println("Out of do-while loop.");
//
//        // for-each loop - it works only fo arrays or collections.
//        // this is an array variable. we will learn about arrays in coming tutorial in detail.
//        int[] arrayVar = {1, 2, 3, 4, 5}; // 5 index = 6th position in array
//        for (int num : arrayVar){ //
//            System.out.println("num of arrayVar = "+num); // num = arrayVar[0];
//        }
//
//        System.out.println("Out of for-each loop.");

        System.out.println("END :: controlstatements.ControlStatementPart2 program execution.");
    }
}
