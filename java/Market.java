import java.util.*;
import java.io.*;
public class Market   {
   public static void main(String [] args) {
      try  {
          Scanner scan = new Scanner(System.in);
          HashMap<String,Integer> hmap = new HashMap<String, Integer>();
          HashMap<String,Integer> hmap1=new HashMap<String,Integer>();
          String sb=new String();int temp2=0;
          hmap.put("Rice",12);
          hmap.put("Sugar",2);
          hmap.put("chocala",7);
          hmap.put("box",49);
          hmap.put("fruits",3);
          Set set = hmap.entrySet();
          Iterator iterator1 = set.iterator();
          int temp=0,inum=0,count=0;
          while(iterator1.hasNext()) {
              Map.Entry mentry = (Map.Entry)iterator1.next();
              temp++;
              System.out.print(temp+". "+"item is: "+" - "+ mentry.getKey() + "  ");
              System.out.println("price is"+"-"+mentry.getValue()+"rs");

          }
          System.out.println("please enter name of product");
          inum=scan.nextInt();
          System.out.println("hello "+inum);
          while(iterator1.hasNext())  {
              Map.Entry mentry = (Map.Entry)iterator1.next();
              temp=temp+1;
              if(temp==inum)  {
                  System.out.println("please enter how many you want : "); 
                  count=scan.nextInt();
                  sb=(String)mentry.getKey();
                  temp2=(int)mentry.getValue();
                  hmap1.put( sb,temp2);
                  System.out.println("thank you");
             }
             else  {
                System.out.println("thank you");
             }
          }
         
       }
      catch(Exception e)  {
           e.printStackTrace();
      }
 }
}




