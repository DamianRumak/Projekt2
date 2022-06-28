                                                              
import java.util.Scanner;                                                        
public class Main                                                           
{                                                                                
  public static void main(String[] args)                                          
 {                                                                               
  Scanner in = new Scanner(System.in);                                           
  System.out.println("podaj pierwszą liczbę:");                                  
  System.out.print("Część rzeczywista: ");                                       
  int re1 = in.nextInt();                                                        
  System.out.print("Część urojona: ");                                           
  int im1 = in.nextInt();                                                        
  System.out.println(" ");                                                       
    if ( im1 < 0 )                                                                 
  {                                                                              
   System.out.println("Wprowadzono liczbę: "+re1+" - "+ Math.abs(im1) + "i");    
  }                                                                              
  else                                                                           
  {                                                                              
   System.out.println("Wprowadzono liczbę: "+re1+" + "+im1+"i");                 
  }                                                                              
  System.out.println(" ");                                                       
  System.out.println("podaj drugą liczbę:");                                     
  System.out.print("Część rzeczywista: ");                                       
    int re2 = in.nextInt();                                                        
  System.out.print("Część urojona: ");                                           
    int im2 = in.nextInt();                                                        
  System.out.println(" ");                                                       
    if ( im2 < 0 )                                                                 
  {                                                                              
   System.out.println("Wprowadzono liczbę: "+re1+" - "+ Math.abs(im2)+"i");      
  }                                                                              
  else                                                                           
  {                                                                              
   System.out.println("Wprowadzono liczbę zespoloną: "+re1+" + "+im2+"i");       
  }                                                                              
  System.out.println(" ");                                                       
  System.out.println("Wybierz numer: ");                    System.out.println("1:dodawanie");                                          
  System.out.println("2:odejmowanie");                                          
  System.out.println("3:mnożenie");                                          
  int reW=0;                                                                     
  int imW=0;                                                                     
  int mat = in.nextInt();                                                        
    switch (mat)                                                                   
  {                                                                              
   case 1:                                                                       
  {                                                                              
   reW= re1+re2;                                                                 
   imW= im1+im2;                                                                 
   break;                                                                        
  }                                                                              
  case 2:                                                                        
  {                                                                              
   reW = re1 - re2;                                                              
   imW=im1-im2;                                                                  
   break;                                                                        
  }                                                                              
  case 3:                                                                        
  {                                                                              
   reW=re1*re2-im1*im2;                                                          
   imW=re2*im1+re1*im2;                                                          
   break;                                                                        
  }                                                                              
 }                                                                               
 if ( imW < 0 )                                                                  
 {                                                                               
  System.out.println("Wynik: "+ reW + " - "+ Math.abs(imW) +"i");                
 }                                                                               
 else                                                                            
 {                                                                               
  System.out.println("Wynik: "+ reW + " + "+ imW +"i");                          
 }                                                                               
 }                                                                               
}                  