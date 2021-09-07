package com.xworkz.ControlStatements;

public class CarCompanyInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName="Toyota";
		switch(companyName) {
			case "Hundai":
						  System.out.println("car model: Hundai creta");
						  System.out.println("Engine capacity: 1353cc to 1497cc");
						  System.out.println("Mileage : 16.8 to 21.4 kmpl");
						  break;
			case "Toyota":
				  		  System.out.println("car model: etios Liva");
				  		  System.out.println("Engine capacity: 1197cc to 1364cc");
				  		  System.out.println("Mileage : 17.71 to 23.59 kmpl");
				  		  break;
			case "Kia":
						  System.out.println("car model: Sonet");
						  System.out.println("Engine capacity: 998cc to 1493cc");
				  		  System.out.println("Mileage : 18.2 to 24.1 kmpl");
				  		  break;
			default:	 System.out.println("wrong input");


		}

	}

}
