package com.ksr.bank.main;

import com.ksr.bank.service.BankService;

public class MainClass {

	public static void main(String[] args)
	{
		float principal=1000;
		int tenure=5;
		int age=34;
		String gender="Male";
        BankService saro= new BankService();
      	saro.Calculate(principal, tenure, age, gender);
	}
}
