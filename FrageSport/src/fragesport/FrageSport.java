package fragesport;

    import java.util.Scanner;

    public class FrageSport {
        
        static int points = 0;
        static Scanner user_input = new Scanner(System.in);
        
        static boolean correct(String svar) {
            boolean value = true;
            String Input = user_input.nextLine();
            
            if(Input.equalsIgnoreCase(svar)){
                System.out.println("Härligt, du gissa rätt!");
                points++;
                value = true;
            }
            
            else{
                System.out.println("Fel!");
            }
            
            return value;
        }

    public static void main(String[] args) {

    }
    
}
