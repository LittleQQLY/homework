package homework3;

public class CreateAddEquation extends CreateEquation{

	public CreateEquation createEquation() {
		CreateEquation formula = new CreateAddEquation();
		formula.setOp('+');
		formula.setLeftNum(formula.randomNum());
		formula.setRightNum(formula.randomNum());
		formula.setAns(formula.getLeftNum() + formula.getRightNum());
		while (!formula.checkEquation(formula)) {
			formula.setLeftNum(formula.randomNum());
			formula.setRightNum(formula.randomNum());
			formula.setAns(formula.getLeftNum() + formula.getRightNum());
		}
		return formula;
	}

}
