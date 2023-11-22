package HospitalManagement;
import java.util.*;


public class appoints implements Appointment 
 {

    Scanner in=new Scanner(System.in);
    
    String name[]=new String[50];
    long Phone[]=new long[50];
    String Address[]=new String[50];
    String disease[]=new String[50];
    int age[]=new int[50];

   

    
    


    public void appoint()
    {
        while (true) 
        {
            
        
            System.out.println("---------------------------------");
            System.out.println("Appointment Panel");
            System.out.println("----------------------------------");
            System.out.println("1.Get Appointment");
            System.out.println("2.View Appointment");
            System.out.println("3.Exit");

            System.out.println("Enter your choice");
            int ch=in.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("----------------");
                    //System.out.println("Enter the required details");
                    getappoint();
                    break;
                case 2:
                   
                    displayappoint();
                    break;
                case 3:
                    System.out.println("Back to main menu");
                    hospital.main(null);
            
                default:
                    System.out.println("You entered a wrong choice");
                    break;
            }

            System.out.println("Press 1 to continue and 0 to exit");
            int choice=in.nextInt();
            if(choice!=1)
            {
                System.out.println("Back to Main Menu!!!!");
               // System.exit(0);
               hospital.main(null);
            }

        }
    }


    public void getappoint()
    {
        System.out.println("List of available doctors");
        System.out.println("--------------------------------");
        System.out.println("Id \tName \tSpecialist \tFees");
        System.out.println("-----------------------------------");
        System.out.println("212 \tDr.Rahman \tHeart \tRs.1090");
        System.out.println("215 \tDr.Roshni \tKidney \tRs.1050");
        System.out.println("217 \tDr.Roshan\tBone \tRs.1030");
        System.out.println("210 \tDr.Javeria \tImmune \tRs.2050");
        System.out.println("220 \tDr.Sajida \tNerve \tRs.2000");
 
       
            System.out.println("Enter Your Details");
            System.out.print("Name:");
            name[0]=in.next();
            System.out.print("Age:");
            age[0]=in.nextInt();
            System.out.print("Phone No.:");
            Phone[0]=in.nextLong();
            System.out.print("Address:");
            Address[0]=in.next();
            System.out.print("Disease:");
            disease[0]=in.next();
          
          
            
        
        System.out.println("Enter Doctor Id from the above list");
        int choice=in.nextInt();
        int pid;
        switch (choice) 
        {
         case 212:
           
             System.out.println("Appointment booked with--Dr.Rahman|Heart|Rs.1090");
             System.out.println("Visit Doctor on 21 march 2023 at 2:30pm");
             System.out.println("Appointment booked with--Dr.Rahman|Heart|Rs.1090");
              pid=142;
              System.out.print("Appointment Booked Successfully");
             System.out.println("Your Id is"+pid);
            
             break;
         case 215:
             System.out.println("Appointment booked with--Dr.Roshni|Kidney|tRs.1050");
             System.out.println("Visit Doctor on 12 march 2023 at 3:00pm");
              pid=143;
                System.out.print("Appointment Booked Successfully");
             System.out.println("Your Id is"+pid);
             break;
         case 217:
             System.out.println("Appointment booked with--Dr.Roshan|Bone|Rs.1030");
             System.out.println("Visit Doctor on 2 April 2023 at 11:00am");
             pid=144;
             System.out.print("Appointment Booked Successfully");
             System.out.println("Your Id is"+pid);
             break;
         case 210:
             System.out.println("Appointment booked with--Dr.Javeria|Immune|Rs.2050");
             System.out.println("Visit Doctor on 11 April 2023 at 10:00am");
              pid=145;
              System.out.print("Appointment Booked Successfully");
             System.out.println("Your Id is"+pid);
             break;
         case 220:
             System.out.println("Appointment booked with--Dr.Sajida|Nerve|Rs.2000");
             System.out.println("Visit Doctor on 15 April 2023 at 10:30am");
              pid=146;
              System.out.print("Appointment Booked Successfully");
             System.out.println("Your Id is"+pid);
             break;
         default:
             System.out.println("You entered a wrong Id");
             break;
        }
 
          
    }

    public void displayappoint()
    {
        System.out.println("Enter your Id");
        int ptid=in.nextInt();
        System.out.println("Here is the Appointment List");
        System.out.println("-----------------------------");
        switch(ptid)
        {
            case 142:
                System.out.println("Appointment booked with--Dr.Rahman|Heart|Rs.1090");
                System.out.println("Visit Doctor on 21 march 2023 at 2:30pm");
                break;
            case 143:
                System.out.println("Appointment booked with--Dr.Roshni|Kidney|tRs.1050");
                System.out.println("Visit Doctor on 12 march 2023 at 3:00pm");
                break;      
            case 144:
                System.out.println("Appointment booked with--Dr.Roshan|Bone|Rs.1030");
                System.out.println("Visit Doctor on 2 April 2023 at 11:00am");
            break;
            case 145:
                System.out.println("Appointment booked with--Dr.Javeria|Immune|Rs.2050");
                System.out.println("Visit Doctor on 11 April 2023 at 10:00am");
                break;
            case 146:
                System.out.println("Appointment booked with--Dr.Sajida|Nerve|Rs.2000");
                System.out.println("Visit Doctor on 15 April 2023 at 10:30am");
                break;
            default:
                System.out.println("Not Appointments booked in This Id");            


        }
    }
}
