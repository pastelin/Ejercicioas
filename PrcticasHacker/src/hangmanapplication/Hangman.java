package hangmanapplication;

import java.io.*;
import java.util.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class Hangman {

    public String mysteryWord;
    public StringBuilder currentGuess;
    public List<Character> previusGuesses = new ArrayList();

    private static final int maxTries = 6;
    int currentTry = 0;

    private static List<String> dictionary = new ArrayList();
    private static FileReader fileReader;
    private static BufferedReader bufferedFileReader;

    public Hangman() throws IOException {

        initializeStreams();
        this.mysteryWord = pickWord();
        this.currentGuess = initializeCurrentGuess();

    }

    public void initializeStreams() {

        try {

            File inFile = new File("c:\\Cursos\\dictionary.txt");
            fileReader = new FileReader(inFile);
            bufferedFileReader = new BufferedReader(fileReader);
            String currentLine = bufferedFileReader.readLine();

            while (currentLine != null) {

                dictionary.add(currentLine);
                currentLine = bufferedFileReader.readLine();

            }

            bufferedFileReader.close();
            fileReader.close();

        } catch (IOException e) {

            System.out.println("Could not init streams");

        }

    }

    public static String pickWord() {

        Random rand = new Random();
        int wordIndex = Math.abs(rand.nextInt()) % dictionary.size();

        return dictionary.get(wordIndex);
    }

    public StringBuilder initializeCurrentGuess() {

        StringBuilder current = new StringBuilder();

        for (int i = 0; i < mysteryWord.length() * 2; i++) {

            if (i % 2 == 0) {

                current.append("_");

            } else {

                current.append(" ");

            }

        }

        return current;

    }

    public String getFormalCurrentGuess() {

        return "Current Guess: " + currentGuess.toString();

    }

    public boolean gameOver() {

        if ( didWeWin() ) {
            
            System.out.println();
            System.out.println("Congrats! You won! You guessed the right word!");
            return true;
            
        } else if( didWeLose() ) {
            
            System.out.println();
            System.out.println("Sorry! you lost. You spent all of your 6 tries. "
                    + "The word was " + this.mysteryWord + ".");
            return true;
            
        }
        
        return false;

    }
    
    public boolean didWeLose() {
        
        return this.currentTry >= maxTries;
        
    }

    public boolean didWeWin() {
        
        String guess = getCondensedCurrentGuess();
        
        return guess.equals(this.mysteryWord);
        
    }
    
    public String getCondensedCurrentGuess() {
        
        String guess = this.currentGuess.toString();
        
        return guess.replace(" ", "");
        
    }
    
    public boolean isGuessedAlready(char guess) {

        return previusGuesses.contains(guess);

    }

    public String drawPicture() {

        switch (currentTry) {

            case 0:
                return noPersonDraw();
            case 1:
                return addHeadDraw();
            case 2:
                return addBodyDraw();
            case 3:
                return addOneArmDraw();
            case 4:
                return addSecondArmDraw();
            case 5:
                return addFirstLegDraw();
            default:
                return fullPersonDraw();

        }

    }

    public boolean playGuess(char guess) {

        boolean isItAGoodGuess = false;

        this.previusGuesses.add(guess);
        
        for (int i = 0; i < this.mysteryWord.length(); i++) {

            if (this.mysteryWord.charAt(i) == guess) {

                this.currentGuess.setCharAt(i * 2, guess);
                isItAGoodGuess = true;
            }

        }

        if (!isItAGoodGuess) {

            this.currentTry++;

        }

        return isItAGoodGuess;

    }

    private String noPersonDraw() {

        return " - - - - -\n"
                + "|        |\n"
                + "|        \n"
                + "|       \n"
                + "|        \n"
                + "|       \n"
                + "|\n"
                + "|\n";

    }

    private String addHeadDraw() {

        return " - - - - -\n"
                + "|        |\n"
                + "|        0\n"
                + "|       \n"
                + "|        \n"
                + "|       \n"
                + "|\n"
                + "|\n";

    }

    private String addBodyDraw() {

        return " - - - - -\n"
                + "|        |\n"
                + "|        0\n"
                + "|        |\n"
                + "|        |\n"
                + "|       \n"
                + "|\n"
                + "|\n";

    }

    private String addOneArmDraw() {

        return " - - - - -\n"
                + "|        |\n"
                + "|        0\n"
                + "|      / |\n"
                + "|        |\n"
                + "|       \n"
                + "|\n"
                + "|\n";

    }

    private String addSecondArmDraw() {

        return " - - - - -\n"
                + "|        |\n"
                + "|        0\n"
                + "|      / | \\\n"
                + "|        |\n"
                + "|       \n"
                + "|\n"
                + "|\n";

    }

    private String addFirstLegDraw() {

        return " - - - - -\n"
                + "|        | \n"
                + "|        0 \n"
                + "|      / | \\ \n"
                + "|        | \n"
                + "|       /  \n"
                + "|\n"
                + "|\n";

    }

    private String fullPersonDraw() {

        return " - - - - -\n"
                + "|        | \n"
                + "|        0 \n"
                + "|      / | \\ \n"
                + "|        | \n"
                + "|       / \\ \n"
                + "|\n"
                + "|\n";

    }

}
