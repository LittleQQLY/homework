package homework3;

import java.util.ArrayList;
import java.util.List;

public class CreateProblem {

	public static final int N = 50;
	public static final int LINENUM = 5;
	private static List<CreateEquation> list = new ArrayList<>();

	public void creatAddProblem() {
		CreateEquation equation = new CreateAddEquation();
		for (int i = 0; i < N; ++i) {
			equation = equation.createEquation();
			if (this.check(list, equation))
				list.add(equation);
			else
				i--;
		}
	}

	public void creatSubProblem() {
		CreateEquation equation = new CreateSubEquation();
		for (int i = 0; i < N; ++i) {
			equation = equation.createEquation();
			if (this.check(list, equation))
				list.add(equation);
			else
				i--;
		}
	}

	public void creatMixedProblem() {
		CreateEquation equation = new CreateMixedEquation();
		for (int i = 0; i < N; ++i) {
			equation = equation.createEquation();
			if (this.check(list, equation))
				list.add(equation);
			else
				i--;
		}
	}

	public boolean check(List<CreateEquation> list, CreateEquation t) {
		for (int i = 0; i < list.size(); ++i) {
			if (list.get(i).getAns() == t.getAns()) {
				if ((list.get(i).getOp() == t.getOp()) && (t.getOp() == '-')
						&& (list.get(i).getRightNum() == t.getRightNum())) {
					return false;
				} else if ((list.get(i).getOp() == t.getOp()) && (t.getOp() == '+')
						&& (t.getLeftNum() == list.get(i).getLeftNum()
								|| t.getLeftNum() == list.get(i).getRightNum())) {
					return false;
				}
			}
		}
		return true;
	}

	public void printf() {

		for (int i = 0; i < list.size(); ++i) {
			if ((i + 1) % LINENUM == 1) {
				System.out.printf("%3d~%3d: ", i + 1, i + 5);

			}

			System.out.printf("%3d  %c %3d =     ", list.get(i).getLeftNum(), list.get(i).getOp(),
					list.get(i).getRightNum());

			if ((i + 1) % LINENUM == 0)
				System.out.println();
		}

		System.out.println("************²Î¿¼´ð°¸*****************");
		for (int i = 0; i < list.size(); ++i) {
			if ((i + 1) % LINENUM == 1) {
				System.out.printf("%3d~%3d: ", i + 1, i + 5);

			}

			System.out.printf("%5d", list.get(i).getAns());

			if ((i + 1) % LINENUM == 0)
				System.out.println();
		}
	}
}
