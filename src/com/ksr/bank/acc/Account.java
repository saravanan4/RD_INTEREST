package com.ksr.bank.acc;

public abstract class Account
{
		int tenure;
		float principal;
		float rateofInterest;
public void setInterest(int age,String gender)
{    
	 if (gender.equals("Male"))
	  {
	 	if (age < 60)
	 		rateofInterest=9.8f;
	 	else if (age>=60)
	 		rateofInterest=10.5f;
	  }
	 else if(gender.equals("Female"))
	 {
		 if(age<58)
			 rateofInterest=10.2f;
		 else if(age>=58)
			 rateofInterest=10.8f;
	 }

}
public float calculateMaturityAmount(float TotalprincipalDeposited,float maturityInterest)
{
		float w=calculateAmountDeposited()+(calculateInterest()/2);
		return w ;
	
}
public abstract float calculateAmountDeposited();
public abstract float calculateInterest();
}


