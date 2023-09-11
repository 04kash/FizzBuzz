/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(int args) { //these keywords here stand out

//        for (int i = 1; i < 100; i++) { //python: for i in range(0,100):
//
//            // Find out which numbers divide i.
//            boolean divisibleBy3 = i % 3 == 0;//assigning variables in java is different from python
//            boolean divisibleBy5 = i % 5 == 0;
//
//            // Print our appropriate result.
//            if (divisibleBy3 && divisibleBy5) { // python's and here is &&
//
//                System.out.println("Fizz Buzz");
//
//            } else if (divisibleBy3) {
//
//                System.out.println("Fizz");
//
//            } else if (divisibleBy5) { // elif here is written as else if
//
//                System.out.println("Buzz");
//
//            } else {
//
//                System.out.println(i);
//
//            }
//        }
        int i = 0;
        while (i < 100) {
            i = doFizzBuzz(i);
        }
    }

    public static int doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        if (divisibleBy5 && divisibleBy3) {
            System.out.println("Fizz Buzz");
        } else if (divisibleBy3) {
            System.out.println("Fizz");
        } else if (divisibleBy5) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
        i++;
        return i;
    }
}
