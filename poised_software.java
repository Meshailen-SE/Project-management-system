/*Task 7
 *Compulsory task 2
 *14\05\2022
 *Meshailen Chetty 
 * */



//imported all the packages date and time and Scanner
import java.time.LocalDate;
import java.util.Scanner;


public class poised_software {

	public static void main(String[] args) {
		
		//printed the projects opening statement
		System.out.println("Welcome");
		
		//created my scanner input
		Scanner options_in = new Scanner(System.in);
		System.out.print("Great let's create a project!\n");
		
		
//i then created my project objects by asking the user to input their details for the project
		
	//project name
		//created my new class object
		project_object project = new project_object();
		Scanner project_in = new Scanner(System.in);
		System.out.println("Please enter the name of the project (ex :Tom's house) ");
		//using the project class i was able to return the values to the inputs from the user
		project.set_project_name(project_in.nextLine());
		
		//project number
		project_in = new Scanner(System.in);
		System.out.println("What is the projects number? ");
		project.set_project_num(project_in.nextInt());
		
		//project type
		project_in = new Scanner(System.in);
		System.out.println("What type of project is it? (building, apartment, house etc ");
		project.set_project_type(project_in.nextLine());
		
		//erf number
		project_in = new Scanner(System.in);
		System.out.println("What is the ERF number of the property? ");
		project.set_erf_num(project_in.nextInt());
		
		//total fee
		project_in = new Scanner(System.in);
		System.out.println("What is the total fee of the project? ");
		project.set_total_fee(project_in.nextInt());
		
		
		//total paid amount
		project_in = new Scanner(System.in);
		System.out.println("What is the total amount that the customer has paid up until now? ");
		project.set_total_amount_paid(project_in.nextInt());
		
		
		//deadline date
		project_in= new Scanner(System.in);
		System.out.println("When is the deadline date of the project?");
		project.set_deadline_date(project_in.nextLine());
		
		System.out.println("\nGreat, we have created a project now lets create the arhcitect's, contractors and customers personal details.\n ");
		System.out.println("=====================================================================================");
		
		
//architect details
		
		//name
		person architect = new person();
		Scanner archi_in = new Scanner(System.in);
		System.out.println("What is architects name?");
		architect.set_name(archi_in.nextLine());

		//telephone number
		archi_in = new Scanner(System.in);
		System.out.println("What is the architects telephone number?");
		architect.set_tele_num(archi_in.nextInt());
		
		
		//email address
		archi_in = new Scanner(System.in);
		System.out.println("What is the architects email adress?");
		architect.set_email(archi_in.nextLine());
		
		//physical address
		archi_in = new Scanner(System.in);
		System.out.println("What is architects physical adress?");
		architect.set_address(archi_in.nextLine());
//		System.out.println(architect);
		System.out.println("=====================================================================================");

			
	//Customers details
		//customers name
		person customer = new person();
		Scanner cust_in = new Scanner(System.in);
		System.out.println("Now lets create the customers details:\nWhat is the customers name?");
		customer.set_name(cust_in.nextLine());

		//customers telephone number
		cust_in = new Scanner(System.in);
		System.out.println("What is the customers telephone number?");
		customer.set_tele_num(cust_in.nextInt());
		
		//customer email
		cust_in = new Scanner(System.in);
		System.out.println("What is customers email address?");
		customer.set_email(cust_in.nextLine());
		
		//customer physical address
		Scanner cust_address_in = new Scanner(System.in);
		System.out.println("What is the customers physical address?");
		customer.set_address(cust_in.nextLine());
		System.out.println("=====================================================================================");

	
	//contractors details
		//contractors name
		person contractor = new person();
		Scanner cont_in = new Scanner(System.in);
		System.out.println("\nNow lets create the contractors details\nWhat is the contractors name?");
		contractor.set_name(cont_in.nextLine());
		
		//contractors telephone number
		cont_in = new Scanner(System.in);
		System.out.println("What is the contractors telephone number?");
		contractor.set_tele_num(cont_in.nextInt());
		
		//Contractor email
		cont_in = new Scanner(System.in);
		System.out.println("What is the contractors email address?");
		contractor.set_email(cont_in.nextLine());
		
		//contractor physical address
		cont_in = new Scanner(System.in);
		System.out.println("What is the contractors physical address?");
		contractor.set_address(cont_in.nextLine());
		
		
		System.out.println("Great you have succesfully created your project.\n");
		System.out.println("=====================================================================================");

	 //i then printed out the classes for class by placing the toString method next to it
		System.out.print("Project information:");
		System.out.println(project.project_object());
		
		//printed the architects details
		System.out.print("Architct informtion:\n");
		System.out.println(architect);
		
		//printed the customers details
		System.out.println("\nCustomer informtion:");
		System.out.println(customer);
	
		//printed the contractors details
		System.out.println("\nContractor  informtion:");
		System.out.println(contractor);

		
		System.out.println("\n=====================================================================================");

		//created a boolean variable and set it to false
		boolean edit = false;
		
		//created a while loop and set it to true
		while (edit = true) {
			
		//printed a option menu and created a scanner input for it	
		Scanner edit_task_in = new Scanner(System.in);
		System.out.println("Please select a option:\n\n"
				+ "ec  - edit contrctors details\n"
				+ "ed  - edit deadline date\n"
				+ "ea  - edit amount paid \n"
				+ "f   - finalise task(Invoice)");
		System.out.println("\n=====================================================================================");
		String edit_task = edit_task_in.next().toLowerCase();
		
		
		//created an if statement for the users input
		if (edit_task.equals("f")) {
			
		//i then created my total amount by subtracting the total fee by the paid amount
		int total_amount = project.get_total_fee() - project.get_total_paid_amount();
		
		//created an if statement if the total amount equals 0 then a statement will be printed out
		if (total_amount == 0) {
			System.out.println("Project has already been paid.");
			break;
		}
		if (total_amount > 0) {
			
		System.out.println("INVOICE:");
		LocalDate time = LocalDate.now();
		System.out.println(
		"-------------------------------------------\n"+
		"Date:"+time+"\nProject Name:"+project.get_project_name()+"\n"+
		"-------------------------------------------\n"+
		"Total amount paid by the customer  : R"+project.get_total_paid_amount()+
		"\nTotal amount of the project        : R"+project.get_total_fee()+
		"\n===========================================\n"+
		"Total amount owed :R"+total_amount+"\n"+
		"===========================================");
			
		//created a break in my while loop
		break;
		
		}
		
		}
		//created an else if statement for the different option if the user entered a different option 
		else if (edit_task.equals("ed")) {
			//created a new scanner
			project_in = new Scanner(System.in);
			System.out.println("Please enter the new deadline date.");
			project.set_deadline_date(project_in.nextLine());
			System.out.println(project.project_object());
			
			
		}
		//created an else if statement for the different option if the user entered a different option 
		else if (edit_task.contentEquals("ec")) {
			
		//changing the contractors details
			System.out.println("Changing the contractors details ");
			cont_in = new Scanner(System.in);
			System.out.println("What is the name of the contractor? ");
			contractor.set_name(cont_in.nextLine());
			
			cont_in = new Scanner(System.in);
			System.out.println("What is contractors telephone number? ");
			contractor.set_tele_num(cont_in.nextInt());
			
			cont_in = new Scanner(System.in);
			System.out.println("What is the contractors email's address? ");
			contractor.set_email(cont_in.nextLine());
			
			cont_in = new Scanner(System.in);
			System.out.println("What is the contractors physical address? ");
			contractor.set_address(cont_in.nextLine());
			
			System.out.println("\nThe contractors details have been updated...");
			System.out.println(contractor);
			}
		//created an else if statement for the different option if the user entered a different option 
		else if (edit_task.equals("ea")) {
			project_in = new Scanner(System.in);
			System.out.println("What is the new amount paid by the customer?");
			project.set_total_amount_paid(project_in.nextInt());
			System.out.println("Total paid amount has been changed.\n");
			System.out.println("The new project details are:\n"+project.project_object());
			
		}
		//set my boolean variable to false so that i am able to display the options after every option the user inputs
		edit = false;
		}
			
			
			

			
		
	}
	
			
		
			
			
			
			
//				project_object mesh = new project_object(project_name,project_type,project_num,erf_num,total_amount_paid,total_fee,deadline_date);
//				System.out.print(mesh.project_object());
		
	
	}





