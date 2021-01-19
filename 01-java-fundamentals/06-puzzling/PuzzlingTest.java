import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class PuzzlingTest {
    public static void main(String[] args) {
        Puzzling pz = new Puzzling();
        ArrayList<Character> arr = pz.alphabet();
        Random rand = new Random();
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println(arr);
        System.out.println(arr.get(25));
        int randNum = rand.nextInt(25);
        System.out.println(randNum);
        System.out.println(arr.get(randNum));
        // Print the sum of all numbers in the array
        int[] X = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        System.out.println(pz.SumArr(X));
        System.out.println(pz.greaterThan10(X));
        // System.out.println(pz.greaterThan10(X));

        // 3
        String[] values = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
        System.out.println("Orignal list: " + Arrays.asList(values));
        String[] shuff = pz.arrayShuffler(values);
        System.out.println("Shuffled list: " + Arrays.asList(shuff));

        ArrayList<String> arrayListB = new ArrayList<>();
        // pz.ShuffleAndGreaterThan5(values);
        Collections.addAll(arrayListB, values);
        ArrayList<String> gT5 = pz.ShuffleAndGreaterThan5(arrayListB);
        System.out.println("More than five characters: " + gT5);

    }

}
