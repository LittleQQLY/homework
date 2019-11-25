package homework3;

import java.util.Random;

public abstract class CreateEquation {

	public static final int UPPER = 101;
	public static final int LOW = 0;
	private int leftNum;
	private int rightNum;
	private int ans;
	private char op;

	public void setLeftNum(int leftNum) {
		this.leftNum = leftNum;
	}

	public void setRightNum(int rightNum) {
		this.rightNum = rightNum;
	}

	public void setOp(char op) {
		this.op = op;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}

	public int getLeftNum() {
		return this.leftNum;
	}

	public int getRightNum() {
		return this.rightNum;
	}

	public char getOp() {
		return this.op;
	}

	public int getAns() {
		return this.ans;
	}

	public int randomNum() {
		Random t = new Random();
		return t.nextInt(UPPER);
	}

	public char randomOp() {
		Random t = new Random();
		int x = t.nextInt(2);
		if (x == 0)
			return '+';
		else
			return '-';
	}

	public boolean checkEquation(CreateEquation formula) {
		if (formula.getAns() >= LOW && formula.getAns() <= UPPER)
			return true;
		else
			return false;
	}

	public abstract CreateEquation createEquation();


}
