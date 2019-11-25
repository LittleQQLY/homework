package homework3;

public class CreateSubEquation extends CreateEquation{

	public CreateEquation createEquation() {
		CreateEquation formula = new CreateSubEquation();
		formula.setOp('-');
		formula.setLeftNum(formula.randomNum());
		formula.setRightNum(formula.randomNum());
		formula.setAns(formula.getLeftNum() - formula.getRightNum());
		while (!formula.checkEquation(formula)) {
			formula.setLeftNum(formula.randomNum());
			formula.setRightNum(formula.randomNum());
			formula.setAns(formula.getLeftNum() - formula.getRightNum());
		}
		return formula;
	}

}
