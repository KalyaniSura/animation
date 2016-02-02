import java.util.*;
import java.io.*;
class SuperMarket
{
	public static void main(String [] args) 
	{
	     try {

		 //scanning items 
		 String [] items={"pen","pencil","book","bag"};
                 int [] price={4,4,10,40};
                 String [] sitem=new String[items.length];
                 int [] sprice=new int[price.length];
                 int [] citems=new int[items.length];
                 Scanner scan = new Scanner(System.in);
                 char ch; 
                 int bilamt=0,count=0;
              
                 String []  usernames={"kalyani","harindra","Lakshmi"};
                 String [] password={"123","234","345"};
		 String uname;
                 String pwd;
		 System.out.println("enter login name :  ");
		 uname=scan.nextLine();
                 int temp=0,temp2=0,temp3=0;
                 for(int i=0;i<usernames.length;i++)  {
                     if(usernames[i].equals(uname)) {  
                          System.out.println("username is matched " );      
		          System.out.println("please enter password :  ");
		          pwd=scan.nextLine();
                          if(password[i].equals(pwd)) {
                              System.out.println("password is matched " );
                             do  {
                                   System.out.println("please select item from the list : ");
	                           for (int k=1;k<items.length+1;k++)  {
	                           System.out.println(k+" "+ items[k-1]);
	                           }
	                          int n = scan.nextInt();
                                  System.out.println("please enter how many items you want");
                                  count=scan.nextInt();
                                  citems[temp3++]=count;
	                          bilamt=bilamt+price[n-1]*count;
                                  sitem[temp++]=items[n-1];
                                  sprice[temp2++]=price[n-1];
                                  System.out.println("do you want select more item Y/N ");
                                  ch = scan.next().charAt(0); 
                            }
                            while (ch == 'y');
                          }
                         else  {
                              System.out.println("password is not matched");
                         }
                         break;
                     }
                     
                               
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
        
                  
                 for(int j=0;j<sitem.length;j++) {
                     System.out.println(" item name: "+sitem[j]+"count of items : "+citems[j]+" cost for one item :  "+sprice[j]+" rupees ");
                     
                     bw.write("\nitem is : "+sitem[j]+"  count of items : "+citems[j] + " cost for one item : "+sprice[j]+"rupees");
                     if(sitem[j+1]==null)
                     break;
                  }
	
                 bw.write("\n bill amount : "+bilamt+"rupees");
                 bw.close();
               System.out.println("\n bill amount : "+bilamt+"rupees");

            }
            catch(Exception e)  {
          
                e.printStackTrace();
            }
	}
}
