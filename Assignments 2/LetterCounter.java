// Name: Patrick Roanhouse

/*

CS 55 - Java Programming


*/

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JOptionPane;


public class LetterCounter {

    //Hash maps don't allow duplication. 
    //The letter will be the Key and the repetitions the value(Your goal!)
    private Map<Character, Integer> resultsMap = new HashMap<Character, Integer>(); 

    public static void main(String[] args) {

        LetterCounter letterCounter = new LetterCounter();
        letterCounter.fillMap();
        letterCounter.showMapContents();        
    }

    private void showMapContents() {
        for (Entry<Character, Integer> entry : resultsMap.entrySet())
        {
            System.out.println("'" + entry.getKey() + "' - " + entry.getValue() + " times");
        }       
    }

    private void fillMap() {
        char[] userInputAsArray = userInput();
        for (int currentLetter = 0; currentLetter < userInputAsArray.length; currentLetter++) 
		{
            int count = occurences(userInputAsArray[currentLetter],userInputAsArray);
            resultsMap.put(userInputAsArray[currentLetter], count);
        }
    }

    private int occurences(int letter, char[] userInputAsArray) {
        int counter = 0;
        for (int currentIndex = 0; currentIndex < userInputAsArray.length; currentIndex++) {
            if(userInputAsArray[currentIndex] == letter)
			{
                counter++;
			}
        }
        return counter;
    }

    public char[] userInput() {
        String userInput = JOptionPane.showInputDialog("Enter line of text:  ");
        char[] chars = userInput.toCharArray();
        return chars;
    }
}