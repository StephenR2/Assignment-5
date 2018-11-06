import java.util.Scanner;
import java.lang.Math; 
import java.lang.String;

class PivotPhrases {
    public static void main(String[] args)
     {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the first String:");
      String phrase = scan.nextLine();
      System.out.println("Enter the pivot String:");
      String pivotphrase = scan.nextLine();
      int phraselength = phrase.length();
      int pivotlength = pivotphrase.length();
      //System.out.println(phrase.length());
      int position = 0;
      
      char first =pivotphrase.charAt(0);
      position = phrase.indexOf(first);
      System.out.println(position);
      for(int i= 1; i < pivotphrase.length(); i++){
        if (phrase.charAt(position + i) == (pivotphrase.charAt(i))){
          
          
        }
        
        
        
      }
      
      //while(position < phraselength - pivotlength){
        
        
        
        
      //}
      
      
      
      
      
      
    }
}