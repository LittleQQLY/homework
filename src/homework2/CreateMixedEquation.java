package homework3;

public class CreateMixedEquation extends CreateEquation{

	public CreateEquation createEquation() {
		CreateEquation formula = new CreateMixedEquation();
		do {
			formula.setOp(formula.randomOp());
			formula.setLeftNum(formula.randomNum());
			formula.setRightNum(formula.randomNum());
			if (formula.getOp() == '+')
				formula.setAns(formula.getLeftNum() + formula.getRightNum());
			else if (formula.getOp() == '-')
				formula.setAns(formula.getLeftNum() - formula.getRightNum());
		} while (!formula.checkEquation(formula));
		return formula;
	}

}
