import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello strings!");

        // indexOf(), search the first appearance of a char
        // toLowerCase, toUpperCase, substring
        // replace, replaceAll, split, toCharArray

        String foodString = "ice cream, fudge and nuts";

        // print length
        System.out.println(foodString);
        System.out.print("length ");
        System.out.println(foodString.length());

        // print string as chars
        //for(int i = 0; i < foodString.length(); i++) {
        //  System.out.print(foodString[i] + "-");
        //}
        //array required, but String found

        // print last word
        System.out.print("last word ");
        int lastIndex = foodString.lastIndexOf(" ");
        System.out.println(foodString.substring(++lastIndex));

        // problem 1: substring
        // first & last words
        System.out.println("first & last words");
        String inputString = "Coffee and donuts";
        int lastSpace = inputString.lastIndexOf(" ");

        System.out.println(inputString.substring(0, inputString.indexOf(" ")));
        System.out.println(inputString.substring(++lastSpace));

        // replace coffee with tea (case sensitive)
        System.out.println("replace coffee with tea");
        System.out.println(inputString.replaceFirst("Coffee", "tea"));

        // problem 2, parsing strings into arrays
        // return arrays with all the words in strings
        System.out.println("return arrays with all the words in strings");

        String firstString = "Eggs, bacon, toast";
        System.out.println(firstString);
        String[] stringArray = firstString.split(", ");

        System.out.println(Arrays.toString(stringArray));

        String secondString = "cookies and apple and milk";
        System.out.println(secondString);
        stringArray = secondString.split(" and ");

        System.out.println(Arrays.toString(stringArray));

        // *** NOTE *** regex windows vs linux \ vs \\, use double

        String thirdString = "chicken    green salad   bread    ";
        System.out.println(thirdString);
        stringArray = thirdString.split("\\s\\s+");

        System.out.println(Arrays.toString(stringArray));

        // problem 3: loops & strings
        // print the longest word in a sentence
        System.out.println("print the longest word in a sentence");
        inputString = "This is the beginning of a whole new adventure";
        String[] wordsArray = inputString.split(" ");
        String longestWord = "";
        boolean firstPass = true;

        //for (int i = 1; i < wordsArray.length(); i++) {
        for (String word : wordsArray) {
            if (firstPass) {
                longestWord = word;
                firstPass = false;
            }
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("the longest word is " + longestWord);

        // problem 4, loops & strings
        // how many times a letter is found
        System.out.println("how many times a letter is found");
        inputString = "This is the beginning of a whole new adventure";
        String[] letterStringArray = inputString.split("");
        char[] letterCharArray = inputString.toCharArray();
        int counterString = 0, counterChar = 0;

        System.out.println(Arrays.toString(letterStringArray));
        System.out.println(letterCharArray);

        for (int i = 0; i < letterStringArray.length; i++) {
            if (letterStringArray[i].equals("t")) {
                counterString++;
            }
        }
        System.out.println("times letter found in StringArray = " + counterString);

        for (int i = 0; i < letterCharArray.length; i++) {
            if (letterCharArray[i] == 't') {
                counterChar++;
            }
        }
        System.out.println("times letter found in CharArray = " + counterChar);


    }
}
