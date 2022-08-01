package project;
import java.util.Scanner; 
import java.sql.*;

public class book{
public Connection getconn()
{
Connection con = null;
try
{
String url= "jdbc:mysql://localhost:3306/proj";
String username="root";
String pass="root";
con = DriverManager.getConnection(url,username,pass);
}
catch(Exception e)
{
e.printStackTrace();
}
return con;
}


Scanner sc1 = new Scanner(System.in);



public void acsleeper() throws SQLException {
	try {
System.out.println("***Please enter User details***");
Connection con = getconn();
String s1 = "insert into acsleeper(name,phoneno,starting_point,destination_point,seatno) values(?,?,?,?,?)";
PreparedStatement stmt = con.prepareStatement(s1);


            System.out.println("Enter User Name:");
            String name =sc1.nextLine();
            System.out.println("Enter User phoneno:");
            String phoneno =sc1.nextLine();
            int pn=Integer.parseInt(phoneno);
            System.out.println("Enter your Starting point");
            String strt=sc1.nextLine();
            System.out.println("Enter your destination point");
            String des=sc1.nextLine();
            System.out.println("Enter User seatno");
            String seatno = sc1.nextLine();
            int seat=Integer.parseInt(seatno);
              
      stmt.setString(1,name);
	  stmt.setInt(2,pn);
	  stmt.setString(3,strt);
	  stmt.setString(4,des);
	  stmt.setInt(5,seat);
	  
      int a = stmt.executeUpdate();
      System.out.println("***Slot booked***");
      
}catch(Exception e) {
	System.out.println("***already booked***");
}
}
public void nonacsleeper() throws SQLException {
	try {
System.out.println("***Please enter User details***");
Connection con = getconn();
String s1 = "insert into acsleeper(name,phoneno,starting_point,destination_point,seatno) values(?,?,?,?,?)";
PreparedStatement stmt = con.prepareStatement(s1);


            System.out.println("Enter User Name:");
            String name =sc1.nextLine();
            System.out.println("Enter User phoneno:");
            String phoneno =sc1.nextLine();
            int pn=Integer.parseInt(phoneno);
            System.out.println("Enter your Starting point");
            String strt=sc1.nextLine();
            System.out.println("Enter your destination point");
            String des=sc1.nextLine();
            System.out.println("Enter User seatno");
            String seatno = sc1.nextLine();
            int seat=Integer.parseInt(seatno);
              
      stmt.setString(1,name);
	  stmt.setInt(2,pn);
	  stmt.setString(3,strt);
	  stmt.setString(4,des);
	  stmt.setInt(5,seat);
	  
      int a = stmt.executeUpdate();
      System.out.println("***Slot booked***");
      
}catch(Exception e) {
	System.out.println("***already booked***");
}
}
public void ordinary() throws SQLException {
	try {
System.out.println("***Please enter User details***");
Connection con = getconn();
String s1 = "insert into acsleeper(name,phoneno,starting_point,destination_point,seatno) values(?,?,?,?,?)";
PreparedStatement stmt = con.prepareStatement(s1);


            System.out.println("Enter User Name:");
            String name =sc1.nextLine();
            System.out.println("Enter User phoneno:");
            String phoneno =sc1.nextLine();
            int pn=Integer.parseInt(phoneno);
            System.out.println("Enter your Starting point");
            String strt=sc1.nextLine();
            System.out.println("Enter your destination point");
            String des=sc1.nextLine();
            System.out.println("Enter User seatno");
            String seatno = sc1.nextLine();
            int seat=Integer.parseInt(seatno);
              
      stmt.setString(1,name);
	  stmt.setInt(2,pn);
	  stmt.setString(3,strt);
	  stmt.setString(4,des);
	  stmt.setInt(5,seat);
	  
      int a = stmt.executeUpdate();
      System.out.println("***Slot booked***");
      
}catch(Exception e) {
	System.out.println("***already booked***");
}
}
public void semisleeper() throws SQLException {
	try {
System.out.println("***Please enter User details***");
Connection con = getconn();
String s1 = "insert into acsleeper(name,phoneno,starting_point,destination_point,seatno) values(?,?,?,?,?)";
PreparedStatement stmt = con.prepareStatement(s1);


            System.out.println("Enter User Name:");
            String name =sc1.nextLine();
            System.out.println("Enter User phoneno:");
            String phoneno =sc1.nextLine();
            int pn=Integer.parseInt(phoneno);
            System.out.println("Enter your Starting point");
            String strt=sc1.nextLine();
            System.out.println("Enter your destination point");
            String des=sc1.nextLine();
            System.out.println("Enter User seatno");
            String seatno = sc1.nextLine();
            int seat=Integer.parseInt(seatno);
              
      stmt.setString(1,name);
	  stmt.setInt(2,pn);
	  stmt.setString(3,strt);
	  stmt.setString(4,des);
	  stmt.setInt(5,seat);
	  
      int a = stmt.executeUpdate();
      System.out.println("***Slot booked***");
      
}catch(Exception e) {
	System.out.println("***already booked***");
}
}
}
