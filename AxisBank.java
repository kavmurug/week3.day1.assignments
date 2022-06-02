package week3.day1.assignments;

// Overriding deposit method

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Deposited money");
	}

	public static void main(String[] args) {
		AxisBank axisBank = new AxisBank();
		axisBank.saving();
		axisBank.fixed();
		axisBank.deposit();
		BankInfo bankInfo = new BankInfo();
		bankInfo.deposit();
	}
}
