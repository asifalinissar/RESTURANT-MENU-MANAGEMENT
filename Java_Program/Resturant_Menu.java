
package Java_Program;

import java.util.Scanner;

public class Resturant_Menu {
	
	public static void main(String[] args) {
		System.out.println("WELCOME TO OUR RESTURANT");
		Scanner scanner = new Scanner(System.in);
		System.out.println("what you want [Appetizers , Main Course , Beverages , Desserts , Extras]");
		String choice = scanner.nextLine();
		System.out.println("you chose "+ choice );
		
		if (choice.equalsIgnoreCase("Appetizers")) {
			
			System.out.println("in Appetizers we have :");
			System.out.println("[1]Garlic Bread - ₹120");
			System.out.println("[2]Spring Rolls - ₹150");
			System.out.println("[3]Crispy Chicken Wings - ₹200");
			System.out.println("[4]Tomato Soup - ₹100");
			System.out.println("[5]Paneer Tikka - ₹180");
			
			Scanner scan= new Scanner(System.in);
			System.out.println("what you want :");
			int number = scan.nextInt();
			
			switch (number) {
			
			case(1):
				System.out.println("you chose Garlic Bread - ₹120");
			break;
			case(2):
				System.out.println("you choose Spring Rolls - ₹150");
			break;
			case(3):
				System.out.println("you choose Crispy Chicken Wings - ₹200");
			break;
			case(4):
				System.out.println("you choose Tomato Soup - ₹100 ");
			break;
			case(5):
				System.out.println("you choose Paneer Tikka - ₹180");
			break;
			
			default:
				System.out.println("please enter a vaild thing from the list");
			
			
			}
		}
		
		else if (choice.equalsIgnoreCase("Main Course")) {
			
			Scanner veg_nonveg = new Scanner(System.in);
			System.out.println("IN  THE  MAIN COURSE WE HAVE VEG AND NON-VEG WHAT YOU WANT");
			String VEG_OR_NONVEG = veg_nonveg.nextLine();
			if (VEG_OR_NONVEG.equalsIgnoreCase("veg")) {
				System.out.println("In veg we have :");
				System.out.println("[1]Veg Biryani - ₹220");
				System.out.println("[2]Paneer Butter Masala - ₹250");
				System.out.println("[3]Dal Makhani - ₹200");
				System.out.println("[4]Mixed Vegetable Curry - ₹190");
				System.out.println("[5]Aloo Paratha (2 pcs) - ₹150");
				
				Scanner scan1= new Scanner(System.in);
				System.out.println("what you want :");
				int number1 = scan1.nextInt();
				
				switch (number1) {
				
				case(1):
					System.out.println("you chose Veg Biryani - ₹220");
				break;
				case(2):
					System.out.println("you choose Paneer Butter Masala - ₹250");
				break;
				case(3):
					System.out.println("you choose Dal Makhani - ₹200");
				break;
				case(4):
					System.out.println("you choose Mixed Vegetable Curry - ₹190");
				break;
				case(5):
					System.out.println("Aloo Paratha (2 pcs) - ₹150");
				break;
				
				default:
					System.out.println("please enter a vaild thing from the list");
			}
			
		}
			else if(VEG_OR_NONVEG.equalsIgnoreCase("non veg")) {
				System.out.println("In veg we have :");
				System.out.println("[1]Chicken Biryani - ₹280");
				System.out.println("[2]Butter Chicken - ₹300");
				System.out.println("[3]Mutton Rogan Josh - ₹350");
				System.out.println("[4]Grilled Fish - ₹320");
				System.out.println("[5]Egg Curry - ₹200");
				
				Scanner scan1= new Scanner(System.in);
				System.out.println("what you want :");
				int number1 = scan1.nextInt();
				
				switch (number1) {
				
				case(1):
					System.out.println("you chose Chicken Biryani - ₹280");
				break;
				case(2):
					System.out.println("you choose Butter Chicken - ₹300");
				break;
				case(3):
					System.out.println("you choose Mutton Rogan Josh - ₹350");
				break;
				case(4):
					System.out.println("you choose Grilled Fish - ₹320");
				break;
				case(5):
					System.out.println("Egg Curry - ₹200");
				break;
				
				default:
					System.out.println("please enter a vaild thing from the list");
			}
	}
			else {
				System.out.println("plese enter correctly VEG OR NON_VEG");
			}

	}
		
		else if (choice.equalsIgnoreCase("Beverages")) {
			
			System.out.println("in Beverages we have :");
			System.out.println("[1]Lemonade - ₹80");
			System.out.println("[2]Cold Coffee - ₹120");
			System.out.println("[3]Masala Chai - ₹60");
			System.out.println("[4]Fresh Juice (Orange) - ₹100");
			System.out.println("[5]Mocktail (Virgin Mojito) - ₹140");
			
			Scanner scan2= new Scanner(System.in);
			System.out.println("what you want :");
			int number2 = scan2.nextInt();
			
			switch (number2) {
			
			case(1):
				System.out.println("you chose Lemonade - ₹80");
			break;
			case(2):
				System.out.println("you choose Cold Coffee - ₹120");
			break;
			case(3):
				System.out.println("you choose Masala Chai - ₹60");
			break;
			case(4):
				System.out.println("you choose Fresh Juice (Orange) - ₹100 ");
			break;
			case(5):
				System.out.println("you choose Mocktail (Virgin Mojito) - ₹140");
			break;
			
			default:
				System.out.println("please enter a vaild thing from the list");
			
			
			}
		}
		
	else if (choice.equalsIgnoreCase("Desserts")) {
			
			System.out.println("in Desserts we have :");
			System.out.println("[1]Gulab Jamun (2 pcs) - ₹80");
			System.out.println("[2]Chocolate Brownie - ₹150");
			System.out.println("[3]Ice Cream Sundae - ₹180");
			System.out.println("[4]Rasmalai - ₹100");
			System.out.println("[5]Fruit Salad with Ice Cream - ₹130");
			
			Scanner scan3= new Scanner(System.in);
			System.out.println("what you want :");
			int number3 = scan3.nextInt();
			
			switch (number3) {
			
			case(1):
				System.out.println("you chose Gulab Jamun (2 pcs) - ₹80");
			break;
			case(2):
				System.out.println("you choose Chocolate Brownie - ₹150");
			break;
			case(3):
				System.out.println("you choose Ice Cream Sundae - ₹180");
			break;
			case(4):
				System.out.println("you choose Rasmalai - ₹100 ");
			break;
			case(5):
				System.out.println("you choose Fruit Salad with Ice Cream - ₹130");
			break;
			
			default:
				System.out.println("please enter a vaild thing from the list");
			
			
			}
		}
		
	else if (choice.equalsIgnoreCase("Extras")) {
		
		System.out.println("in Extras we have :");
		System.out.println("[1]Butter Naan - ₹40");
		System.out.println("[2]Steamed Rice - ₹80");
		System.out.println("[3]Green Salad - ₹50");
		System.out.println("[4]Pickle (Small Bowl) - ₹30");
		Scanner scan4= new Scanner(System.in);
		System.out.println("what you want :");
		int number4 = scan4.nextInt();
		
		switch (number4) {
		
		case(1):
			System.out.println("you chose Butter Naan - ₹4");
		break;
		case(2):
			System.out.println("you choose Steamed Rice - ₹80");
		break;
		case(3):
			System.out.println("you choose Green Salad - ₹50");
		break;
		case(4):
			System.out.println("you choose Pickle (Small Bowl) - ₹30");
		break;
		default:
			System.out.println("please enter a vaild thing from the list");
		
		
		}
	}
		
	else {
		System.out.println("invalid response please enter from the list");
	}
		
}
}
