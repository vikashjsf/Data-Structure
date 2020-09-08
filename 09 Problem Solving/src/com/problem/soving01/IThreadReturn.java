//Returning value from Thread
package com.problem.soving01;

public class IThreadReturn implements Runnable {
	public volatile int pinCode;
	public volatile String city;
	
	@Override
	public void run() {
		pinCode = 834001;
		city = "Ranchi";
	}
	
	public int getPinCode() {
		return pinCode;
	}
	public String getCity() {
		return city;
	}
	
	public static void main(String[] args) throws InterruptedException {
		IThreadReturn it = new IThreadReturn();
		System.out.println("Before thread start");
		System.out.println("Pin: "+it.getPinCode());
		System.out.println("City: "+it.getCity());
		Thread th = new Thread(it);
		th.start();
		th.join();
		System.out.println("After execution of  thread");
		System.out.println("Pin: "+it.getPinCode());
		System.out.println("City: "+it.getCity());
		
	}
}
