package JavaProgramming.Imp;

public class ReverseWordsinSentense {
    public static void main(String[] args) {
        String sentence = "This is a test";

        // Step 1: Split the sentence into words
        String[] words = sentence.split(" ");

        // Step 2: Reverse each word
        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedSentence.append(reversedWord).append(" ");
        }

        // Step 3: Trim the trailing space and print the result
        System.out.println(reversedSentence.toString().trim());
    }
}


