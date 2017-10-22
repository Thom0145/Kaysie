package assign3tinker;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class tinker {
	public static void main(String[] args) throws IOException{
		
		
		for(int i = 0; i<=3; i++){
		if (i == 2){
			System.out.println("You have entered two wrong entries, this service will be terminated if your next entry is werong");
		}
		if (i==3){
			System.exit(0);
		}
		boolean continueInput = true;
		do{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name and address of the company: ");
		String companyInfo = input.nextLine();
		System.out.println("How many packages are you shipping under 1 pound? ");
		int firstBracket = input.nextInt();
		System.out.println("How many packages are you shipping btween 1 and 3 pounds? ");
		int secondBracket = input.nextInt();
		System.out.println("How many packages are you shipping btween 3 and 10 pounds? ");
		int thirdBracket = input.nextInt();
		System.out.println("How many packages are you shipping btween 10 and 20 pounds? ");
		int fourthBracket = input.nextInt();//Get info for company
		double localPrice = 0.00;
		double localPrice1 = 0.00;
		double localPrice2 = 0.00;
		double localPrice3 = 0.00;
		double localPrice4 = 0.00;
			localPrice1 +=firstBracket * 3.5;
			localPrice2 +=secondBracket * 5.5;
			localPrice3 +=thirdBracket * 8.5;
			localPrice4 +=fourthBracket * 10.5;
			localPrice = localPrice1+localPrice2+localPrice3+localPrice4;
		double canadaPrice = 0.00;
		double canadaPrice1 = 0.00;
		double canadaPrice2 = 0.00;
		double canadaPrice3 = 0.00;
		double canadaPrice4 = 0.00;
			canadaPrice1 +=firstBracket * 4.5;
			canadaPrice2 +=secondBracket * 6.5;
			canadaPrice3 +=thirdBracket * 10.5;
			canadaPrice4 +=fourthBracket * 12.5;
			canadaPrice = canadaPrice1+canadaPrice2+canadaPrice3+canadaPrice4;
		double southAmericaPrice = 0.00;
		double southAmericaPrice1 = 0.00;
		double southAmericaPrice2 = 0.00;
		double southAmericaPrice3 = 0.00;
		double southAmericaPrice4 = 0.00;
			southAmericaPrice1 +=firstBracket * 5.5;
			southAmericaPrice2 +=secondBracket * 7.5;
			southAmericaPrice3 +=thirdBracket * 9.5;
			southAmericaPrice4 +=fourthBracket * 11.5;
			southAmericaPrice = southAmericaPrice1+southAmericaPrice2+southAmericaPrice3+southAmericaPrice4;
		double europePrice = 0.00;
		double europePrice1 = 0.00;
		double europePrice2 = 0.00;
		double europePrice3 = 0.00;
		double europePrice4 = 0.00;
			europePrice1 +=firstBracket * 7.5;
			europePrice2 +=secondBracket * 9.5;
			europePrice3 +=thirdBracket * 11.0;
			europePrice4 +=fourthBracket * 15.0;
			europePrice = europePrice1+europePrice2+europePrice3+europePrice4;
		try {
			File file1 = new File("Tinker.txt");
			PrintWriter output = new PrintWriter(file1); //Create File
			output.println("The company name and address: " + companyInfo); //Print to file
			output.println(firstBracket + " packages greater than 0 and less than or equal to 1 pound");
			output.println(secondBracket + " packages greater than 1 pound and less than or equal to 3 pounds");
			output.println(thirdBracket + " packages greater than 3 pounds and less than or equal to 10 pounds");
			output.println(fourthBracket + " packages greater than 10 pounds and less than or equal to 20 pounds");
			output.println("$" + localPrice + " to ship locally");
			output.println("$" + canadaPrice + " to ship to Canada");
			output.println("$" + southAmericaPrice + " to ship to South America");
			output.println("$" + europePrice + " to ship to Europe");
			output.close(); //Close PrintWriter
		} catch (Exception e) {
			e.printStackTrace();
		}
		continueInput = false;
		System.out.println("program has terminated");		
	}
		while(continueInput);
}
}
}
