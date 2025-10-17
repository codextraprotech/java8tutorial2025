package controlstatements;

/*
* Nested Loops - One loop inside another is called nested loops.
*/
public class ControlStatementPart3 {
    public static void main(String[] args) {
        // Example for hour clock
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59 ; j++) {
                for (int k = 0; k <= 59 ; k++) {
                    System.out.println("Time ("+i+":"+j+":"+k+")");
                }
            }
        }


        //Example for Serving each chair on 3 dining tables in a restaurant
//        int tables = 3;
//        while (tables > 0){
//            int chairs = 4;
//            System.out.println("Waiter on Table "+tables);
//            while (chairs > 0){
//                System.out.println("Serving on Chair "+chairs);
//                chairs--;
//            }
//            tables--;
//        }

        // Example for student homework for each period of a day
//        for (int period = 1; period <= 3; period++) {
//            int homework = 1;
//            while (homework <= 2) { // assume 2 tasks per period
//                System.out.println("Period " + period + " - Homework task " + homework);
//                homework++;
//            }
//        }
    }
}
