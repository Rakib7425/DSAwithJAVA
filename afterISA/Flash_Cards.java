// import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Flashcard {
    private String word;
    private String meaning;

    public Flashcard(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    public String getWord() {
        return word;
    }

    public String getMeaning() {
        return meaning;
    }
}

class Flash_Cards {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String meaning = sc.nextLine();
        sc.close();

        Flashcard flashcard = new Flashcard(word, meaning);
        System.out.println("> " + flashcard.getWord() + " ( " + flashcard.getMeaning() + " )");
    }
}

/*
 * 
 * Flash Cards
 * medium
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * Problem Statement
 * Build a class having name "Flashcard". A flashcard is a card having
 * information on both sides, which can be used as an aid in memoization.
 * Flashcards usually have a question on one side and an answer on the other.
 * Note: We are going to create flashcards that will be having a word and its
 * meaning.
 * Input
 * The first line contains the word.
 * The second line contains its meaning.
 * 
 * Constraints:
 * 0 ≤ len(w) ≤ 100
 * 0 ≤ len(m) ≤ 100
 * Output
 * Prints "> word ( meaning )".
 * Example
 * Sample Input:
 * hi
 * hello
 * 
 * Sample Output:
 * > hi ( hello )
 */