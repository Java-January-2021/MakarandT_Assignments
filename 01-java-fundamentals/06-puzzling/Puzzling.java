import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import javax.print.attribute.standard.OrientationRequested;
import javax.xml.stream.events.Characters;

public class Puzzling {
    // Create an array that contains all 26 letters of the alphabet (this array must
    // have 26 values). Shuffle the array and, after shuffling, display the last
    // letter from the array. Have it also display the first letter of the array. If
    // the first letter in the array is a vowel, have it display a message.
    public ArrayList<Character> alphabet() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            alphabet.add(ch);
        }
        return alphabet;
    }
     

    public int SumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public ArrayList<Integer> greaterThan10(int[] arr) {
        ArrayList<Integer> List10 = new ArrayList<Integer>();
        // ArrayList<Integer> arr10 =new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                List10.add(arr[i]);
            }

        }
        return List10;
    }

    // Create an array with the following values: Nancy, Jinichi, Fujibayashi,
    // Momochi, Ishikawa. Shuffle the array and print the name of each person. Have
    // the method also return an array with names that are longer than 5 characters.
    public String[] arrayShuffler(String[] array1) {
        Collections.shuffle(Arrays.asList(array1));
        return array1;
    }

    public ArrayList<String> ShuffleAndGreaterThan5(ArrayList<String> arr3) {
        ArrayList<String> gT5 = new ArrayList<String>();
        for (int i = 0; i < arr3.size(); i++) {
            if (arr3.get(i).length() > 5) {
                gT5.add(arr3.get(i));
            }

        }

        return gT5;
    }

    // Generate and return an array with 10 random numbers between 55-100

    public int[] RandomIntArr(int lowbound, int upperbound) {
        int[] arr = new int[10];
        int offset = upperbound - lowbound;
        Random rand2 = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand2.nextInt(offset) + lowbound;
        }
        Arrays.sort(arr);
        return arr;

    }

    // Create a random string that is 5 characters long.
    public String Str5Char () {
        // String[] str =new String[10];
        String atoz ="ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
        String randomString ="";
        int length =5;
        Random rand = new Random();
        char [] text = new char[length];

        for (int i = 0; i < length; i++) {
        text[i]= atoz.charAt(rand.nextInt(atoz.length()));
        }
        for (int j = 0; j < text.length; j++) {
            randomString += text[j];
        }
        return randomString;
    }

    //Generate an array with 10 random strings that are each 5 characters long
    public String[] Random10Strings (){
        String[] array = new String[10];
        Puzzling pz = new Puzzling();
        for (int i = 0; i < array.length; i++) {
            array[i]=   pz.Str5Char();          
        }
        return array;
    }

}
