import java.util.Scanner;
class SupplierAdd
{
public void arrayadd()
{
Scanner scan = new Scanner(System.in);
SupplierMedName smn = new SupplierMedName();
MainDesign md = new MainDesign();
String ary2[] = new String[11];
String ary3[] = new String[11];
int ary4[] = new int[11];
int ary5[] = new int[11];
int  ary6[] = new int[11];
int ary7[] = new int[11];
System.out.println('\f');
md.design();
System.out.println();
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
String ary[] = new String[11];
ary[1]="Crocin 5mg"; 
ary[2]="Beetle Cough"; 
ary[3]="Paracetamol 500mg"; 
ary[4]="Vaporub Balm"; 
ary[5]="Nizer 100mg"; 
ary[6]="Ocona Soap"; 
ary[7]="Volini Lite"; 
ary[8]="Volitile Spray"; 
ary[9]="Exils 55mg"; 
ary[10]="VinDie 100mg"; 
int r=0;
int x=0;
System.out.println("[ENTER 0 TO TERMINATE]");
System.out.println();
do
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Medicine Name: ");
ary2[r] = sc.nextLine();
if(!(ary2[r].equalsIgnoreCase("0")))
{
Scanner scan1 = new Scanner(System.in);
System.out.println("Enter its Category: ");
ary3[r] = scan1.nextLine();
Scanner scan3 = new Scanner(System.in);
System.out.println("Enter its quantity: ");
ary4[r] = scan3.nextInt(); 
Scanner scan4 = new Scanner(System.in);
System.out.println("Enter price per unit: ");
ary5[r] = scan4.nextInt();
Scanner scan5 = new Scanner(System.in);
System.out.println("Enter MRP Rate: ");
ary6[r] = scan5.nextInt();
Scanner scan6 = new Scanner(System.in);
System.out.println("Enter Sale Rate: ");
ary7[r] = scan.nextInt();
}
}while(!(ary2[r++].equalsIgnoreCase("0")));
System.out.println('\f');
md.design();
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
System.out.println(" ________________________________________________________________________________________");
System.out.println();
System.out.println("-----------------------------------NEWLY ADDED MEDICINES---------------------------------------------");
System.out.println("NO..    MEDICINE        CATEGORY      QUANTITY       PRICE/UNIT     MRP RATE/pack  SALE RATE"); 
System.out.println("-----------------------------------------------------------------------------------------------------");
int nos;
for(int i=0;i<r-1;i++)
{ 
nos = 10 - ary2[i].length(); 
for(int j=0;j<nos;j++)
{
 ary2[i]=ary2[i]+" ";
 ary3[i]=ary3[i]+" ";
}
System.out.println(" "+(i+11)+"\t"+ary2[i]+"\t"+ary3[i]+"\t "+ary4[i]+"\t     Rs. "+ary5[i]+"\t      Rs. "+ary6[i]+"     Rs. "+ary7[i]);;
System.out.println("-----------------------------------------------------------------------------------------------------");

}
System.out.println();
System.out.println();
}
}
   