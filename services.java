package project;
import java.sql.SQLException;
import java.util.Scanner;

public class services{
	public static void main(String[] args) throws SQLException{
		String p="y";
		String s="y";
		String usern,passw;
		outer:while(p.equals("y")) {
			Scanner sc1= new Scanner(System.in);
			
			System.out.println("...WELCOME TO BUS TICKET  BOOKING...");
			System.out.println("please Enter the login details:");
			System.out.println("Enter Username:");
			usern =sc1.nextLine();
			System.out.println("Enter password:");
			passw =sc1.nextLine();
			
			if(usern.equals("hari") && passw.equals("hari@143"))
			{
				System.out.println("Login was successfully");
				
				while(s.equals("y")) {
					System.out.println("Select your Bus Type");
					System.out.println("press 1 to choose Ordinary bus");
					System.out.println("press 2 to choose Semi sleeper bus");
					System.out.println("press 3 to choose AC bus");
					System.out.println("press 4 to choose Non-AC bus");
					
					
					Scanner sc=new Scanner(System.in);
					int i=sc.nextInt();
					
					book bb=new book();
					
					switch(i) {
					case 1:
						bb.ordinary();
						break;
					case 2:
						bb.semisleeper();
						break;
					case 3:
						bb.acsleeper();
						break;
					case 4:
						bb.nonacsleeper();
						break;
					case 5:
						System.exit(0);
						default:
							System.out.println("Wrong Choice");
						break;
					}
						System.out.println("do you want to contine then press y/n");
						
						s=sc.next();
						if (s.equals("n"))
						{
							System.out.println("****session closed****");
							 break outer;
						}
						
					}
					
				}
			else {
				System.out.println("invalid");
				p=sc1.next();
			}
				 
			}
			
		}
}