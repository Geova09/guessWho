package guessinggame;
import java.util.ArrayList;

public class Game {
    
    
    ArrayList<Card> player1Cards = new ArrayList<>();
    ArrayList<Card> player2Cards = new ArrayList<>();
    
  
    private Card player1Card;
    private Card player2Card;
    
    
    public void startNewGame(){
        player1Cards.add(new Card("Alice", "Brown", "Black",  "Brown", true, true, false));
        player1Cards.add(new Card("Bob",       "Blond", "White",  "Brown", false,  true, false));
        player1Cards.add(new Card("Charlie",   "Black", "Green",  "Blue",  false,  true, true));
        player1Cards.add(new Card("Donald",    "Red",  "White",  "Blue",  false,  false,  false));
        player1Cards.add(new Card("Erica",     "Blond", "Yellow", "Green",  false,  true, true));
        player1Cards.add(new Card("Fritz",     "Black", "Black",  "Blue",  true, false,  true));
        player1Cards.add(new Card("George",    "Brown", "Yellow", "Brown", false,  true, false));
        player1Cards.add(new Card("Heidi",     "Red",  "Black",  "Blue",  true, true, true));
        player1Cards.add(new Card("Ian",       "Black", "White",  "Brown", true, false,  false));
        player1Cards.add(new Card("John",      "Brown", "Black",  "Brown", false,  false,  false));
        player1Cards.add(new Card("Karl",      "Red",  "Yellow", "Green", false,  true, false));
        player1Cards.add(new Card("Lena",      "Red",  "White",  "Brown", false,  true, true));
        player1Cards.add(new Card("Maria",     "Blond", "Yellow", "Green", false,  true, false));
        player1Cards.add(new Card("Nick",      "Black", "Green",  "Brown", false,  false,  false));
        player1Cards.add(new Card("Olive",     "Red",  "White",  "Blue",  true, true, false));
        player1Cards.add(new Card("Petros",    "Black", "White",  "Brown", false,  true, false));
        player1Cards.add(new Card("Quentin",   "Blond", "Yellow", "Blue",  false,  true, false));
        player1Cards.add(new Card("Rafaela",   "Blond", "Green",  "Green", false,  true, false));
        player1Cards.add(new Card("Sabine",    "Black", "Green",  "Blue",  false,  false,  true));
        player1Cards.add(new Card("Takis",     "Brown", "Black",  "Brown", false,  true, true));
        player1Cards.add(new Card("Udo",       "Red",  "Black",  "Green", false,  true, false));
        player1Cards.add(new Card("Valentine", "Black", "Yellow", "Blue",  false,  true, false));
        player1Cards.add(new Card("Walter",    "Brown", "White",  "Blue",  true, false,  true));
        player1Cards.add(new Card("Xavier",    "Red",  "Green",  "Brown", false,  true, false));
        
        player2Cards.add(new Card("Alice", "Brown", "Black",  "Brown", true, true, false));
        player2Cards.add(new Card("Bob",       "Blond", "White",  "Brown", false,  true, false));
        player2Cards.add(new Card("Charlie",   "Black", "Green",  "Blue",  false,  true, true));
        player2Cards.add(new Card("Donald",    "Red",  "White",  "Blue",  false,  false,  false));
        player2Cards.add(new Card("Erica",     "Blond", "Yellow", "Green",  false,  true, true));
        player2Cards.add(new Card("Fritz",     "Black", "Black",  "Blue",  true, false,  true));
        player2Cards.add(new Card("George",    "Brown", "Yellow", "Brown", false,  true, false));
        player2Cards.add(new Card("Heidi",     "Red",  "Black",  "Blue",  true, true, true));
        player2Cards.add(new Card("Ian",       "Black", "White",  "Brown", true, false,  false));
        player2Cards.add(new Card("John",      "Brown", "Black",  "Brown", false,  false,  false));
        player2Cards.add(new Card("Karl",      "Red",  "Yellow", "Green", false,  true, false));
        player2Cards.add(new Card("Lena",      "Red",  "White",  "Brown", false,  true, true));
        player2Cards.add(new Card("Maria",     "Blond", "Yellow", "Green", false,  true, false));
        player2Cards.add(new Card("Nick",      "Black", "Green",  "Brown", false,  false,  false));
        player2Cards.add(new Card("Olive",     "Red",  "White",  "Blue",  true, true, false));
        player2Cards.add(new Card("Petros",    "Black", "White",  "Brown", false,  true, false));
        player2Cards.add(new Card("Quentin",   "Blond", "Yellow", "Blue",  false,  true, false));
        player2Cards.add(new Card("Rafaela",   "Blond", "Green",  "Green", false,  true, false));
        player2Cards.add(new Card("Sabine",    "Black", "Green",  "Blue",  false,  false,  true));
        player2Cards.add(new Card("Takis",     "Brown", "Black",  "Brown", false,  true, true));
        player2Cards.add(new Card("Udo",       "Red",  "Black",  "Green", false,  true, false));
        player2Cards.add(new Card("Valentine", "Black", "Yellow", "Blue",  false,  true, false));
        player2Cards.add(new Card("Walter",    "Brown", "White",  "Blue",  true, false,  true));
        player2Cards.add(new Card("Xavier",    "Red",  "Green",  "Brown", false,  true, false));
    }

    
    public Card getPlayer1Card() {
        return player1Card;
    }
    
