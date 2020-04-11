import java.util.Scanner;
public class TestMyFCStaff //class TestMyStaff
{
   static Scanner scan = new Scanner(System.in);
   public static void main (String [] args)
   {
      System.out.print("Staff's name: ");
      String name = scan.next() + scan.nextLine();
      System.out.print("Staff's ID : ");
      String id = scan.nextLine();
      System.out.print("Total hours work : ");
      int hour = scan.nextInt();
      System.out.print("Total sales per month : ");
      double sales = scan.nextDouble();
      
      MyFCStaff info = new MyFCStaff( name, id, hour, sales);
      System.out.println ("---------------------------------------");
      System.out.println (info.toString());
   }
}

class MyFCStaff // class MyFCStaff
{
     private String name, id;
     private int hour;
     private double sales, commission = 0 , salary =0;
     
     public MyFCStaff(String name,String id, int hour, double sales)
     {
         this.name=name;
         this.id = id;
         this.hour = hour;
         this.sales = sales;
     }
     
     public double calculateCommission()
     {
         if (sales >= 150 && sales <= 300)
          commission = sales * 0.05;
         else if (sales >= 301 && sales <= 500)
          commission = sales * 0.10;
         else if (sales > 500)
          commission = sales * 0.15;
          
         return commission;
      }
      
      public double calculateSalary()
      {
         double salary = (hour * 8) + calculateCommission();
         return salary;
      }
      
      public String toString()
      {
         String sname, sid, whour, ssales, ssalary;

         sname = String.format ("Staff's name : %s%n", name );
         sid = String.format ("Staff's ID   : %s%n", id );
         whour = String.format ("Total hours work : %s%n", hour );
         ssales = String.format ("Total sales      : RM %.2f%n", sales );
         ssalary = String.format ("Staff's salary   : RM %.2f", calculateSalary());
         
         return sname+sid+whour+ssales+ssalary;
      }
}
