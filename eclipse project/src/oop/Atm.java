package oop;

public abstract class Atm {
	static String companyincharge= "CISCO";
	abstract void withdrawMoney(int psd);
	abstract void CheckBalance(int psd);
	abstract void ChangePin();
	abstract void printStatement();
	}

