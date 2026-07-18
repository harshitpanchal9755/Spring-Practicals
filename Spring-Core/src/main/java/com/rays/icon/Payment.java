package com.rays.icon;

public class Payment {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int pay(int amount) {
		
		if(amount > balance) {
			System.out.println("insufficient Balance");
			
		}else {
			balance = balance - amount;
			return balance;
		}
		return balance;
	}
}
