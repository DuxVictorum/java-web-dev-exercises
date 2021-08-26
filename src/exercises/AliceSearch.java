package exercises;
import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the " +
                "use of a book,' thought Alice 'without pictures or conversation?'";
        String firstLower = firstSentence.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a search term: ");
        String searchTerm = input.nextLine();
        String searchLower = searchTerm.toLowerCase();
        if (firstLower.contains(searchLower)) {
            System.out.println(searchTerm + " is in the first sentence!");
            int searchIndex = firstLower.indexOf(searchLower);
            System.out.println("It begins at index " + searchIndex + " and " +
                    "is " + searchLower.length() + " elements long.");
        } else {
            System.out.println("Sorry, that search term is not in the first sentence.");
        }
        input.close();
    }
}
