package lesson2.lesson2exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> someIntegers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,33,52,101,1138));
        System.out.println(sumEvenNumbers(someIntegers));

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(phrase.split(" ")));
        System.out.println("Enter a word length to search for:");
        int numChars = input.nextInt();

        printFiveLetterWords(wordList, numChars);
    }



    public static int sumEvenNumbers(ArrayList<Integer> arr){
        int total = 0;
        for (int integer: arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printFiveLetterWords(ArrayList<String> array, int length){
        for (String word: array) {
            if(word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
