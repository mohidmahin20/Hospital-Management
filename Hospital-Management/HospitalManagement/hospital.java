package HospitalManagement;
import java.util.*;

 interface Doctor
{
   public void doctorInput();
    public void displayDoctor();
  
}

interface Patient
{
    public void patientInput();
    
}

interface Appointment
{
    public void appoint();
    public void getappoint();
    public void displayappoint();
}

class hospital
{
    
    public static void main(String[] args)
    {
        
        Doctor d=new doctorDetail();
        Patient p=new patientDetails();
        Appointment a=new appoints();
     

  
    System.out.println("--------------------------------------");
    System.out.println("WELCOME TO HOSPITAL MANAGEMENT SYSTEM");
    System.out.println("--------------------------------------");
    while(true)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("Hospital Menu");
        System.out.println("--------------------------------------");
        System.out.println("1.Doctor");
        System.out.println("2.Patient");
        System.out.println("3.Appointment");
        System.out.println("4.Exit");
        int choice;
        System.out.println("Enter your choice");
        choice=in.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Doctor Panel");
            d.doctorInput();
            break;

            case 2:
            System.out.println("Patient Panel");
            p.patientInput();
            break;

            case 3:
            System.out.println("Appointments");
            a.appoint();
            break;

            case 4:
            System.out.println("You entered Exit");
            System.exit(0);


            default:
            System.out.println("You entered a wrong choice!!");
            System.out.println("Please Select Again");
            
        }
    } 
  }
}


