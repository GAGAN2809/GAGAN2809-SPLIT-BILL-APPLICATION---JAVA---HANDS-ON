import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class TotalAmount
{
       
        public double total(HashMap<String,Integer> map1)
        {
            System.out.println(" ");
            double amount=0;
            for (Integer value : map1.values()) 
            {
                amount = amount + value;
            }
                        return amount;

        }

          
}

class purposeAmount extends TotalAmount
{
    public HashMap<String,Integer> amountSpent(HashMap<String,Integer> map1,double y)

    {
        System.out.println(" ");
        System.out.println("AMOUNT SPENT: ");
        System.out.println(" ");

        int i=0;
         for (Map.Entry<String, Integer> entry : map1.entrySet()) 
         {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(++i +". " + key +" : "+ value);
        }
        
        System.out.println("Total Amount Spent= "+ y);
        return map1; 
        
    }
}






public class SPlitBill

{
    public void addPersons(ArrayList<String> arr,Scanner sc)
    {
        System.out.print("Enter Total No. Persons you are sharing the bill: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println(" ");

        System.out.println("Enter "+a+" Person's Name: ");
        System.out.println(" ");

        
        for(int i=0;i<a;i++)
        {
            
            System.out.print("Enter "+ (i+1) +"." +" Person's Name: ");
            arr.add(sc.nextLine());
 
        }
        System.out.println(" ");
    }



    public HashMap<String,Integer> addPurpose(HashMap<String,Integer> map1, Scanner sc)
    {
        System.out.print("Enter Total No. Puposes you have spent the amount: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println(" ");

        System.out.println("Enter "+a+" Purposes Name: ");
        System.out.println(" ");

        
        for(int i=0;i<a;i++)
        {
            
            System.out.print("Enter Purpose No. "+(i+1)+ ": ");
            String k = sc.nextLine();
            
            System.out.print("Enter amount spent for "+k+" : ");
            int v = sc.nextInt();

            map1.put(k,v);

            System.out.println(" ");

            sc.nextLine();
            
        }
        System.out.println(" ");
        return map1;
    }



public void equalSplit(HashMap<String,Integer> map1,ArrayList arr, double y)
    {
        System.out.println(" ");
        System.out.println("EQUALLY SPLITTING THE BILL ");
        System.out.println(" ");
      
        double n = arr.size();
        
        double equal=y/n;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr.get(i)+ " "+ " = "+equal);
        }
        

         

        
    }


public void percen(ArrayList<String> arr,Scanner sc,double y)
    {
        ArrayList<Integer> per = new ArrayList<>();
        int n = arr.size();
        System.out.println("");
        for(int i=0;i<n;i++)
            {
                System.out.print(i+1 + ". "+ "Enter Percentage for "+arr.get(i)+ " : ");
                per.add(sc.nextInt());
            }

        int p=0;
        for(int i=0;i<per.size();i++)
            {
                p=p+per.get(i);
            }
        if(p==100)
        {
            System.out.println(" ");
            System.out.println("SPLITTING BILL PERCENTAGE VISE");
            for (int i=0;i<n;i++)
                {
                    double m = (per.get(i) / 100.0) * y;
                    System.out.println(i+1 + ". "+arr.get(i)+ " "+"--  "+per.get(i)+" = "+m);
                }
        }
        else
        {
            System.out.println("Warning! Entered Percentage not equal to 100");
        }
        
        
    }



    public static void main(String[] args)
    {
        SPlitBill ob = new SPlitBill();
        Scanner sc =new Scanner(System.in);
        ArrayList<String> arr= new ArrayList<>();
        
        HashMap<String,Integer> map1 =new HashMap<>();

        purposeAmount ob1 = new purposeAmount();


        System.out.println(" ");
        System.out.println("------------------------------------");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("|| ----- SPLIT BILL APPLICATION ----- ||");
        System.out.println(" ");
        System.out.println("ENTER THE PURPOSE OF SPLITTING BILL");
        System.out.println("for ex: Travel Allowances, Dinner etc");
        System.out.println(" ");
        String b = sc.nextLine();

        
        
        while(true)
        {
            System.out.println(" ");
        System.out.println("Enter 1 for Add PERSONS: ");
        System.out.println("Enter 2 for Add PUPOSES OF AMOUNT SPENT: ");
        System.out.println("Enter 3 to CHECK TOTAL AMOUNT: ");
        System.out.println("Enter 4 for EQUAL SPLIT: ");
        System.out.println("Enter 5 for PERCENTAGE VISE SPLIT: ");
        System.out.println("Enter 6 for exit: ");
        System.out.println(" ");

        int n=sc.nextInt();
        sc.nextLine();
        System.out.println(" ");
        

        switch (n) {
            case 1:
                ob.addPersons(arr,sc);
                break;

            case 2:
                ob.addPurpose(map1,sc);
                break;
            
            case 3:
            double y = ob1.total(map1);
                ob1.amountSpent(map1,y);
                
                
                break;

            case 4:
             y = ob1.total(map1);
                ob.equalSplit(map1,arr,y);

                break;

            case 5:
            y = ob1.total(map1);
                ob.percen(arr,sc,y);
   
                   break;

            case 6:
                System.exit(-1);
                break;
        
            default:
            System.out.println("Please Try Correct Option Again! ");
                break;

        }//SWITCH
        }//WHILE

        

       

    }//MAIN
}//CLASS
