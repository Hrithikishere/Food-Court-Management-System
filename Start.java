import java.lang.*;
import fileio.*;
import classes.*;
import java.util.*;


public class Start{

	public static void main(String args[]){

		FoodCourt fc = new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		Scanner sc = new Scanner(System.in);

		boolean repeat = true;

		System.out.println("-----------------------");
		System.out.println("Welcome to Cheif's Kitchen Food Court");
		System.out.println("-----------------------");
		System.out.println();

		while(repeat)  //main loop / main menu
		{
			System.out.println("What do you want to choose?");
			System.out.println("1. Employee Management");
			System.out.println("2. Restaurant Management");
			System.out.println("3. Restaurant FoodItem Management");
			System.out.println("4. FoodItem Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println();

			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();   //main menu input

			switch(choice){

				case 1:   //Employee Management

					System.out.println("-----------------------");
					System.out.println("Your choice is Employee Management");
					System.out.println("-----------------------");

					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------");
					System.out.println("1.Insert New Employee");
					System.out.println("2.Remove Existing Employee");
					System.out.println("3.Show All Employees");
					System.out.println("4.Search an Employee");
					System.out.println("5.Go Back");
					System.out.println("-----------------------");
					System.out.println();


					System.out.print("Enter your option: ");
					int option1 = sc.nextInt();

					switch(option1){  //Employee Management Menu


						case 1:  //Employee Management - Insert New Employee 

						System.out.println("-----------------------");
						System.out.println("Your option is Insert New Employee");
						System.out.println("-----------------------");
						System.out.println();

						System.out.print("Enter Employee ID: ");
						String empId1 = sc.next();
						System.out.print("Enter Employee Name: ");
						String name1 = sc.next();
						System.out.print("Enter Employee Salary: ");
						double salary1 = sc.nextDouble();

						Employee e1 = new Employee();
						e1.setEmpId(empId1);
						e1.setName(name1);
						e1.setSalary(salary1);

						if(fc.insertEmployee(e1)){

							System.out.println("Employee Inserted...ID: "+empId1);

						}else {

							System.out.println("Oops... Something is Wrong...");
						}

						System.out.println();

						break;    //Employee Insert End Here


						case 2: //Employee Management - Remove Existing Employee 

						System.out.println("-----------------------");
						System.out.println("Your option is Remove Existing Employee");
						System.out.println("-----------------------");
						System.out.println();

						System.out.print("Enter Employee ID: ");
						String empId2 = sc.next();

						Employee e2 = fc.searchEmployee(empId2);

						if(e2!=null){

							if(fc.removeEmployee(e2)){

								System.out.println("Employee Removed... ID: "+e2.getEmpId());  //+empId2 ?

							}else{

								System.out.println("Oops... Something is Wrong...");
							}//remove if else

						}else{

							System.out.println("Found nobody to remove");
						}

						System.out.println();

						break;  //Remove employee ends here


						case 3: //Employee Management - Show All Employees 

						System.out.println("-----------------------");
						System.out.println("Your option is Show All Employees");
						System.out.println("-----------------------");
						System.out.println();

						fc.showAllEmployees();
						System.out.println();

						break;  //Show All Employees End here

						case 4: //Employee Management - Search an Employee 

						System.out.println("-----------------------");
						System.out.println("Your option is Search an Employee ");
						System.out.println("-----------------------");
						System.out.println();

						System.out.print("Enter Employee ID: ");
						String empId4 = sc.next();

						Employee e4 = fc.searchEmployee(empId4);

						if(e4 != null){

							System.out.println("Yessssss! We have found the Employee!!!!!!!");
							System.out.println("Employee ID: "+e4.getEmpId());
							System.out.println("Employee Name: "+e4.getName());
							System.out.println("Employee Salary: "+e4.getSalary());

						}else{

							System.out.println("Sorry... No Employee Found!!!");
						}

						System.out.println();

						break; //Employee Search Ends here



						case 5: //Employee Management - Go Back 

						System.out.println("-----------------------");
						System.out.println("Going Back.....");
						System.out.println("-----------------------");
						System.out.println();

						break;


						default:

						System.out.println("-----------------------");
						System.out.println("Invalid Option!!!");
						System.out.println("-----------------------");
						System.out.println();


					}


					break;  //Employee Management main Break


				case 2:  //Restaurant Management

					System.out.println("-----------------------");
					System.out.println("Your choice is Restaurant Management");
					System.out.println("-----------------------");

					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------");
					System.out.println("1.Insert New Restaurant");
					System.out.println("2.Remove Existing Restaurant");
					System.out.println("3.Show All Restaurants");
					System.out.println("4.Search an Restaurant");
					System.out.println("5.Go Back");
					System.out.println("-----------------------");
					System.out.println();


					System.out.print("Enter your option: ");
					int option2 = sc.nextInt();

					switch(option2){


						case 1:  //Restaurant Management - Insert New Restaurant 

						System.out.println("-----------------------");
						System.out.println("Your option is Insert New Restaurant");
						System.out.println("-----------------------");
						System.out.println();

						break;


						case 2: //Restaurant Management - Remove Existing Restaurant 

						System.out.println("-----------------------");
						System.out.println("Your option is Remove Existing Restaurant");
						System.out.println("-----------------------");
						System.out.println();

						break;


						case 3: //Restaurant Management - Show All Restaurants 

						System.out.println("-----------------------");
						System.out.println("Your option is Show All Restaurants");
						System.out.println("-----------------------");
						System.out.println();

						break;


						case 4: //Restaurant Management - Search an Restaurant 

						System.out.println("-----------------------");
						System.out.println("Your option is Search an Restaurant ");
						System.out.println("-----------------------");
						System.out.println();

						break;


						case 5: //Restaurant Management - Go Back 

						System.out.println("-----------------------");
						System.out.println("Going Back.....");
						System.out.println("-----------------------");
						System.out.println();

						break;


						default:

						System.out.println("-----------------------");
						System.out.println("Invalid Option!!!");
						System.out.println("-----------------------");
						System.out.println();
					}


					break;  //Restaurant Management main Break


				case 3:  //Restaurant Food Item Management

					System.out.println("-----------------------");
					System.out.println("Your choice is Restaurant FoodItem Management");
					System.out.println("-----------------------");

					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------");
					System.out.println("1.Insert New FoodItem");
					System.out.println("2.Remove Existing FoodItem");
					System.out.println("3.Show All FoodItems");
					System.out.println("4.Search an FoodItem");
					System.out.println("5.Go Back");
					System.out.println("-----------------------");
					System.out.println();


					System.out.print("Enter your option: ");
					int option3 = sc.nextInt();

					switch(option3){


						case 1:  //Restaurant Food Item Management - Insert New Food Item 

						System.out.println("-----------------------");
						System.out.println("Your option is Insert New Food Item");
						System.out.println("-----------------------");
						System.out.println();

						break;


						case 2: //Restaurant Food Item Management - Remove Existing Food Item 

						System.out.println("-----------------------");
						System.out.println("Your option is Remove Existing Food Item");
						System.out.println("-----------------------");
						System.out.println();

						break;


						case 3: //Restaurant Food Item Management - Show All FoodItems 

						System.out.println("-----------------------");
						System.out.println("Your option is Show All FoodItems");
						System.out.println("-----------------------");
						System.out.println();

						break;


						case 4: //Restaurant Food Item Management - Search an Food Item 

						System.out.println("-----------------------");
						System.out.println("Your option is Search an Food Item ");
						System.out.println("-----------------------");
						System.out.println();

						break;


						case 5: //Restaurant Food Item Management - Go Back 

						System.out.println("-----------------------");
						System.out.println("Going Back.....");
						System.out.println("-----------------------");
						System.out.println();

						break;


						default:

						System.out.println("-----------------------");
						System.out.println("Invalid Option!!!");
						System.out.println("-----------------------");
						System.out.println();
					}


					break;  //Restaurant Food Item Management main Break


				case 4:  // FoodItem Quantity Add-Sell

					System.out.println("-----------------------");
					System.out.println("Your choice is FoodItem Quantity Add-Sell");
					System.out.println("-----------------------");

					System.out.println("\nHere are your options: \n");
					System.out.println("-----------------------");
					System.out.println("1.Add FoodItem");
					System.out.println("2.Sell FoodItem");
					System.out.println("3.Show Add Sell History");
					System.out.println("4.Go Back");
					System.out.println("-----------------------");
					System.out.println();


					System.out.print("Enter your option: ");
					int option4 = sc.nextInt();

					switch(option4){


						case 1:  //FoodItem Quantity Add-Sell - Add FoodItem 

						System.out.println("-----------------------");
						System.out.println("Your option is Add FoodItem");
						System.out.println("-----------------------");
						System.out.println();

						break;


						case 2: //FoodItem Quantity Add-Sell - Sell FoodItem 

						System.out.println("-----------------------");
						System.out.println("Your option is Sell FoodItem");
						System.out.println("-----------------------");
						System.out.println();

						break;


						case 3: //FoodItem Quantity Add-Sell - Show Add Sell History 

						System.out.println("-----------------------");
						System.out.println("Your option is Show Add Sell History");
						System.out.println("-----------------------");
						System.out.println();

						break;


						case 4: //FoodItem Quantity Add-Sell - Go Back 

						System.out.println("-----------------------");
						System.out.println("Going Back.....");
						System.out.println("-----------------------");
						System.out.println();

						break;


						default:

						System.out.println("-----------------------");
						System.out.println("Invalid Option!!!");
						System.out.println("-----------------------");
						System.out.println();
					}


					break;  //Food Item Quantity Add-Sell main Break


				case 5:    // System Exit

					repeat = false;
					System.out.println("-----------------------");
					System.out.println("Thank you for using our system");
					System.out.println("Developed by Team Binary K-O-4");
					System.out.println();

					break;  //Sytem Exit



				default:  //main default
					
					System.out.println("-----------------------");
					System.out.println("Invalid Choice!!!");
					System.out.println("-----------------------");
					System.out.println();
					break;
			}

		}
	}
}