package org.launchcode.java.studios.charactercount;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) throws IOException {
//        Set example string
        String s1 = "Call me Ishmael. Some years ago--never mind how long precisely--having little or no money in my purse, and nothing particular to interest me on shore, I thought I would sail about a little and see the watery part of the world. It is a way I have of driving off the spleen and regulating the circulation. Whenever I find myself growing grim about the mouth; whenever it is a damp, drizzly November in my soul; whenever I find myself involuntarily pausing before coffin warehouses, and bringing up the rear of every funeral I meet; and especially whenever my hypos get such an upper hand of me, that it requires a strong moral principle to prevent me from deliberately stepping into the street, and methodically knocking people's hats off--then, I account it high time to get to sea as soon as I can. This is my substitute for pistol and ball. With a philosophical flourish Cato throws himself upon his sword; I quietly take to the ship. There is nothing surprising in this. If they but knew it, almost all men in their degree, some time or other, cherish very nearly the same feelings towards the ocean with me.";

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a string to analyze: ");
//        String inputSentence = input.nextLine();

//        Read text from file
//        Path fileName = Path.of("C:\\Users\\junge\\Box Sync\\Tech\\launchcode\\Java\\Projects\\src\\org\\launchcode\\java\\studios\\charactercount\\text-sample.txt");
        Path fileName = Path.of("./src/org/launchcode/java/studios/charactercount/text-sample.txt");
        String fileContent = Files.readString(fileName);
        String fileContentLower = fileContent.toLowerCase();
        char[] charList = fileContentLower.toCharArray();

//        Create hashmap
        HashMap<Character, Integer> charsCount = new HashMap<>();

//        Populate keys and counts
        for (Character c : charList) {
            if (!Character.isAlphabetic(c)) {
                continue;
            }
            if (charsCount.containsKey(c)) {
                charsCount.put(c, charsCount.get(c)+1);
            } else {
                charsCount.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> charPair : charsCount.entrySet()) {
            System.out.println(charPair.getKey() + ": " + charPair.getValue());
        }
        String currentDirectory = System.getProperty("user.dir");
        System.out.println(currentDirectory);
    }
}

//import java.io.IOException;
//        import java.nio.file.Files;
//        import java.nio.file.Path;
//
//public class WriteToFile
//{
//    public static void main(String[] args) throws IOException
//    {
//        Path fileName = Path.of("demo.txt");
//        String content  = "hello world !!";
//        Files.writeString(fileName, content);
//
//        String actual = Files.readString(fileName);
//        System.out.println(actual);
//    }
//}