import java.util.*;
import java.util.Scanner;
class LoginPageM{

	public static void main(String[] args) throws Exception
	{
		String a="madhavi";
		String b="madhavi";
		String Username;
		String Password;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter username");
		Username=s.next();
		System.out.println("Enter password");
		Password=s.next();
		if((a.equals(Username))&&(b.equals(Password))){
			System.out.println("valid");
			NewMarket1 nm=new NewMarket1();
		nm.main();
		}else{
			System.out.println("invalid details");
		}

	}
}
