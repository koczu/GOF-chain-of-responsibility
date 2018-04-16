package pl.sternik.as.cor;

public class BranchManagerPower extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 500;
	}

	@Override
	protected String getRoleName() {
		return "Branch Manager";
	}
}