package com.xworkz.ControlStatements;

public class GstCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price=30000;
		double taxAmount;
		String typeOfIndustry="manufacture";
		if(typeOfIndustry=="edu") {
			taxAmount=price*0.5/100;
			System.out.println("Tax amount is "+taxAmount);
		}
		if(typeOfIndustry=="sales") {
			taxAmount=price*0.8/100;
			System.out.println("Tax amount is "+taxAmount);
		}
		if(typeOfIndustry=="manufacture") {
			taxAmount=price*0.15/100;
			System.out.println("Tax amount is "+taxAmount);
		}
		if(typeOfIndustry=="health") {
			taxAmount=price*0.12/100;
			System.out.println("Tax amount is "+taxAmount);
		}
	}

}
