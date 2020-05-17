import java.util.Scanner;
class SupplierMedName
{
public static void Smedname()
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter your name: ");
String a = scan.nextLine();
System.out.println("Enter your shop name: ");
String b = scan.nextLine();
System.out.println("Enter the address: ");
String c = scan.nextLine();
System.out.println("Mobile No: ");
long d = scan.nextLong();
Scanner scan2 = new Scanner(System.in);
System.out.println("Enter medicine name: ");
String mediname = scan2.nextLine();
System.out.println("Enter its quantity: ");
int suppqty = scan.nextInt();
System.out.println("-------------------------------------------------------------------");
System.out.println("Thank You for shopping from us! Your orders will be delivered soon!");
System.out.println("----------------------------REPORT---------------------------------");
System.out.println("        NAME : "+a                                             );
System.out.println("        SHOP NAME : "+b                                        );
System.out.println("        ADDRESS : "+c                                          );
System.out.println("        MOBILE NO. : "+d);
System.out.println("        MEDICINE NAME : "+mediname                             );
System.out.println("        QUANTITY : "+suppqty                                   );
System.out.println("--------------------------------------------------------------");
System.out.println("______________________________________________________________");
}
}
