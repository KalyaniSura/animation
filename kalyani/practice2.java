import java.util.*;
import java.io.*;
class practice2
{
  public static void main(String [] args)  
  {  
     try {
          Scanner scan = new Scanner(System.in);
          String data;
          char temp='0';
          char temp1= '1';
          char temp2='2';
          char temp3= '3';
          File file= new File("receipt.txt");
           if (!file.exists()) {
			file.createNewFile();
	    }
            else  {
                 file.delete();
                  file.createNewFile();
             }     
             FileWriter fw = new FileWriter(file.getAbsoluteFile());
             BufferedWriter bw = new BufferedWriter(fw);
             System.out.println("enter which data you want to store ");
             data=scan.nextLine();
             for(int i=0;i<data.length();i++) {
                 if(data.charAt(i)=='k')  {
                     bw.write(""+temp); 
                 }
                 else if(data.charAt(i)=='l')  {
                     bw.write(""+temp1); 
                 }
                 else if(data.charAt(i)=='y')  {
                     bw.write(""+temp2); 
                 }
                 else if(data.charAt(i)=='i')  {
                     bw.write(""+temp3); 
                 }
                 else
                 {
                   bw.write(""+data.charAt(i));
                 }
             }
             
             bw.close();
         
        }
            catch(Exception e)  {
          
                e.printStackTrace();
            }

  }
}


