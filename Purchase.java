import java.util.Scanner;
class Purchase 
{
  MainDesign md = new MainDesign();
  LiveMain lm = new LiveMain();
  double sum = 0.0D;
  double[] total = new double[11];
  double[] tax = new double[11];
  int t = 0;
  double sum2 = 0.0D;
  int nos;
  int[] pid = new int[11];
  int[] qty = new int[11];
  int[] qty2 = new int[11];
  int num = 0;
  int x = 0;
  int[] pid2 = new int[11];
  String[] n = new String[11];
  public void MedicinesSelection() 
  {
    System.out.println(" ----------------------------------------------------------------------------------------");
    System.out.println(" __________________________________AVAILABLE MEDICINES___________________________________");
    System.out.println(" ________________________________________________________________________________________");
    System.out.println(" P_ID    MEDICINES       CATEGORY    QUANTITY      PRICE/UNIT   MRP RATE[/pack] SALE RATE");
    System.out.println(" ________________________________________________________________________________________");
    System.out.println(" 1      Crocin 5mg       Tablet       50            Rs.12           Rs.60        Rs.45");
    System.out.println(" 2      Beetle Cough     Syrup        20            Rs.80           Rs.75        Rs.80");
    System.out.println(" 3    Paracetamol 500mg  Tablet       120           Rs.10           Rs.65        Rs.45");
    System.out.println(" 4      Vaporub Balm     Wax          10            Rs.25           Rs.30        Rs.30");
    System.out.println(" 5      Nizer 100mg      Tablet       100           Rs.35           Rs.100       Rs.120");
    System.out.println(" 6      Ocona Soap       Soap         125           Rs.30           Rs.35        Rs.20");
    System.out.println(" 7      Volini Lite      Cream        100           Rs.45           Rs.60        Rs.45");
    System.out.println(" 8    Volitile Spray     Spray        30            Rs.30           Rs.89        Rs.34");
    System.out.println(" 9      Exils 55mg       Syrup        40            Rs.500          Rs.670       Rs.500");
    System.out.println(" 10    VinDie 100mg      Tablet       120           Rs.135          Rs.350       Rs.80");
    System.out.println(" ________________________________________________________________________________________");
    System.out.println();
    java.util.Scanner scan = new java.util.Scanner(System.in);
    java.util.Scanner scan1 = new java.util.Scanner(System.in);
    java.util.Scanner scan2 = new java.util.Scanner(System.in);
    int i = 0;
    System.out.println("[ENTER 0 TO TERMINATE]");
    System.out.println();
    do
    {
      System.out.println("Enter Medicine P_ID: ");
      pid[i] = scan1.nextInt();
      if (pid[i] > 10)
      {
        System.out.println("P_ID : " + pid[i] + " Medicine not available!");
      }
      else if (pid[i] <= 10)
      {
        pid2[x] = pid[i];
        
        if (pid[i] != 0)
        {
          System.out.println("Enter its quantity: ");
          qty[(x++)] = scan2.nextInt();
        }
      }
    } while (pid[(i++)] != 0);
    num = x;
  }
  public void amountmed() 
  { 
      for (int i = 0; i < num; i++)
    {
      if (pid2[i] == 1) {
        total[i] = (12 * qty[i]);
      } else if (pid2[i] == 2) {
        total[i] = (80 * qty[i]);
      } else if (pid2[i] == 3) {
        total[i] = (10 * qty[i]);
      } else if (pid2[i] == 4) {
        total[i] = (25 * qty[i]);
      } else if (pid2[i] == 5) {
        total[i] = (35 * qty[i]);
      } else if (pid2[i] == 6) {
        total[i] = (30 * qty[i]);
      } else if (pid2[i] == 7) {
        total[i] = (45 * qty[i]);
      } else if (pid2[i] == 8) {
        total[i] = (30 * qty[i]);
      } else if (pid2[i] == 9) {
        total[i] = (500 * qty[i]);
      } else if (pid2[i] == 10)
        total[i] = (135 * qty[i]);
    }
    for (int i = 0; i < qty.length; i++)
    {
      if ((qty[i] > 0) && (qty[i] <= 10)) {
        tax[i] = (total[i] * 2.0D / 100.0D);
      } else if ((qty[i] > 10) && (qty[i] <= 20)) {
        tax[i] = (total[i] * 5.0D / 100.0D);
      } else if ((qty[i] > 20) && (qty[i] <= 35)) {
        tax[i] = (total[i] * 8.0D / 100.0D);
      } else if (qty[i] > 35)
        tax[i] = (total[i] * 10.0D / 100.0D);
      sum = (sum + total[i] + tax[i]);
    }
  }
  
