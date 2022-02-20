package guessinggame;
import java.util.Scanner;

public class GuessingGame {
   
    public String player1;
    public String player2;
    
    public static void main(String[] args) {
        
        Game game = new Game();
        game.startNewGame();
     
        //printing all the cards
        for(Card card : game.player1Cards){
            System.out.println(card);
        }
      
      
        Scanner input = new Scanner(System.in);
       
        System.out.println("Choose your character PLAYER 1:");
        String choosePlayer1 = input.nextLine();
 
        System.out.println("Choose your character PLAYER 2:");
        String choosePlayer2 = input.nextLine();
     
        game.setPlayer1Card(choosePlayer1);
        game.setPlayer2Card(choosePlayer2);
      
        System.out.println(game.getPlayer1Card());
        System.out.println(game.getPlayer2Card());
        
      
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
        
       
        if(game.player1Cards.size() == 1){
            System.out.println("PLAYER 1 WINS!");
        }else{
            System.out.println("PLAYER 2 WINS!");
        }
      
    } 
 }
  
