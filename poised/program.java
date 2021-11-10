import java.util.Scanner;

public class program{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the project number: ");
        int ProjectNumber = input.nextInt();
        input.nextLine();
        System.out.println("What is the project name: ");
        String ProjectName = input.nextLine();
        System.out.println("What is the building type: ");
        String building = input.nextLine();
        System.out.println("What is the physical address of the project: ");
        String ProjectAddress = input.nextLine();
        System.out.println("What is the ERF number: ");
        int erf = input.nextInt();
        System.out.println("What is the total fee: ");
        int total = input.nextInt();
        System.out.println("What is the amount paid: ");
        int paid = input.nextInt();
        System.out.println("What is the deadline: ");
        String deadline = input.nextLine();
        input.nextLine();

        poised project = new poised(ProjectNumber, ProjectName, building, ProjectAddress, erf, total, paid, deadline);

        System.out.println(project);
            
        
        
        
        
        System.out.println("Enter Architect details: \n");
        
        System.out.println("What is the name of the architect: ");
        String ArchitectName = input.nextLine();
        input.nextLine();
        System.out.println("What is the Telephone number: ");
        int ArchitectPhone = input.nextInt();
        System.out.println("What is his email address: ");
        String ArchitectEmail = input.nextLine();
        System.out.println("What is his physical address: ");
        String ArchitectAddress = input.nextLine();
        input.nextLine();

        
        person architect = new person(ArchitectName, ArchitectPhone, ArchitectEmail, ArchitectAddress);

        System.out.println(architect);
            
        System.out.println("Enter constructor details: \n");
        
        System.out.println("What is the name of the constructor: ");
        String ConstructorName = input.nextLine();
        input.nextLine();
        System.out.println("What is the Telephone number: ");
        int ConstructorPhone = input.nextInt();
        System.out.println("What is his email address: ");
        String ConstructorEmail = input.nextLine();
        System.out.println("What is his physical address: ");
        String ConstructorAddress = input.nextLine();
        input.nextLine();

        
        person constructor = new person(ConstructorName, ConstructorPhone, ConstructorEmail, ConstructorAddress);

        System.out.println(constructor);
            
        
        System.out.println("Enter Customer details: \n");
        
        System.out.println("What is the name of the Customer: ");
        String CustomerName = input.nextLine();
        input.nextLine();
        System.out.println("What is the Telephone number: ");
        int CustomerPhone = input.nextInt();
        System.out.println("What is his email address: ");
        String CustomerEmail = input.nextLine();
        System.out.println("What is his physical address: ");
        String CustomerAddress = input.nextLine();
        input.nextLine();
    
        person customer = new person(CustomerName, CustomerPhone, CustomerEmail, CustomerAddress);

        System.out.println(customer);
            
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    }




















}