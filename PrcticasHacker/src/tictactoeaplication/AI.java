package tictactoeaplication;

import java.util.*;

/**
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
public class AI {

    public int pickSpot(TicTacToe game) {
        
        List<Integer> choices = new ArrayList();
        
        for ( int i = 0; i < 9;  i++ ) {
            
            // If the slots is not taken, add it as choise
            if ( game.board[i] == '-' ) {
                
                choices.add(i + 1);
                
            }
            
        }
        
        Random rand = new Random();
        int choice = choices.get( Math.abs( rand.nextInt() % choices.size() ) );
        
        return choice;
        
    }
    
    
    
    
}
