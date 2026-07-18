package com.rays.icon;

public class Order {

	private Inventary inventary;
	private Payment payment;

	public void setInventary(Inventary inventary) {
		this.inventary = inventary;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	public void order(int item) {
		
		int peritem = 100;
		int totalAmount = item * peritem;
		int remainingAmt = payment.pay(totalAmount);
		int remaningBook = inventary.sold(peritem);
		
		System.out.println(" amount paid " + totalAmount);
		System.out.println(" book order " + item);
		System.out.println(" remainingAmt" + "" + remainingAmt + " ");
		System.out.println(" remainingBook" + "" + remaningBook + "");
		
	}

}
