package com.xworkz.ControlStatements;

public class TaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int annualIncome=400000;
		double taxAmount;
		if(annualIncome>=200000) {
			taxAmount=annualIncome*0.8;
			System.out.println("Tax amount is " +taxAmount);
		}
		else {
			System.out.println("not eligible for tax");
		}
		
	}

}