  public void disp() 
  {
    for (int i = 0; i < pid2.length; i++)
    {
      if (pid2[i] == 1)
        n[i] = "Crocin 5mg";
      if (pid2[i] == 2)
        n[i] = "Beetle Cough";
      if (pid2[i] == 3)
        n[i] = "Paracetamol 500mg";
      if (pid2[i] == 4)
        n[i] = "Vaporub Balm";
      if (pid2[i] == 5)
        n[i] = "Nizer 100mg";
      if (pid2[i] == 6)
        n[i] = "Ocona Soap";
      if (pid2[i] == 7)
        n[i] = "Volini Lite";
      if (pid2[i] == 8)
        n[i] = "Volitile Spray";
      if (pid2[i] == 9)
        n[i] = "Exils 55mg";
      if (pid2[i] == 10)
        n[i] = "VinDie 100mg";
    }
  }
  
  public void input() 
  {
    disp();
    java.util.Scanner scan4 = new java.util.Scanner(System.in);
    System.out.println("Enter customer name: ");
    String name = scan4.nextLine();
    java.util.Scanner scan6 = new java.util.Scanner(System.in);
    System.out.println("Enter your email id: ");
    String e = scan6.nextLine();
    java.util.Scanner scan5 = new java.util.Scanner(System.in);
    System.out.println("Enter mobile number: ");
    long mobno = scan5.nextLong();
    System.out.println('\f');
    java.util.Date date = new java.util.Date();
    System.out.println("________________________________MEDICINE BILL________________________________________________________");
    System.out.println("_____________________________________________________________________________________________________");
    System.out.println("_____________________________LIVE 100 PHARMACY_______________________________________________________");
    System.out.println("____________________Electronic City PH - II, opp. SFS School_________________________________________");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    System.out.println("DATE : " + date);
    System.out.println("PATIENT NAME : " + name);
    System.out.println("EMAIL ID : " + e);
    System.out.println("MOB.NO. : " + mobno);
    System.out.println("No. of medicines: " + num);
    System.out.println("_____________________________________________________________________________________________________");
    System.out.println("_____________________________________________________________________________________________________");
    System.out.println("\tNO..       MEDICINE             QTY        TAX            TOTAL           AMOUNT");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    for (int i = 0; i < num; i++)
    {
      nos = (22 - n[i].length());
      for (int j = 0; j < nos; j++)
      {
        n[i] = (n[i] + " ");
      }
      System.out.println("\t" + (i + 1) + "\t" + n[i] + "\t" + qty[i] + "\t Rs. " + tax[i] + "\t Rs. " + total[i] + "\t Rs. " + (total[i] + tax[i]));
      System.out.println("-----------------------------------------------------------------------------------------------------");
    }
    
    System.out.println("-----------------------------------------------------------------------------------------------------");
    System.out.println("-----------------------------------------------------------------------------------------------------");
    System.out.println("             TOTAL : Rs." + (int)sum);
    System.out.println("-----------------------------------------------------------------------------------------------------");
    java.util.Scanner scan7 = new java.util.Scanner(System.in);
    System.out.println();
    System.out.println("Have you got Medicard(YES/NO)?");
    String m = scan7.next();
    System.out.println('\f');
    if (m.equalsIgnoreCase("Yes"))
    {
      md.design();
      System.out.println();
      System.out.println("Use MediCard to avail 5%, 10%, 15% cashback on your transaction now!");
      System.out.println("Enter the type of medicard you have[SILVER/GOLDEN/PLATINUM]: ");
      String med = scan4.next();
      System.out.println('\f');
      if (med.equalsIgnoreCase("SILVER"))
      {
        System.out.println();
        System.out.println("________________________________MEDICINE BILL________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println("_____________________________LIVE 100 PHARMACY_______________________________________________________");
        System.out.println("____________________Electronic City PH - II, opp. SFS School_________________________________________");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("DATE : " + date);
        System.out.println("PATIENT NAME : " + name);
        System.out.println("EMAIL ID : " + e);
        System.out.println("MOB.NO. : " + mobno);
        System.out.println("No. of medicines: " + num);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println("\tNO..       MEDICINE             QTY        TAX           TOTAL          AMOUNT");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < num; i++)
        {
          nos = (22 - n[i].length());
          for (int j = 0; j < nos; j++)
          {
            n[i] = (n[i] + " ");
          }
          System.out.println("\t" + (i + 1) + "\t" + n[i] + "\t" + qty[i] + "\t Rs. " + tax[i] + "\t Rs. " + total[i] + "\t Rs. " + (total[i] + tax[i]));
          System.out.println("-----------------------------------------------------------------------------------------------------");
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("             TOTAL : Rs." + (int)sum);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println();
        double x1 = sum * 5.0D / 100.0D;
        System.out.println("TOTAL BILL AFTER DEDUCTION(5% cashback by using Silver medicard): Rs." + sum + "-" + x1 + ":" + (int)(sum - x1));
        System.out.println("_____________________________________________________________________________________________________");
      }
      else if (med.equalsIgnoreCase("GOLDEN"))
      {
        System.out.println();
        System.out.println("________________________________MEDICINE BILL________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println("_____________________________LIVE 100 PHARMACY_______________________________________________________");
        System.out.println("____________________Electronic City PH - II, opp. SFS School_________________________________________");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("DATE : " + date);
        System.out.println("PATIENT NAME : " + name);
        System.out.println("EMAIL ID : " + e);
        System.out.println("MOB.NO. : " + mobno);
        System.out.println("No. of medicines: " + num);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println("\tNO..       MEDICINE             QTY        TAX           TOTAL          AMOUNT");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < num; i++)
        {
          nos = (22 - n[i].length());
          for (int j = 0; j < nos; j++)
          {
            n[i] = (n[i] + " ");
          }
          System.out.println("\t" + (i + 1) + "\t" + n[i] + "\t" + qty[i] + "\t Rs. " + tax[i] + "\t Rs. " + total[i] + "\t Rs. " + (total[i] + tax[i]));
          System.out.println("-----------------------------------------------------------------------------------------------------");
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("             TOTAL : Rs." + (int)sum);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println();
        double y = sum * 10.0D / 100.0D;
        System.out.println("TOTAL BILL AFTER DEDUCTION(10% cashback by using Golden medicard): Rs." + sum + "-" + y + ": Rs. " + (int)(sum - y));
        System.out.println("______________________________________________________________________________________________________");
      }
      else if (med.equalsIgnoreCase("PLATINUM"))
      {
        System.out.println();
        System.out.println("________________________________MEDICINE BILL________________________________________________________");
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println("_____________________________LIVE 100 PHARMACY_______________________________________________________");
        System.out.println("____________________Electronic City PH - II, opp. SFS School_________________________________________");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("DATE : " + date);
        System.out.println("PATIENT NAME : " + name);
        System.out.println("EMAIL ID : " + e);
        System.out.println("MOB.NO. : " + mobno);
        System.out.println("No. of medicines: " + num);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println("\tNO..       MEDICINE             QTY        TAX           TOTAL          AMOUNT");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < num; i++)
        {
          nos = (22 - n[i].length());
          for (int j = 0; j < nos; j++)
          {
            n[i] = (n[i] + " ");
          }
          System.out.println("\t" + (i + 1) + "\t" + n[i] + "\t" + qty[i] + "\t Rs. " + tax[i] + "\t Rs." + total[i] + "\t Rs." + (total[i] + tax[i]));
          System.out.println("-------------------------------------------------------------------------------------------------------");
        }
        

        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("             TOTAL : Rs." + (int)sum);
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println();
        double z = sum * 15.0D / 100.0D;
        System.out.println("TOTAL BILL AFTER DEDUCTION(15% cashback by using Platinum medicard): Rs." + sum + "-" + z + ": Rs." + (int)(sum - z));
        System.out.println("_______________________________________________________________________________________________________");
      }
    }
    else if (m.equalsIgnoreCase("No"))
    {
      md.design();
      System.out.println();
      System.out.println("Enter choice 3 below if you want to buy medicard!");
    }
    else
    {
      System.out.println("---------------------------");
      System.out.println("That was an Invalid input!");
      System.out.println("---------------------------");
    }
  }
}