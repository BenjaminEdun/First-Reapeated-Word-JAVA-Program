//This program searches a sentence, read from a user keyboard input, and returns the first repeated word.

package javafromnetbeans;

import java.util.Scanner;

/**
 *
 * @author Benjamin
 */
public class FirstRepeatedWord {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in); //Scanner object to read user input from keyboard
        
        System.out.print("Enter a sentence containing repeated word: ");
                
        String inputString = input.nextLine(); // Reads user input string on a line
           
        System.out.println();
        
        System.out.println(firstRepeatedWord(inputString));// Passes the input string to method firstRepeatedWord
                                                           // The return word is then printed to the screen.
        System.out.println();

    }//end main
    
       public static String firstRepeatedWord(String sentence) {
          String word = "";
          String repeatedWord = "";
         
          String[] sentenceArray = sentence.split(" ");
          
     
          for(int i=0; i<sentenceArray.length; i++)
          {
              word = sentenceArray[i];
              
              for (int j=i+1; j<sentenceArray.length - 1; j++)
              {
                  if (word.matches(sentenceArray[j]))
                  {
                      repeatedWord = word;
                      break;
                  }//end if
              }//end inner for
              
              if(!(repeatedWord.isEmpty())) // This means a repeated word has been found
              {
                  break; //exit the outer for loop
              }//end if
          }//end outer for
                    
          return repeatedWord;
          
    }//end method firstRepeatedWord
}//end class FirstRepeatedWord
