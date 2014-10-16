package inlamningsuppgift;

import java.util.Scanner;
 
public class inlamningsuppgift {

   
    public static void main(String[] args) {
    
        Scanner user_input = new Scanner (System.in);
        
        String name;
        System.out.println ("Vad heter du?");
        name = user_input.next();
        
        /* Här har jag bestämt att strängen blir det som användaren skriver in.
           Det gjorde jag genom att använda java.util.Scanner, den låter 
           användaren skriva in olika värden.*/
           
        
        String Pnummer;
        System.out.println ("Vad är ditt personummer?");
        Pnummer = user_input.next();
        
        String addres;
        System.out.println ("Vad är din addres");
        addres = user_input.next();
        
        /* Nedanför så anväder jag substring till att ta ut vissa siffror i 
           personnummret som användaren skriver in. */
        
        System.out.println
        ("Välkommen " + name + " " + "då du fyller den " + Pnummer.substring(2, 6) 
                + " " + "kommer vi komma till dig," + addres + " " + "och fira dig!");
    }
    
}

/*
Tack!
Du har löst uppgiften elegant.

*/
