import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import javax.swing.plaf.synth.SynthGraphicsUtils;

import jdk.nashorn.api.tree.ForInLoopTree;

public class PuzzlingTest {
    public static void main(String[] args) {
        Puzzling pz = new Puzzling();
        ArrayList<Character> arr = pz.alphabet();
        Random rand = new Random();

        // #1 Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print
        // the sum of all numbers in the array. Also have the function return an array
        // that only includes numbers that are greater than 10 (e.g. when you pass the
        // array above, it should return an array with the values of 13,25,32)
        int[] X = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        System.out.println(pz.SumArr(X));
        System.out.println(pz.greaterThan10(X));

        // #2Create an array with the following values: Nancy, Jinichi, Fujibayashi,
        // Momochi, Ishikawa. Shuffle the array and print the name of each person. Have
        // the method also return an array with names that are longer than 5 characters.
        String[] values = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa" };
        System.out.println("Orignal list: " + Arrays.asList(values));
        String[] shuff = pz.arrayShuffler(values);
        System.out.println("Shuffled list: " + Arrays.asList(shuff));
        ArrayList<String> arrayListB = new ArrayList<>();
        Collections.addAll(arrayListB, values);
        ArrayList<String> gT5 = pz.ShuffleAndGreaterThan5(arrayListB);
        System.out.println("More than five characters: " + gT5);

        // #3 Create an array that contains all 26 letters of the alphabet (this array
        // must have 26 values). Shuffle the array and, after shuffling, display the
        // last letter from the array. Have it also display the first letter of the
        // array. If the first letter in the array is a vowel, have it display a
        // message.
        System.out.println(arr);
        Collections.shuffle(arr);
        System.out.println(arr);
        System.out.println(arr.get(25));
        int randNum = rand.nextInt(25);
        System.out.println(randNum);
        System.out.println(arr.get(randNum));
        System.out.println(arr.get(0));
        Character[] vowel = { 'a', 'e', 'i', 'o', 'u' };
        for (int v = 0; v < vowel.length; v++) {
            if (vowel[v] == arr.get(0)) {
                System.out.println("First letter is a vowel!");
            }
        }

        // #4 Generate and return an array with 10 random numbers between 55-100.
        // Random int 10
        System.out.println("Randow 10 integer= " + Arrays.toString(pz.RandomIntArr(55, 100)));

        // #5 Generate and return an array with 10 random numbers between 55-100 and
        // have
        // it be sorted (showing the smallest number in the beginning). Display all the
        // numbers in the array. Next, display the minimum value in the array as well as
        // the maximum value. If the first letter in the array is a vowel, have it
        // display a message.
        int[] rand10arr = (pz.RandomIntArr(55, 100));
        System.out.println("Random 10 Sorted integer= " + Arrays.toString(rand10arr));
        System.out.println("min value= " + (rand10arr[0]));
        System.out.println("max value= " + (rand10arr[9]));

        //
        // #6 Create a random string that is 5 characters long.
        System.out.println("Random string with 5 char = " + pz.Str5Char());

        // #7 Generate an array with 10 random strings that are each 5 characters long
        System.out.println("Array of 10 random strings with 5 char length = " + Arrays.toString(pz.Random10Strings()));
    }

}
