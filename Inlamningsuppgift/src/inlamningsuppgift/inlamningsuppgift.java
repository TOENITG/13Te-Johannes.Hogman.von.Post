package inlamningsuppgift;

import java.util.Scanner;
 
public class inlamningsuppgift {

   
    public static void main(String[] args) {
    
        Scanner user_input = new Scanner (System.in);
        
        String name;
        System.out.println ("Vad heter du?");
        name = user_input.next();
        
        String Pnummer;
        System.out.println ("Vad är ditt personummer?");
        Pnummer = user_input.next();
        
        String addres;
        System.out.println ("Vad är din addres");
        addres = user_input.next();
        
System.out.println("Välkommen " + name + " " + "då du fyller den " + Pnummer.substring(2, 6) + " " + "kommer vi komma till dig," + addres + " " + "och fira dig!");
    }
    
}
