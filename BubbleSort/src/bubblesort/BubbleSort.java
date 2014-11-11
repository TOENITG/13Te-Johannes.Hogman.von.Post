package bubblesort;
public class BubbleSort {
    
    static int[] theArray;
   
    static int randomize(int maximum){ 
        return (int)(Math.random()*maximum) + 1;
    }
        
    public static void main(String[] args){
        theArray = new int[101];
        for (int a=0;a<101;a++){
            theArray[a] = randomize(100);
        }
        
        System.out.println();   
        PrintTheArray(theArray);
        
        theArray = BubbleSort(theArray);
        System.out.println();   
        PrintTheArray(theArray);
    }
    
    public static int[] BubbleSort(int[] num){
    boolean swapped = true;   
    int temp;   

    while (swapped)
    {
    
    swapped = false;    
    for(int a=0; a < num.length -1; a++)
    {
        if (num[a] < num[a+1])   
        {
        temp = num[a];                
        num[a] = num[a+1];
        num[a+1] = temp;
        swapped = true;              
        } 
      } 
    }
    return num; 
    }

    static void PrintTheArray(int[] ArraytoPrint){
        for(int i=0;i<100;i++){
            if (i % 10 == 0) System.out.println();
            System.out.format("%4d ",ArraytoPrint[i]);
        }        
    }
}