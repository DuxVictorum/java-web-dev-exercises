package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numLine = {1, 1, 2, 3, 5, 8};
        for (int i : numLine) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

//        String fun
        String greenEggs = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] greenArr = greenEggs.split("\\.");
        System.out.println(Arrays.toString(greenArr));
    }
}
