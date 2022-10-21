package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static

    // Task 1

    public static void oneMonthCalendar(int numberDays, int startDay){
        int i;
        int day;

        for (i = 1; i <= startDay-1; i++) {
            System.out.print("   ");
        }

        for (day = 1; day <= numberDays; day++, i++) {
            if (day < 10) {
                System.out.printf(" ");
            }
            System.out.print(day + " ");

            if (i % 7 == 0 && day <= 29) {
                System.out.println();
            }
        }
        System.out.println();
    }


    // Task 2
    public static long[] lcg(long seed) {
        long [] arr = new long [10];

        final long m = (long) Math.pow(2, 31);
        final int a = 1103515245;
        final int c = 12345;
        long x = seed;

        for (int i = 0; i < arr.length; i++ ) {

            x = (a * x + c) % m;
            arr[i] = x;
            }
        return arr;
    }

    // Task 3
    public static void guessingGame (int numberToGuess) {
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        int inputNumber = 0;

        while (numberToGuess != inputNumber && counter !=10) {
            inputNumber = scan.nextInt();
            System.out.print("Guess number " + counter + ": ");
            if (inputNumber > numberToGuess) {
                System.out.println("The number AI picked is lower than your guess.");
            }
            else if (inputNumber < numberToGuess) {
                    System.out.println("The number AI picked is higher than your guess.");
            }
            counter++;
        }

        if (inputNumber == numberToGuess) {
            System.out.print("You won wisenheimer!" + System.lineSeparator());
        }
            else {
                System.out.print("Guess number " + counter + ": You lost! Have you ever heard of divide & conquer?" + System.lineSeparator());

        }
    }

    public static int randomNumberBetweenOneAndHundred() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    // Task 4

    public static boolean swapArrays(int [] arr1, int [] arr2) {

        int arrayLength1 = arr1.length;
        int arrayLength2 = arr2.length;

        if (arrayLength1 != arrayLength2) {
            return false;
        }
        for (int i = 0; i < arrayLength1; i++) {
            int array3 = arr2[i];
            arr2[i] = arr1[i];
            arr1[i] = array3;
        }
        return true;
    }


    // Task 5

    public static String camelCase(String input) {
        char[] inputText = input.toCharArray();
        if (inputText[0] >= 97 & inputText[0] <= 122)
            inputText[0] -= 32;


        for (int i = 0; i < inputText.length; i++) {
                if (i >= 1 && inputText[i - 1] == 32 && inputText[i] >= 97 && inputText[i] <= 122)
                    inputText[i] -= 32;
        }

        for (int i = 0; i < inputText.length; i++) {
            if (i >= 1 && inputText[i - 1] != 32 && inputText[i] >= 65 && inputText[i] <= 90)
                inputText[i] += 32;
        }

        for (int i = 0; i < inputText.length; i++) {

            if (i >= 0 && inputText[i] <= 64 || inputText[i] >= 91 && inputText[i] <= 96 || inputText[i] >= 123 && inputText[i] <= 127)
                inputText[i] = 32;
        }

            String output = String.valueOf(inputText).replaceAll(" ", "");

            return output;

    }

    // Task 6

    public static int checkDigit(int[] code) {
        int sum = 0;
        int a;
        for (a = 0; a < code.length; a++) {
            sum = sum + (code[a]) * (a + 2);
        }

        int sum2 = sum % 11;
        int number = 11 - sum2;

        if (number == 10) {
            return 0;
        }

        if (number == 11) {
            return 5;
        }
        else
            return number;
    }









    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.

        /* mitschrift übungseinheit

        void onemonthcalendar (int tage_max), int start)
        final int SPALTE_MAX = 7;
        int monatstag = 1;
        for (int i = 0; i < start-1; i++) {
        sout ("   ") 3 leerzeichen;
        for (int zeile = 0; ; zeile++) { (wir wissen noch nicht wo wir aufhören, aber immer erhöhen)
        int tage = SPALTE_MAX - (start-1)
        solange i weniger als tage ist (0,1,2,3,4) wird geprintet, bei 5 nicht mehr
        for (int = 0; i < tage; i++) {
        ---- > if (monatstag < 10 sout "   )
        sout (monatstag +  " ");
        monatstag++
        if (monatstage >= tage-_max) return; bei break würde nur aus kleiner schlefie
        }
        sout() syst line break
        }


        // arrays immer die anzahl wie sie initalisiert; lists sind dynamischer
       length funktion, for each


        */





    }
}