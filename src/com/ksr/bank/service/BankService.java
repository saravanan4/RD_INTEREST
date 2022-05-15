package com.ksr.bank.service;
import com.ksr.bank.acc.Account;
import com.ksr.bank.acc.RDAccount;
import com.ksr.bank.exception.BankValidationException;

public class BankService
{
	 float maturityInterest=0 ;
	 float totalPrincipaldeposited=0 ;
public boolean  ValidateData(float principal,int tenure,int age, String gender)
	{  
		float p= principal ;
		int t = tenure;
		String g= gender;
		int a=age;
		boolean i=true;
	try 
	{
		if((p>=500)&&(t==5||t==10)&&(a>=0 && a<=100)&&(g=="Male"||g=="Female"))
		{}	//i=true;
		else
			throw new BankValidationException();	
	}
	catch(BankValidationException e)
	{
		return false;
	}
	return i;
    }
public void Calculate(float principal,int tenure,int age, String gender) 
{
		
		boolean B; 
		B=ValidateData(principal, tenure, age, gender);
		
		if(B==true)
		{
		
			Account R = new RDAccount(tenure,principal);
			System.out.println("\n<<<< RD INTEREST CALCULATOR >>>>\n");
			System.out.println("********************************");
			System.out.println("Principal Amount:" +principal);
			System.out.println("Tenure Amount(in years):"+ tenure);
			System.out.println("Age:"+age);
			System.out.println("Gender:"+ gender);
			System.out.println("********************************");
			R.setInterest(age, gender);
			System.out.println("Total Interest:" +R.calculateInterest());
			System.out.println("Total Amount Deposited:" +R.calculateAmountDeposited());
			System.out.println("Total Maturity Amount:" + R.calculateMaturityAmount(totalPrincipaldeposited,maturityInterest));
			System.out.println("********************************");
		}
		else if(B==false)
		{
			BankValidationException C=new BankValidationException();
			System.out.println(C.toString());
		}
	}
			
}