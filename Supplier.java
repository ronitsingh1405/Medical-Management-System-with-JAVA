import java.util.Scanner;
class Supplier
{
int suppchoice2=0;
public void Stockmanage()
{
Scanner scan = new Scanner(System.in);
SupplierMedName smn = new SupplierMedName(); 
MainDesign md = new MainDesign();
System.out.println('\f');
md.design();
System.out.println(" ____________________________________STOCK MANAGER_______________________________________");
System.out.println(" ____________________________________Stock Report________________________________________");
System.out.println(" ________________________________________________________________________________________");
System.out.println(" P_ID    MEDICINES       CATEGORY    QUANTITY      PRICE/UNIT   MRP RATE[/pack] SALE RATE");
System.out.println(" ________________________________________________________________________________________");
System.out.println("  1      Crocin 5mg       Tablet       50            Rs.12           Rs.60        Rs.45");
System.out.println("  2      Beetle Cough     Syrup        20            Rs.80           Rs.75        Rs.80");
System.out.println("  3    Paracetamol 500mg  Tablet       120           Rs.10           Rs.65        Rs.45");
System.out.println("  4      Vaporub Balm     Wax          10            Rs.25           Rs.30        Rs.30");
System.out.println("  5      Nizer 100mg      Tablet       100           Rs.35           Rs.100       Rs.120");
System.out.println("  6      Ocona Soap       Soap         125           Rs.30           Rs.35        Rs.20");
System.out.println("  7      Volini Lite      Cream        100           Rs.45           Rs.60        Rs.45");
System.out.println("  8    Volitile Spray     Spray        30            Rs.30           Rs.89        Rs.34");
System.out.println("  9      Exils 55mg       Syrup        40            Rs.500          Rs.670       Rs.500");
System.out.println("  10    VinDie 100mg      Tablet       120           Rs.135          Rs.350       Rs.80");
System.out.println("________________________________________________________________________________________");
System.out.println();
System.out.println("Purchase from supplier? YES/NO");
String suppchoice = scan.next();
System.out.println('\f');
md.design();
if(suppchoice.equalsIgnoreCase("Yes"))
{
System.out.println("_________AVAILABLE SUPPLIERS_________");
System.out.println("_____________________________________");
System.out.println("1. Glenmark Pharmacy");
System.out.println("2. Indile Pharma");
System.out.println("3. Exilien Pharmacy");
System.out.println("4. Roharta Retailers");
System.out.println("5. Glenars Retailers");
System.out.println();
System.out.println("Enter Supplier choice(1-5): ");
suppchoice2 = scan.nextInt();
switch(suppchoice2)
{
case 1:
System.out.println("________________");
System.out.println("Glenmark Pharmacy");
System.out.println("----------------");
smn.Smedname();
break;
case 2:
System.out.println("________________");
System.out.println(" Indile Pharma");
System.out.println("----------------");
smn.Smedname();
break;
case 3:
System.out.println("________________");
System.out.println("Exilien Pharmacy");
System.out.println("----------------");
smn.Smedname();
break;
case 4:
System.out.println("________________");
System.out.println("Roharta Retailers");
System.out.println("----------------");
smn.Smedname();
break;
case 5:
System.out.println("________________");
System.out.println("Glenars Retailers");
System.out.println("----------------");
smn.Smedname();
break;
default:
System.out.println("Invalid input! Please enter correct choice(1-6).");
break;
}
}
else if(suppchoice.equalsIgnoreCase("No"))
{
System.out.println("Thank you!");
System.out.println('\f');
}
}
}

