package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
//import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
//        create array of numbers
        Integer[] numberList = {2, 5, 8, 12, 15, 19, 254, 255, 873, 9394};
//        add to nums
        for (Integer i : numberList) {
            nums.add(i);
        }
        System.out.println(nums);
        findEvens(nums);

//        List of words
        ArrayList<String> words = new ArrayList<>(
            List.of("bacon", "hashtag", "Snuffle", "eggs", "river")
        );
        String greenEggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
//        String[] greenEggsArr = greenEggs.split(" ");
        ArrayList<String> greenEggsArrL = new ArrayList<>(Arrays.asList(greenEggs.split(" ")));

//        Print out words with exactly 5 letters
        findWords(words, 5);
        findWords(greenEggsArrL, 6);

//       Ask user to set word length
//        Scanner input = new Scanner(System.in);
//        System.out.println("Choose word length to search for: ");
//        int wordLength = input.nextInt();
//        findWords(words, wordLength);
    }

    public static void findEvens(ArrayList<Integer> numsnums) {
        int sum = 0;
        ArrayList<Integer> evens = new ArrayList<>();
        for (Integer i : numsnums) {
            if (i % 2 == 0) {
                evens.add(i);
                sum += i;
            }
        }
        System.out.println("The even numbers are: \n" + evens);
        System.out.println("The sum of the even numbers is: " + sum);
        }

    public static void findWords(ArrayList<String> wordList, int length) {
        int wordsFound = 0;
        for (String word : wordList) {
            if (word.length() == length) {
                wordsFound += 1;
                System.out.println(word);
            }
        }
        if (wordsFound == 0) {
            System.out.println("Sorry, no words of that length were found.");
        }
    }

}
