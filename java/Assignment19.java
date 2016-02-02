import java.io.*;
class Assignment19
{
   public static void main(String [] args)  {
      int n = 26;       
      String result = "";       
      while(n>0) {            
          int rem = n%26;            
          if(rem==0) {              
               result+=(String.valueOf((char)(96+26)));   
                n=(n/26)-1;           
          } 
         else  {
                n=(n/26);        
                result+=(String.valueOf((char)(96+rem))); 
         }
      }
      System.out.println("result is : "+result);
 }
}

