package inlamningsuppgift;

import java.util.Scanner;

public class Inlämningsuppgift3 {
    
    static double FelHantering()
    {
    Scanner user_input = new Scanner (System.in);
    /* Här har jag skapa en metod med namnet FelHantering*/
    boolean correct;
    double tal=0;
    /* Här har jag gett variabeln "tal" ett basvärde för att Java ska kunna använda
       variablen när Java kommer fram till "return"*/
     do
        {
            try
            {
               tal = Double.parseDouble(user_input.next( ));
               correct=true;         
            }
            
            catch(NumberFormatException e)
            {
               System.out.println("Du har inte skrivit ett tal, försök igen!");
               correct=false;
            }
            /* Här har jag använt en "try and catch" metod där Java testar något
               och ifall det kommer ett visst svar tillbaka så kommer Java att 
               skriva ut en mening och börja om igen tills Java slutar få det 
               svar som Java letar efter.*/
        }
        while(!correct);
     return tal;
    }
    
    public static void main(String[] args) {
        
        System.out.println ("Skriv två tal som du vill addera");
        double tal1 = FelHantering();
        double tal2 = FelHantering();        
        double svar1 = tal1+tal2;
        System.out.println ("Addition:" + " " + svar1);
    
        /* Här har jag använt min metod "FelHantering" för att omvandla det användaren
           skriver in till variablar som man kan addera, subtrahera, multiplicera
           och dividera */
        
        System.out.println ("Skriv ett tal som du vill subtrahera svaret med");
        double tal3 = FelHantering();
        double svar2 = svar1-tal3;
        System.out.println ("Subtraktion:" + " " + svar2);
        
        /* Jag har tagit svaret från den tidigare uträkning och använt det i denna
           uträkning */
        
        System.out.println ("Skriv ett tal som du vill multiplicera svaret med");
        double tal4 = FelHantering();
        double svar3 = svar2*tal4;
        System.out.println ("Multiplikation:" + " " + svar3);
        
        System.out.println ("Skriv ett tal som du vill dividera svaret med");
        double tal5 = FelHantering();
        double svar4 = svar3/tal5;
        System.out.println ("Division:" + " " + svar4);    
    }   
}
