import java.util.Scanner;
class Search
{
public void medsearch()
{
Scanner scan = new Scanner(System.in);
Supplier s = new Supplier();
MainDesign md = new MainDesign();
System.out.println('\f');
md.design();
System.out.println();
System.out.println("Enter the medicine name: ");
String medsea = scan.nextLine();
if(medsea.equalsIgnoreCase("Crocin 5mg"))
{
System.out.println('\f');
md.design();
System.out.println();
System.out.println(" ---------------------------------SEARCHED MEDICINE--------------------------------------");
System.out.println(" P_ID    MEDICINES       CATEGORY    QUANTITY      PRICE/UNIT   MRP RATE[/pack] SALE RATE");
System.out.println(" ________________________________________________________________________________________");
System.out.println("  1      Crocin 5mg       Tablet       50            Rs.12           Rs.60        Rs.45");
System.out.println(" ________________________________________________________________________________________");
System.out.println();
}
else if(medsea.equalsIgnoreCase("Beetle Cough"))
{
System.out.println('\f');
md.design();
System.out.println();
System.out.println(" ---------------------------------SEARCHED MEDICINE--------------------------------------");
System.out.println(" P_ID    MEDICINES       CATEGORY    QUANTITY      PRICE/UNIT   MRP RATE[/pack] SALE RATE");
System.out.println(" ________________________________________________________________________________________");
System.out.println("  2      Beetle Cough     Syrup        20            Rs.80           Rs.75        Rs.80");
System.out.println(" ________________________________________________________________________________________");
System.out.println();
}
else if(medsea.equalsIgnoreCase("Paracetamol 500mg"))
{
System.out.println('\f');
md.design();
System.out.println();
System.out.println(" ---------------------------------SEARCHED MEDICINE--------------------------------------");
System.out.println(" P_ID    MEDICINES       CATEGORY    QUANTITY      PRICE/UNIT   MRP RATE[/pack] SALE RATE");
System.out.println(" ________________________________________________________________________________________");
System.out.println("  3    Paracetamol 500mg  Tablet       120           Rs.10           Rs.65        Rs.45");
System.out.println(" ________________________________________________________________________________________");
System.out.println();
}
else if(medsea.equalsIgnoreCase("Vaporub Balm"))
{
System.out.println('\f');
md.design();
System.out.println();
System.out.println(" ---------------------------------SEARCHED MEDICINE--------------------------------------");
System.out.println(" P_ID    MEDICINES       CATEGORY    QUANTITY      PRICE/UNIT   MRP RATE[/pack] SALE RATE");
System.out.println(" ________________________________________________________________________________________");
System.out.println("  4      Vaporub Balm     Wax          10            Rs.25           Rs.30        Rs.30");
System.out.println(" ________________________________________________________________________________________");
System.out.println();
}
else if(medsea.equalsIgnoreCase("Nizer 100mg"))
{
System.out.println('\f');
md.design();
System.out.println();
System.out.println(" ---------------------------------SEARCHED MEDICINE--------------------------------------");
System.out.println(" P_ID    MEDICINES       CATEGORY    QUANTITY      PRICE/UNIT   MRP RATE[/pack] SALE RATE");
System.out.println(" ________________________________________________________________________________________");
System.out.println("  5      Nizer 100mg      Tablet       100           Rs.35           Rs.100       Rs.120");
System.out.println(" ________________________________________________________________________________________");
System.out.println();
}
else if(medsea.equalsIgnoreCase("Ocona Soap"))
{
System.out.println('\f');
md.design();
System.out.println();
System.out.println(" ---------------------------------SEARCHED MEDICINE--------------------------------------");
System.out.println(" P_ID    MEDICINES       CATEGORY    QUANTITY      PRICE/UNIT   MRP RATE[/pack] SALE RATE");
System.out.println(" ________________________________________________________________________________________");
System.out.println("  6      Ocona Soap       Soap         125           Rs.30           Rs.35        Rs.20");
System.out.println(" ________________________________________________________________________________________");
System.out.println();
}
else if(medsea.equalsIgnoreCase("Volini Lite"))
{
System.out.println('\f');
md.design();
System.out.println();
System.out.println(" ---------------------------------SEARCHED MEDICINE--------------------------------------");
System.out.println(" P_ID    MEDICINES       CATEGORY    QUANTITY      PRICE/UNIT   MRP RATE[/pack] SALE RATE");
System.out.println(" ________________________________________________________________________________________");
System.out.println("  7      Volini Lite      Cream        100           Rs.45           Rs.60        Rs.45");
System.out.println(" ________________________________________________________________________________________");
System.out.println();
}
else if(medsea.equalsIgnoreCase("Volitile Spray"))
{
System.out.println('\f');
md.design();
System.out.println();
System.out.println(" ---------------------------------SEARCHED MEDICINE--------------------------------------");
System.out.println(" P_ID    MEDICINES       CATEGORY    QUANTITY      PRICE/UNIT   MRP RATE[/pack] SALE RATE");
System.out.println(" ________________________________________________________________________________________");
System.out.println("  8    Volitile Spray     Spray        30            Rs.30           Rs.89        Rs.34");
System.out.println(" ________________________________________________________________________________________");
System.out.println();
}
else if(medsea.equalsIgnoreCase("Exils 55mg"))
{
System.out.println('\f');
md.design();
System.out.println();
System.out.println(" ---------------------------------SEARCHED MEDICINE--------------------------------------");
System.out.println(" P_ID    MEDICINES       CATEGORY    QUANTITY      PRICE/UNIT   MRP RATE[/pack] SALE RATE");
System.out.println(" ________________________________________________________________________________________");
System.out.println("  9      Exils 55mg       Syrup        40            Rs.500          Rs.670       Rs.500");
System.out.println(" ________________________________________________________________________________________");
System.out.println();
}
else if(medsea.equalsIgnoreCase("VinDie 100mg"))
{
System.out.println('\f');
md.design();
System.out.println();
System.out.println(" ---------------------------------SEARCHED MEDICINE--------------------------------------");
System.out.println(" P_ID    MEDICINES       CATEGORY    QUANTITY      PRICE/UNIT   MRP RATE[/pack] SALE RATE");
System.out.println(" ________________________________________________________________________________________");
System.out.println("  10    VinDie 100mg      Tablet       120           Rs.135          Rs.350       Rs.80");
System.out.println(" ________________________________________________________________________________________");
System.out.println();
}
else 
{
System.out.println("*********************************");
System.out.println("Sorry! Medicine is not in stock!");
System.out.println("*********************************");
System.out.println();
System.out.println("Do you want to order medicines(YES/NO)?");
String yesno = scan.next();
if(yesno.equalsIgnoreCase("Yes"))
{
System.out.println('\f');
s.Stockmanage();
}
else
System.out.println('\f');
md.design();
}
}
}