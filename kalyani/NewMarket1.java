import java.util.Scanner;
import java.io.*;
public class NewMarket1{
static int choice = 1;
       static int subtotal = 0;
	   static int subtotal1 = 0;
	   static int finalamount=0;
       static int price = 0;
   void main() throws Exception {
        Scanner input = new Scanner(System.in);
    do {   
        System.out.println("MenuList");
        System.out.println("\n");
        System.out.println("1.Apples");
        System.out.println("2.Oranges");
        System.out.println("3.Chocolate Bar");
		System.out.println("4.Icecreams");
        System.out.println("5.DairyMilk");
        System.out.println("6.Noodles");
        System.out.println("");
        System.out.println("if you want to Quit press 0");
        System.out.println("");
        System.out.println("What do you want?");
            choice = input.nextInt();
	
			
    if (choice == 0)
        break;   
      System.out.println("How many do you want?");
        int qty = input.nextInt();
        switch (choice)    {
            case 1:
			case 2:
			case 4:
		   int  price=40;
			subtotal=(qty*price);
			System.out.println("The subtotal is:"+subtotal);
			break;
			 case 3:
		     case 5:
			 case 6:
				 int price1=50;
				 subtotal1=(qty*price1);
			 System.out.println("The subtotal1 is:"+subtotal1);
			 break;
        } 
		
		finalamount=subtotal+subtotal1;
		  
		  System.out.println("the finalamount is:"+finalamount);
		}
        while(choice > 0);
         PrintBill();
    }
	public static void PrintBill(){
try{

PrintWriter bw = new PrintWriter("E:\\supermarket1\\junnu.txt");
bw.println(subtotal);
bw.println(subtotal1);
bw.println(finalamount);
bw.flush();
bw.close();
String path="E:\\supermarket1\\junnu.txt";
Runtime rt=Runtime.getRuntime();
Process p=rt.exec(" notepad " +path);


}catch(IOException e){
e.printStackTrace();

System.out.println(e);
}
}
}
