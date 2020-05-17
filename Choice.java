import java.util.Scanner;
class Choice 
{
  public static void main(String args[]) 
  { 
    int choice = 0;
    Purchase p = new Purchase();
    Supplier s = new Supplier();
    MainDesign md = new MainDesign();
    LiveMain lm = new LiveMain();
    Search se = new Search();
    Scanner scan = new Scanner(System.in);
    SupplierMedName smn = new SupplierMedName();
    SupplierAdd sa = new SupplierAdd();
    md.design();
    do
    {
      System.out.println();
      System.out.println("        1. Purchase Medicines");
      System.out.println("        2. Stock Manager");
      System.out.println("        3. Buy Medicard");
      System.out.println("        4. Search");
      System.out.println("        5. Add Medicines");
      System.out.println("        6. Exit");
      System.out.println();
      System.out.println("Enter your choice(1-6): ");
      choice = scan.nextInt();
      switch (choice)
      {
      case 1: 
        System.out.println('\f');
        md.design();
        p.MedicinesSelection();
        p.amountmed();
        p.input();
        break;
      case 2: 
        s.Stockmanage();
        break;
      case 3: 
        lm.medi();
        break;
      case 4: 
        md.design();
        se.medsearch();
        break;
      case 5: 
        md.design();
        sa.arrayadd();
        break;
      case 6: 
        System.out.println("Thank you! Visit again :-) ");
        break;
      default: 
        System.out.println("Invalid input! Please enter a number between 1-5.");
      }
      } while (choice != 6);
  }
}