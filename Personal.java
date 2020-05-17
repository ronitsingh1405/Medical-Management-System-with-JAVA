import java.util.Scanner;
class Personal
{
String name="";
long mob=0;
String email="";
public void details()
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter the name: ");
name = scan.nextLine();
System.out.println("Enter the mob. no: ");
mob = scan.nextLong();
System.out.println("Enter the email ID: ");
email = scan.nextLine();
}
}