package model;

/**
 * @author Joe Shilkaitis - jshilkaitis
 * CIS175 - Fall 2022
 * Sep 22, 2022
 */
public class additionCalculator {

	private int userInt1;
	private int userInt2;
	private int sum;
	
	public additionCalculator() {
		super();
	}

	public additionCalculator(int userInt1, int userInt2) {
		super();
		this.userInt1 = userInt1;
		this.userInt2 = userInt2;
		add(userInt1, userInt2);
	}
	
	public void add(int int1, int int2) {
		int result = int1 + int2; 
		setSum(result);
	}

	@Override
	public String toString() {
		return "additionCalculator [userInt1=" + userInt1 + ", userInt2=" + userInt2 + ", sum=" + sum + "]";
	}

	public int getUserInt1() {
		return userInt1;
	}

	public void setUserInt1(int userInt1) {
		this.userInt1 = userInt1;
	}

	public int getUserInt2() {
		return userInt2;
	}

	public void setUserInt2(int userInt2) {
		this.userInt2 = userInt2;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
}
