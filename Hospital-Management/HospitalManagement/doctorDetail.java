package HospitalManagement;
import java.util.*;


public class doctorDetail implements Doctor
{
    String name[]=new String[500];
    String experties[]=new String[500];
    String qualification[]=new String[500];
    double fees[]=new double[500];
    int id=101;
 
    public void doctorInput()
    {
        //System.out.println("Doctor Panel");
        Scanner in=new Scanner(System.in);
        while(true)
        {
            System.out.println("---------------------------");
            System.out.println("Doctor Menu");
            System.out.println("---------------------------");
            System.out.println("1.Add Doctor");
            System.out.println("2.View Doctor");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            int choice=in.nextInt();

            switch (choice) 
            {
                case 1:
                    for(int i=id;i<=500;i++)
                    {
                        System.out.println("Enter Doctor Details");
                        System.out.print("Name:");
                        name[i]=in.next();
                        System.out.print("Experties:");
                        experties[i]=in.next();
                        System.out.print("Qualification:");
                        qualification[i]=in.next();
                        System.out.print("Fees:");
                        fees[i]=in.nextDouble();
                        System.out.print("Data Added Successfully");
                        System.out.println("Your Id is : "+i);
                        id=id+1;
                        System.out.println("Press Y to Add one more"); 
                        String yes=in.next();
                        if(yes.equals("Y"))
                        {
                           
                            continue;
                        }
                        break;
                    }   
                    break;
                    
                case 2:
                    
                    displayDoctor();
                    break;

                case 3:
                    System.out.println("Back to Main Menu");
                    hospital.main(null); 
                    //System.exit(0);
                    break;

                default:
                    System.out.println("You entered an invalid number");
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
    

    public void displayDoctor()
    {
        System.out.println("-------------------------------------");
        System.out.println("Id \t Name \t Specialist \t Fee ");
        System.out.println("-------------------------------------");
        System.out.println("212 \t Dr.Roshni \tCardiologist\t 3549.0");
        if(id>100)
        {
        for(int i=101;i<id;i++)
        {
        System.out.println(i+" \t "+name[i]+" \t "+experties[i]+" \t\t"+fees[i]);
        }
        }
        else
        {
            System.out.println("No doctors added yet");
        }
    }
}

