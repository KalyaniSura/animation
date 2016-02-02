import java.io.*;

public class practice3 {
   public static void main(String[] args) { 
       try{
         File file = new File("receipt.txt");
         int ch;
         StringBuffer strContent = new StringBuffer("");
         FileInputStream fin = new FileInputStream(file);
         while ((ch = fin.read()) != -1)
            strContent.append((char) ch);
         fin.close();
         String rdata=strContent.toString();
          System.out.println(rdata);
        
        File file1= new File("receipt1.txt");
           if (!file1.exists()) {
		file.createNewFile();
	    }
           else  {
                file1.delete();
                file1.createNewFile();
             }     
          FileWriter fw = new FileWriter("receipt1.txt");
          BufferedWriter bw = new BufferedWriter(fw);
          char tmp='k';
          char tmp1='l';
          char tmp2='y';
          char tmp3='i';
          for(int i=0;i<rdata.length();i++) {
              if(rdata.charAt(i)=='0')  {
                    bw.write(""+tmp);
              }
              else if(rdata.charAt(i)=='1')  {
		    bw.write(""+tmp1); 
	       }
	      else if(rdata.charAt(i)=='2')  {
                   bw.write(""+tmp2); 
              }
	      else if(rdata.charAt(i)=='3')  {
		    bw.write(""+tmp3); 
	      }
	      else {
		     bw.write(""+rdata.charAt(i));
	      }
            }
           // br.close();
           bw.close();

	} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
