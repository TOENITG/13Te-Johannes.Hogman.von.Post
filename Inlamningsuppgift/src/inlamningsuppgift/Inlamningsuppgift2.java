package inlamningsuppgift;

import java.util.Scanner;

    public class Inlamningsuppgift2 {
    
    public static void main(String[] args) {

        Scanner user_input = new Scanner (System.in);
        
        String First_name;
        System.out.println ("Vad heter du i förnamn?");
        First_name = user_input.next();
        
        System.out.println
        ("Hej " + First_name);
        
        String Family_name;
        System.out.println ("Vad heter du efternamn?");
        Family_name = user_input.next();
        
        System.out.println
        ("Hej " + First_name + " " + Family_name);
        
        String Age;
        System.out.println ("Hur gammal är du?");
        Age = user_input.next();
        
        System.out.println
        ("Hej " + First_name + " " + Family_name + " " + "du är " + Age + 
         " År gammal");
        
        String Location;
        System.out.println ("Var bor du?");
        Location = user_input.next();
        
        System.out.println
        ("Hej " + First_name + " " + Family_name + " " + "du är " + Age + 
         " År gammal" + " och bor i " + Location);
        
        String Phone_number;
        System.out.println ("Vad är ditt telefonnummer?");
        Phone_number = user_input.next();
        
        System.out.println
        ("Hej " + First_name + " " + Family_name + " " + "du är " + Age + 
         " År gammal" + ", bor i " + Location + " och ditt telefonnummer är " 
         + Phone_number);
        
        /* Jag har skrivit en sträng för varje fråga, jag har även kodat så att 
        det tidigare svaret finns med när nästa fråga kommer */
    
        }
    }
    
/*

Tack!

Kul variant med frågor, så att du får en mening av det.

*/
