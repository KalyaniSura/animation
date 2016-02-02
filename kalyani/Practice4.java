import java.io.*;

public class Practice4 {
      public static void main(String[] args) throws IOException{
         File file = new File("receipt.txt");
         int ch;
         StringBuffer strContent = new StringBuffer("");
         FileInputStream fin = null;
       //  String[] a = null; // I want to store the contens of file into this String a....??
         try {
          fin = new FileInputStream(file);
          while ((ch = fin.read()) != -1)
            strContent.append((char) ch);
          fin.close();
        } catch (Exception e) {
          System.out.println(e);
        }
           String str=strContent.toString();
          System.out.println(str);
        }
}

