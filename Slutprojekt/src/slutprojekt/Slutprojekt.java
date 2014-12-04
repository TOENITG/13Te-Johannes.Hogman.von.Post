package slutprojekt;
import java.util.*;

public class Slutprojekt {
    

    public static void main(String[] args) {
        
    Scanner user_input = new Scanner (System.in);
        
        
    /*Här har jag skapat två arrays som skapar spelplanen*/
        String [] KortNummer = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
        String[] KortValor = {"Hearts", "Spades", "Diamonds", "Clubs"};
        
       
        /*Här har jag skapat variabeln pengar, det är denna variabel man kommer 
        använda när man satsar*/
        double pengar = 100;
        
       
        /*Här har jag skapat en string som gör att jag kan göra en ny rad inuti
        meddelandet*/
        String NyRad = System.getProperty("line.separator");
        
        
        /*Här är mitt välkomstmeddelande och instruktioner*/
        System.out.println("Hello and welcome to Mr Gamble´s awsome card game!"
                + " Here are the rules:" + NyRad + "You can bet as much as you want"
                + " for as long as you have the founds" + NyRad + "You will start"
                + " with 100$" + NyRad + "You can bet on Hearts, Spades, Diamonds"
                + " or Clubs");
        
        
        
        while (pengar > 0) {
            
            
            System.out.println ("What card suit do you want to bet on?");
            String Anvandare_KortValor = user_input.nextLine();
                    
                    
            System.out.println("You will also have to chose a number between 1-13."
            + "1=Ace 11=Jack 12=Queen 13=King");
            String Anvandare_KortNummer = user_input.nextLine();
            
                    
            System.out.println("How much du you want to bet?");
            String Anvandare_bet = user_input.nextLine();
            
                double KonverteradBet = Double.parseDouble(Anvandare_bet);
                
                pengar = pengar-KonverteradBet;
                    
                    Random RandomKort = new Random();
                    String SlumpKortet = (KortNummer[RandomKort.nextInt(KortNummer.length)]);
                    String SlumpValor = (KortValor[RandomKort.nextInt(KortValor.length)]);
                    
                    
                    if(Anvandare_KortValor.equals(SlumpValor)){
                        double ValorVinst = KonverteradBet * 1.5;
                        pengar = pengar + ValorVinst;
                        System.out.println("Congratulations, you got the right card suit");
                    }
                    
                    else{
                        System.out.println("Sorry you guessed the wrong card suit");
                    }
                
                    if(Anvandare_KortNummer.equals(SlumpKortet)){
                        double NummerVinst = KonverteradBet * 1.5;
                        pengar = pengar + NummerVinst;
                        System.out.println("Congratulations, you got the right cardnumber");
                    }
                    
                    else{
                        System.out.println("Sorry you guessed the wrong cardnumber");
                    }
    
            System.out.println("The computer drew " + SlumpKortet + " of " + SlumpValor);
            System.out.println("You guessed " + Anvandare_KortNummer + " of " + Anvandare_KortValor);
            System.out.println("You now have " + pengar + " do you want to play again?");
                    
                    
                    
    

            
        }
    
    }
}
