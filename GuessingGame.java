package guessinggame;
import java.util.Scanner;

public class GuessingGame {
    //define the players
    public String player1;
    public String player2;
    
    public static void main(String[] args) {
        //starting a new game-calling the card objects
        Game game = new Game();
        game.startNewGame();
     
        //printing all the cards
        for(Card card : game.player1Cards){
            System.out.println(card);
        }
      
        //creating the scanner object
        Scanner input = new Scanner(System.in);
        //choosing our characters
        System.out.println("Choose your character PLAYER 1:");
        String choosePlayer1 = input.nextLine();
 
        System.out.println("Choose your character PLAYER 2:");
        String choosePlayer2 = input.nextLine();
        //setting players cards
        game.setPlayer1Card(choosePlayer1);
        game.setPlayer2Card(choosePlayer2);
      
        System.out.println(game.getPlayer1Card());
        System.out.println(game.getPlayer2Card());
        
        //condition for controlling the game if we still have remaining cards and the turns between the players
        while (game.player1Cards.size() >1 || game.player2Cards.size() >1) {
            //calling the play method and passing the arguments in it player and input
            System.out.println("PLAYER 1: ");
            game.play(1, input.nextLine());
            
            System.out.println("PLAYER 2: ");
            game.play(2, input.nextLine());
            //printing the players arrays with the remaining cards after each turn
            System.out.println("PLAYER 1 cards: "+game.player1Cards.size());
            for(Card card : game.player1Cards)
                System.out.println(card);
            System.out.println(" ------------------------------------------------ ");
            
            System.out.println("PLAYER 2 cards "+game.player2Cards.size());
            for(Card card : game.player2Cards)
                System.out.println(card);
        
            System.out.println(" ------------------------------------------------ ");
        }
        
        //simple printing condition for the winner
        if(game.player1Cards.size() == 1){
            System.out.println("PLAYER 1 WINS!");
        }else{
            System.out.println("PLAYER 2 WINS!");
        }
      
    } 
 }
  