    public void setPlayer1Card(String name) {
        for(Card card : player1Cards){
            if(card.getName().equals(name)){
                this.player1Card = card;
                break;
            }
        }
            
    }

    public Card getPlayer2Card() {
        return player2Card;
    }

    public void setPlayer2Card(String name) {
        for(Card card : player2Cards){
            if(card.getName().equals(name)){
                this.player2Card = card;
                break;
            }
        }
    }
    
    
    public void play(int player, String input){
        
        String[] parts = input.split(":");
        String feature = parts[0];
        String option = parts[1];
        
        switch (feature) {
            case "Hair":
                choseHair(player, option);
                break;
            case "Shirt":
                choseShirt(player, option);
                break;
            case "Eyes":
                choseEyes(player, option);
                break;
            case "Glasses":
                choseGlasses(player, option);
                break;
            case "Smiling":
                choseSmiling(player, option);
                break;
            case "Hat":
                choseHat(player, option);
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
    private void choseHair(int player, String color){
        if(player == 1){
            if(player2Card.getHairColor().equals(color)){
                for(int i=0; i<this.player2Cards.size(); i++){
                    if(!(player2Cards.get(i).getHairColor().equals(color))){
                        player2Cards.remove(i);
                        i--;
                    }
                }
            }
            else{
                for(int i=0; i<this.player2Cards.size(); i++){
                    if(player2Cards.get(i).getHairColor().equals(color)){
                        player2Cards.remove(i);
                        i--;
                    }
                }
            } 
        }
        else{
            if(player1Card.getHairColor().equals(color)){
                for(int i=0; i<this.player1Cards.size(); i++){
                    if(!(player1Cards.get(i).getHairColor().equals(color))){
                        player1Cards.remove(i);
                        i--;
                    }
                }
            }
            else{
                for(int i=0; i<this.player1Cards.size(); i++){
                    if(player1Cards.get(i).getHairColor().equals(color)){
                        player1Cards.remove(i);
                        i--;
                    }
                }
            } 
        }
    }
    
     private void choseShirt(int player, String color){
         if(player == 1){
            if(player2Card.getShirtColor().equals(color)){
                for(int i=0; i<this.player2Cards.size(); i++){
                    if(!(player2Cards.get(i).getShirtColor().equals(color))){
                        player2Cards.remove(i);
                        i--;
                    }
                }
            }
            else{
                for(int i=0; i<this.player2Cards.size(); i++){
                    if(player2Cards.get(i).getShirtColor().equals(color)){
                        player2Cards.remove(i);
                        i--;
                    }
                }
            }
        }
         else{
             if(player1Card.getShirtColor().equals(color)){
                for(int i=0; i<this.player1Cards.size(); i++){
                    if(!(player1Cards.get(i).getShirtColor().equals(color))){
                        player1Cards.remove(i);
                        i--;
                    }
                }
            }
            else{
                for(int i=0; i<this.player2Cards.size(); i++){
                    if(player1Cards.get(i).getShirtColor().equals(color)){
                        player1Cards.remove(i);
                        i--;
                    }
                }
            }
         }
     }
     
     private void choseEyes(int player, String color){
         if(player == 1){
            if(player2Card.getEyesColor().equals(color)){
                for(int i=0; i<this.player2Cards.size(); i++){
                    if(!(player2Cards.get(i).getEyesColor().equals(color))){
                        player2Cards.remove(i);
                        i--;
                    }
                }
            }
            else{
                for(int i=0; i<this.player2Cards.size(); i++){
                    if(player2Cards.get(i).getEyesColor().equals(color)){
                        player2Cards.remove(i);
                        i--;
                    }
                }
            }
            
        }
         else{
            if(player1Card.getEyesColor().equals(color)){
                for(int i=0; i<this.player1Cards.size(); i++){
                    if(!(player1Cards.get(i).getEyesColor().equals(color))){
                        player1Cards.remove(i);
                        i--;
                    }
                }
            }
            else{
                for(int i=0; i<this.player1Cards.size(); i++){
                    if(player1Cards.get(i).getEyesColor().equals(color)){
                        player1Cards.remove(i);
                        i--;
                    }
                }
            } 
        }
     }
     
     private void choseGlasses(int player, String has){
         boolean bool = false;
         if(has.equals("Yes"))
             bool = true;
         if(player == 1){
            if(player2Card.isGlasses() == bool){
                for(int i=0; i<this.player2Cards.size(); i++){
                    if(!(player2Cards.get(i).isGlasses())){
                        player2Cards.remove(i);
                        i--;
                    }
                }
            }
            else{
                for(int i=0; i<this.player2Cards.size(); i++){
                    if(player2Cards.get(i).isGlasses()){
                        player2Cards.remove(i);
                        i--;
                    }
                }
            }
            
        }
         else{
            if(player1Card.isGlasses() == bool){
                for(int i=0; i<this.player1Cards.size(); i++){
                    if(!(player1Cards.get(i).isGlasses())){
                        player1Cards.remove(i);
                        i--;
                    }
                }
            }
            else{
                for(int i=0; i<this.player1Cards.size(); i++){
                    if(player1Cards.get(i).isGlasses()){
                        player1Cards.remove(i);
                        i--;
                    }
                }
            } 
        }
     }
     private void choseSmiling(int player, String has){
         boolean bool = false;
         if(has.equals("Yes"))
             bool = true;
         if(player == 1){
            if(player2Card.isSmiling() == bool){
                for(int i=0; i<this.player2Cards.size(); i++){
                    if(!(player2Cards.get(i).isSmiling())){
                        player2Cards.remove(i);
                        i--;
                    }
                }
            }
            else{
                for(int i=0; i<this.player2Cards.size(); i++){
                    if(player2Cards.get(i).isSmiling()){
                        player2Cards.remove(i);
                        i--;
                    }
                }
            }
            
        }
         else{
            if(player1Card.isSmiling() == bool){
                for(int i=0; i<this.player1Cards.size(); i++){
                    if(!(player1Cards.get(i).isSmiling())){
                        player1Cards.remove(i);
                        i--;
                    }
                }
            }
            else{
                for(int i=0; i<this.player1Cards.size(); i++){
                    if(player1Cards.get(i).isSmiling()){
                        player1Cards.remove(i);
                        i--;
                    }
                }
            } 
        }
     }
      private void choseHat(int player, String has){
         boolean bool = false;
         if(has.equals("Yes"))
             bool = true;
         if(player == 1){
            if(player2Card.isHat() == bool){
                for(int i=0; i<this.player2Cards.size(); i++){
                    if(!(player2Cards.get(i).isHat())){
                        player2Cards.remove(i);
                        i--;
                    }
                }
            }
            else{
                for(int i=0; i<this.player2Cards.size(); i++){
                    if(player2Cards.get(i).isHat()){
                        player2Cards.remove(i);
                        i--;
                    }
                }
            }
            
        }
         else{
            if(player1Card.isHat() == bool){
                for(int i=0; i<this.player1Cards.size(); i++){
                    if(!(player1Cards.get(i).isHat())){
                        player1Cards.remove(i);
                        i--;
                    }
                }
            }
            else{
                for(int i=0; i<this.player1Cards.size(); i++){
                    if(player1Cards.get(i).isHat()){
                        player1Cards.remove(i);
                        i--;
                    }
                }
            } 
        }
     }
  
}
