package com.atm_interface;

import java.util.Scanner;

public class Main_class {

	public static void main(String args[]) {
		AtmOperationInterf op = new AtmInterfaceIpml();
		int atmnumber=12345;
		int atmpin=1234;
		Scanner in = new Scanner(System.in);
		System.out.println("**************************************************************** ");
		System.out.println("*************!!!Wellcome to Atm Machine !!! ********************");
		System.out.println("****************************************************************");
		
		System.out.println("Enter Atm num :");
		int atmNumber = in.nextInt();
		System.out.println("Enter Atm pin:");
		int atmPin = in.nextInt();
		if(atmnumber==atmNumber  && atmpin==atmPin) {
			while(true) {

				System.out.println(" \n1.view Available balance \n 2.Withdrow ammount \n 3.Deposite money \n 4.view money \n 5.Exit");
		
				System.out.print("\nEnter the choice ");
				int ch=in.nextInt();
				if(ch==1) {
					op.balance();
					
				}else if(ch==2){

					System.out.println("Enter a ammount to withdrow ");
					double withdrow = in.nextDouble();
					op.withdrow(withdrow);
					
				}else if (ch==3) {
					System.out.println("Enter a ammount to Deposite ");
					double Deposit = in.nextDouble();
					op.Deposit(Deposit);
					
				}else if(ch==4) {
					op.viewMiniStatment();
					
				}else if(ch==5) {
					System.out.println("collect your ATM card \n Thank for using ATM !!");
					System.exit(0);
				}
				else {
					System.out.println("Please Enter correct choise ");
				}
			}
			
			
		}else {
			System.out.println("Incarrect Atm number or Pin ");
			System.exit(0);
			
		}
		
		
	}

}
