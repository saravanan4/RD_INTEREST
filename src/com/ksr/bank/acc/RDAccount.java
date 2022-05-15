package com.ksr.bank.acc;
import com.ksr.bank.acc.Account;
public  class RDAccount extends Account 
{
		float n,i,p;
		float amount;
		String g;
		float t;
		float R;
		int a;
		
public	RDAccount(int tenure,float principal) 
{
			n=4;
			p=principal;
			t=tenure;
}
public float calculateAmountDeposited()
	{
		float value = (p*t*12); 
		return value;
	}
public float  calculateInterest()
	{ 
		R= 1 + (rateofInterest/100)/n;
		for (i=t*12;i>0;i=i-1)
		{
			amount += p*(Math.pow(R,(n*i/12))-1);
		}
	return amount;
}
}