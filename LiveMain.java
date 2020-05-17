import java.util.Scanner;
class LiveMain
{
double dis = 0.0;
public void medi()
{
Scanner scan = new Scanner(System.in);
Purchase p = new Purchase();
MainDesign md = new MainDesign();
double sum=p.sum;
//double total=p.total;
System.out.println('\f');
md.design();
System.out.println();
System.out.println("Use MediCard to avail 5%, 10%, 15% cashback on your next transaction !");
System.out.println("_______________MEDICARD_______________");
System.out.println("______________________________________");
System.out.println(" SILVER        GOLDEN       PLATINUM");
System.out.println("   5%            10%          15%   ");
System.out.println(" Rs.100        Rs.250        Rs.350 ");
System.out.println("______________________________________");
System.out.println();
System.out.println("Enter the type of MediCard you want to buy: ");
String medicard = scan.next();
if(medicard.equalsIgnoreCase("Silver"))
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the name: ");
String name = s.nextLine();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the mob. no: ");
long mob = sc.nextLong();
System.out.println("Enter the email ID: ");
Scanner sca = new Scanner(System.in);
String email = sca.nextLine();
Scanner s1 = new Scanner(System.in);
System.out.println("Enter your Account No.: ");
String acc = s1.next();
System.out.println('\f');
md.design();
System.out.println();
System.out.println("__________________SILVER MEDICARD________________");
System.out.println("    Name: "+name);             
System.out.println("    Mob. No.: "+mob);
System.out.println("    Email ID: "+email);        
System.out.println("    Acc. No: "+acc);
System.out.println("_________________________________________________");
System.out.println("                 Total : Rs.100                     ");
System.out.println("-------------------------------------------------");
System.out.println("       Get 5% cashback on your next purchase!");
System.out.println("-------------------------------------------------");
System.out.println();
}
else if(medicard.equalsIgnoreCase("Golden"))
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the name: ");
String name = s.nextLine();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the mob. no: ");
long mob = sc.nextLong();
Scanner sca = new Scanner(System.in);
System.out.println("Enter the email ID: ");
String email = sca.nextLine();
Scanner s1 = new Scanner(System.in);
System.out.println("Enter your Account No.: ");
int acc2 = s1.nextInt();
System.out.println('\f');
md.design();
System.out.println();
System.out.println("__________________GOLDEN MEDICARD________________");
System.out.println("    Name: "+name);             
System.out.println("    Mob. No.: "+mob);
System.out.println("    Email ID: "+email);        
System.out.println("    Acc. No: "+acc2);
System.out.println("_________________________________________________");
System.out.println("                 Total : Rs.250                     ");
System.out.println("-------------------------------------------------");
System.out.println("       Get 10% cashback on your next purchase!");
System.out.println("-------------------------------------------------");
System.out.println();
}
else if(medicard.equalsIgnoreCase("Platinum"))
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the name: ");
String name = s.nextLine();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the mob. no: ");
long mob = sc.nextLong();
Scanner sca = new Scanner(System.in);
System.out.println("Enter the email ID: ");
String email = sca.nextLine();
Scanner s1 = new Scanner(System.in);
System.out.println("Enter your Account No.: ");
int acc3 = s1.nextInt();
System.out.println('\f');
md.design();
System.out.println();
System.out.println("__________________PLATINUM MEDICARD_______________");
System.out.println("    Name: "+name);             
System.out.println("    Mob. No.: "+mob);
System.out.println("    Email ID: "+email);        
System.out.println("    Acc. No: "+acc3);
System.out.println("_________________________________________________");
System.out.println("                 Total : Rs.350                     ");
System.out.println("-------------------------------------------------");
System.out.println("     Get 15% cashback on your next purchase!");
System.out.println("-------------------------------------------------");
System.out.println();
}
else
System.out.println("Invalid! Choose one option among SILVER/GOLDEN/PLATINUM.");
}
}
