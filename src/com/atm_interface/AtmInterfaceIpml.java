package com.atm_interface;
import java.util.*;
import java.util.Map;


public class AtmInterfaceIpml implements AtmOperationInterf {
	Atm_class atm = new Atm_class();
	
	Map<Double,String> Ministmt=new HashMap<>();

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("\nAvailable Balance is : \n"+atm.getBalance());
		
	}

	@Override
	public void Deposit(double deposit) {
		// TODO Auto-generated method stub

		Ministmt.put(deposit,"Ammount deposit !!");
	
		System.out.println(deposit + "\nDeposite Amount Sucessesfully !! " );
		atm.setBalance(atm.getBalance()+deposit);
		balance();
	}

	@Override
	public void withdrow(double withdrow) {
		// TODO Auto-generated method stub
		if(withdrow%500==0) {
		if(withdrow<=atm.getBalance()) {
			Ministmt.put(withdrow," Ammount Withdrow !!");
		System.out.println(withdrow + "\n\n Collect The Cash" );
		atm.setBalance(atm.getBalance()-withdrow);
		balance();
		}else {
			System.out.println("Insufficient Balance !!\n");
		}
		}
		else {
			System.out.println("Please Enter The Amount in Multiple of 500 ");
		}
	}

	@Override
	public void viewMiniStatment() {
		// TODO Auto-generated method stub
		
		for (Map.Entry<Double,String> map:Ministmt.entrySet()) {
			System.out.println(map.getKey()+""+map.getValue());
		}
		
	}

	

}
