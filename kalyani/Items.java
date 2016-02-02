import java.util.*;
import java.io.*;
class Items  {
  public static void main(String [] args)  {
    try {
       String [] items={"pen","pencil","book","bag"};
       int [] price={4,4,10,40};
       String [] sitem=new String[items.length*10];
       int [] sprice=new int[price.length*10];
       Scanner scan = new Scanner(System.in);
       char ch; 
       int bilamt=0;
       int temp=0,temp2=0;
       do  {  
         System.out.println("enter number which item you want: ");
	 for (int i=1;i<items.length+1;i++)  {
	      System.out.println(i+" "+ items[i-1]);
	  }
	  int n = scan.nextInt();
	  bilamt=bilamt+price[n-1];
          sitem[temp++]=items[n-1];
          sprice[temp2++]=price[n-1];
          System.out.println("do you want select more item Y/N ");
          ch = scan.next().charAt(0);
     }
     while (ch == 'y');
     for(int j=0;j<sitem.length;j++) {
        System.out.println("item name: "+sitem[j]+" "+bilamt+" rupees ");
        if(sitem[j]==null)
           break;
     }
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
    bw.write(bilamt+"bill amount");
    bw.close();
  }
   catch(Exception e) {
      System.out.println(e.getMessage());
   }       
  }
}

