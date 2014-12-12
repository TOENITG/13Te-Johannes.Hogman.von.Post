package slutprojekt;

import java.util.*;

public class Slutprojekt {
    
    /*Här är en metod som kollar ifall det användaren har skrit in finns med i stringen
      som programmet frågar efter. Ifall det användaren skriver in inte matchar någon
      av de existerande variablerna, så kommer datorn att köra om metoden och användaren
      får försöka igen.*/
    private static boolean felhantering(String input, String[] check){
        boolean temp = true;
        for(int i = 0; i < check.length; i++){
            if(input.equalsIgnoreCase(check[i])){
                temp = false;
            }
        }
        return temp;
    }

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);

        /*Här har jag skapat två arrays som skapar spelplanen*/
        String[] KortNummer = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        String[] KortValor = {"Hearts", "Spades", "Diamonds", "Clubs"};

        /*Här har jag skapat variabeln pengar, det är denna variabel man kommer 
          använda när man satsar*/
        double pengar = 100;

        /*Här är mitt välkomstmeddelande och instruktioner*/
        System.out.println("Hello and welcome to Mr Gamble´s awsome card game!"
                + " Here are the rules: \nYou can bet as much as you want"
                + " for as long as you have the founds, you will start"
                + " with 100$ \n\nYou can bet on Hearts, Spades, Diamonds"
                + " or Clubs. You can also chose what card rank you want to bet on,\n"
                + "you can chose between Ace, Jack, Queen, King and the numbers 2-10! \n");
        
                    
            /*Här är en if-sats som frågar ifall användaren är redo att starta, 
              så fort användaren har skrivit in något kommer programmet att starta*/
        System.out.println("Enter anything when you are ready to play!");
            String Starta = user_input.nextLine();
            
            if (Starta.equalsIgnoreCase("")) {

                System.out.println("Good luck and have fun!");
            }

        /*Här under är en while loop i denna är själva spelet, loopen kommer fortsätta
          så länge som man har pengar att spela för.*/
        while (pengar > 0) {

            /*Här frågar datorn användaren vilken valör användaren vill satsa på.
              Programmet använder även metoden "felhantering" som kollar att det
              användaren har skrivit in finns med i stringen "KortValor".*/
            String Anvandare_KortValor;
            do{
                System.out.println("\nWhat card suit do you want to bet on?");
                Anvandare_KortValor = user_input.nextLine();
            }while (felhantering(Anvandare_KortValor, KortValor));
            
            /*Här frågar datorn användaren vilket kortnummer användaren vill
              satsa på, även här kallar programmet på metoden "felhantering" och
              kollar så att det användaren skrev in finns med i stringen "KortNummer"*/
            String Anvandare_KortNummer;
            do{
            System.out.println("What card rank do you want to bet on?");
            Anvandare_KortNummer = user_input.nextLine();
            }while(felhantering(Anvandare_KortNummer, KortNummer));
            
            /*Här frågar datorn användaren hur mycket den vill satsa, ifall
              användaren satsar mer än vad den har så kommer den att få skriva in
              en ny summa. Det användaren satsat dras direkt från variabeln "pengar".*/
            double KonverteradBet;
            do{
                System.out.println("How much du you want to bet?");
                String Anvandare_bet = user_input.nextLine();

            
                KonverteradBet = Double.parseDouble(Anvandare_bet);

            }while( KonverteradBet > pengar );
            pengar = pengar - KonverteradBet;

            /*Här slumpar datorn fram två olika variabler från varsin string. */
            Random RandomKort = new Random();
            String SlumpKortet = (KortNummer[RandomKort.nextInt(KortNummer.length)]);
            String SlumpValor = (KortValor[RandomKort.nextInt(KortValor.length)]);
            
            /*Här kollar datorn ifall användarens input stämmer med den slumpade
              valör variabeln. Ifall de två variablerna matchar kommer användaren 
              få tillbaka den satsade summan och den satsade summan multiplicerad med 1.25*/
            if (Anvandare_KortValor.equalsIgnoreCase(SlumpValor)) {
                double ValorVinst = KonverteradBet * 1.25;
                pengar = pengar + ValorVinst;
                System.out.println("Congratulations, you got the right card suit");
            } else {
                System.out.println("Sorry you guessed the wrong card suit");
            }
            
            /*Här kollar datorn ifall användarens input stämmer med den slumpade
              nummer variabeln. Ifall de två variablerna matchar kommer användaren 
              få tillbaka den satsade summan och den satsade summan multiplicerad med 1.5*/
            if (Anvandare_KortNummer.equalsIgnoreCase(SlumpKortet)) {
                double NummerVinst = KonverteradBet * 1.5;
                pengar = pengar + NummerVinst;
                System.out.println("Congratulations, you got the right cardnumber");
            } else {
                System.out.println("Sorry you guessed the wrong cardnumber");
            }
            
            /*Här skriver datorn ut vilka variabler den slumpade fram och vilka variabler
              användaren skrev in. Datorn skriver även ut hur mycket som variabeln "pengar"
              är värd.*/
            System.out.println("The computer drew " + SlumpKortet + " of " + SlumpValor);
            System.out.println("You guessed " + Anvandare_KortNummer + " of " + Anvandare_KortValor);
            System.out.println("You now have " + pengar + " do you want to play again?");

            /*Här frågar programmet användaren ifall den vill fortsätta spela.
              Om användaren skriver in "No" kommer datorn att skriva ut ett hejdå 
              meddelande och bryta while loopen.*/
            String Sluta = user_input.nextLine();

            if (Sluta.equalsIgnoreCase("No")) {

                System.out.println("Hope you had fun, you had " + pengar + " when you quit.");

                break;
            }
        }
    }
}
