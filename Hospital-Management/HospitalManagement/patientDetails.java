package HospitalManagement;
import java.util.*;

public class patientDetails implements Patient
{
    String name[]=new String[500];
    int age[]=new int[500];
    long phoneno[]=new long[500];
    String address[]=new String[500];
    String disease[]=new String[500];
    int pid=111;
    Scanner in=new Scanner(System.in);
    public void patientInput()
    {
       
        while (true)
        {
         System.out.println("------------------------------------------");
         System.out.println("Patient Menu");
         System.out.println("------------------------------------------");
         System.out.println("1.Registration");
         System.out.println("2.View Details");
         //System.out.println("3.Get Appointment");
         System.out.println("3.Exit");
         System.out.println("Enter your Choice");
         int choice=in.nextInt();
         switch (choice)
         {
            case 1:
            for(int i=pid;i<=pid;i++)
            {
                System.out.println("Enter Your Details");
                System.out.print("Name:");
                name[i]=in.next();
                System.out.print("Age:");
                age[i]=in.nextInt();
                System.out.print("Phone No.:");
                phoneno[i]=in.nextLong();
                System.out.print("Address:");
                address[i]=in.next();
                System.out.print("Disease:");
                disease[i]=in.next();
                System.out.print("Data Added Successfully");
                System.out.println("Your Id is : "+i);
                
            }
                pid=pid+1;
                break;
            
            case 2:
            System.out.println("-------------------------------------");
            System.out.println("Id\tName\tAge\tAddress\t     Phone No\tDisease");
            System.out.println("-------------------------------------");
           
            for(int i=111;i<pid;i++)
            {
            System.out.println(i+"\t"+name[i]+"\t"+age[i]+"\t"+address[i]+"\t"+" "+phoneno[i] +"\t"+disease[i]);
            }
            break;

            

            case 3:
                System.out.println("Back to Main Menu");
                hospital.main(null);      
                //System.exit(0);
                break;

            default:
                System.out.println("You entered a wrong choice");
                break;
         }
         System.out.println("Press 1 to continue and 0 to exit");
            
         int ch=in.nextInt();
         if(ch!=1)
         {
             System.out.println("Back to Main Menu!!!!");
            // System.exit(0);
            hospital.main(null);
         }
            
        }


    }
   
   
}

