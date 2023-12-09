package dependent;

import dependency.Transport;
import dependency.CustomerNotificationService;

public class ATMImpl implements ATM {
	private Transport myTransport;
	private double cash;
	private CustomerNotificationService myNotification;
	private ATMImpl(double cash1234) {
		this.cash = cash1234;
//		myTransport = null;
		System.out.println("in cnstr of " + getClass().getName() + cash + " " + myTransport +myNotification);
		
	}

	@Override
	public void deposit(double amt) {
		System.out.println("depositing " + amt);
		
		byte[] data = ("depositing " + amt).getBytes();
		myTransport.informBank(data);// dependent obj is calling dependency's method to inform the bank
		myNotification.alertCustomer(amt + " deposited");
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	public Transport getMyTransport() {
		return myTransport;
	}

	public void setMyTransport(Transport myTransport) {
		this.myTransport = myTransport;
	}

	public CustomerNotificationService getmyNotification() {
		return myNotification;
	}

	public void setMyNotification(CustomerNotificationService myNotification) {
		this.myNotification = myNotification;
	}

	@Override
	public void withdraw(double amt) {
		System.out.println("withdrawing " + amt);
		byte[] data = ("withdrawing " + amt).getBytes();
		myTransport.informBank(data);
		myNotification.alertCustomer(amt + " withdrawn");
	}

	// custom init method
	public void myInit() {
		System.out.println("in init " + myTransport);// not null
	}

	// custom destroy method
	public void myDestroy() {
		System.out.println("in destroy " + myTransport);// not null
	}
	//factory method based D.I
//	public static ATMImpl myFactoryMethod(Transport t12) {
//		System.out.println("in factory method "+t12);
//		return new ATMImpl(t12);
	}


