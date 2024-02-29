package DTA;

import java.util.ArrayList;
import java.util.List;

public class Recursions {
    
    
    
    /*
     * find all anagrams of given string
     * example:
     * given string: abcd
     * abcd,badc,bdac,bdca..
     * anagram of string with length of n-th length is
     *  all of ana(n-1) and mix with first char of n-th length string
     * 
     */

    // static List<String> anList = new ArrayList<String>();
    
    static void printArray(
        String [] arr
    )

    {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : arr) {
            stringBuilder.append(string + ",");
        }
        System.out.println("Starting printing Anagram:\n"
        + 
        stringBuilder.toString()
        );
    }
    static String[] findAngramStrings(
        String input
    )
    {
        
        
        // base case:
        if (input.length() ==0 || input == null) {
            String [] rs =new String[0];
            return rs;
        }

        if (input.length() ==1) {
            String [] rs =new String[1];
            rs[0] = input;
            return rs;
        }
        
        List<String> anList = new ArrayList<String>();
        // find all anagram of n-1 string length
        String[] anas = findAngramStrings(input.substring(1, input.length()));
        
        for (String temp: anas){
            
            for (int index = 0; index<  input.length(); index++){
                String copy = new String (temp);
                //System.out.println("copy:" + copy);
                
                String modifiedAna = insertAtIndex(copy, input.charAt(0), index);

                //System.out.println("modifiedAna:" + modifiedAna);
                anList.add(
                    modifiedAna
                );

            }
        }
        return anList.toArray(new String[anList.size()]);
    }
    static String insertAtIndex(String input, char c, int index){
        StringBuilder sb = new StringBuilder(input);
        sb.insert(index, c);
        return sb.toString();
    } 
    /*
     * Context:
     * A stair case having number of steps
     * A person can jump with 1, 2, 3 steps at the time
     * Question:
     * 
     * find number of ways a person can claim to n-th stair
     * 
     */
    static int findNumbersOfSteps(
        int n
    ){

        // base case
        int res = 0;
        /*
         * Steps:
         * 1
         */
        if(n == 1) {
            res = 1;
            return res;
        } 
        /*
         * Steps:
         * 1,1
         * 2
         */
        if (n == 2){
            res = 2;
            return res;
        }
        /*
        take steps:
        1,1,1
        1,2
        2,1
        */ 

        if (n == 3){
            res = 3;
            return res;
        }
        /*
         * to climb stair n-th, a person can
         * take 1 step from n-1 (th) stair
         * take 2 steps from n-2 (th) stair
         * take 3 step from n-3 (th) stair
         * 
         * 
         */
        res = findNumbersOfSteps(n-1) + findNumbersOfSteps(n-2) + findNumbersOfSteps(n-3);
        return res;

    }
    public static void main(String[] args) {
        int input = 1;
        int rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", steps:" + rs );
        input = 2;
        rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", steps:" + rs );
        input = 3;
        rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", steps:" + rs );
        input = 4;
        rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", steps:" + rs );
        input = 10;
        rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", steps:" + rs );

        input = 15;
        rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", steps:" + rs );
        
        input = 20;
        rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", steps:" + rs );

        // tesing with anagram 
        String anagramStr = "";
        String [] anagrams = findAngramStrings(anagramStr);
        printArray( anagrams);

        anagramStr = "a";
        anagrams = findAngramStrings(anagramStr);
        System.out.println("Anagram of:" + anagramStr);
        printArray( anagrams);


        anagramStr = "abc";
        anagrams = findAngramStrings(anagramStr);
        System.out.println("Anagram of:" + anagramStr);
        printArray( anagrams);

        anagramStr = "abcd";
        anagrams = findAngramStrings(anagramStr);
        System.out.println("Anagram of:" + anagramStr);
        printArray( anagrams);

        anagramStr = "abcde";
        anagrams = findAngramStrings(anagramStr);
        System.out.println("Anagram of:" + anagramStr);
        printArray( anagrams);

    }
}
