import java.io.*;
import java.util.*;
 class FileStreamsReadnWrite {
       public static void main(String[] args) {
              try {
                     File stockInputFile = new File("stockIn.txt");
                     File StockOutputFile = new File("StockOut.txt");

                     /*
                      * Constructor of FileInputStream throws FileNotFoundException if
                      * the argument File does not exist.
                      */

                     FileInputStream fis = new FileInputStream(stockInputFile);
                     FileOutputStream fos = new FileOutputStream(StockOutputFile);
                     int count;

                     while ((count = fis.read()) != -1) {
                           fos.write(count);
                     }
                     fis.close();
                     fos.close();
              } catch (FileNotFoundException e) {
                     System.err.println("FileStreamsReadnWrite: " + e);
              } catch (IOException e) {
                     System.err.println("FileStreamsReadnWrite: " + e);
              }
       }
}



