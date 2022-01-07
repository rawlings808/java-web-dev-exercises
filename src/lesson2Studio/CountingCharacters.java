package lesson2Studio;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class CountingCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or phrase:");
        String myString = input.nextLine();

        HashMap<Character, Integer>characterCounts = new HashMap<>();

        char[] charactersInString = myString.toCharArray();
            for (Character character : charactersInString) {

            if (characterCounts.containsKey(character)){
                characterCounts.put(character, characterCounts.get(character) + 1);
            } else {
                characterCounts.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> oneChar: characterCounts.entrySet()){
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }

}
