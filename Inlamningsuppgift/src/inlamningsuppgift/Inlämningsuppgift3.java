package inlamningsuppgift;

import java.util.Scanner;

public class Inlämningsuppgift3 {
    
    public static void main(String[] args) {
        
        Scanner user_input = new Scanner (System.in);
        
        System.out.println ("Skriv två tal som du vill addera");
        double tal1 = Double.parseDouble(user_input.next());
        double tal2 = Double.parseDouble(user_input.next());        
        double svar1 = tal1+tal2;
        System.out.println ("Addition:" + " " + svar1);
    
        System.out.println ("Skriv ett tal som du vill subtrahera svaret med");
        double tal3 = Double.parseDouble(user_input.next());
        double svar2 = svar1-tal3;
        System.out.println ("Subtraktion:" + " " + svar2);
        
        System.out.println ("Skriv ett tal som du vill multiplicera svaret med");
        double tal4 = Double.parseDouble(user_input.next());
        double svar3 = svar2*tal4;
        System.out.println ("Multiplikation:" + " " + svar3);
        
        System.out.println ("Skriv ett tal som du vill dividera svaret med");
        double tal5 = Double.parseDouble(user_input.next());
        double svar4 = svar3/tal5;
        System.out.println ("Division:" + " " + svar4);    
    }   
}
