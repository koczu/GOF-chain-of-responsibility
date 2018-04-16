package pl.sternik.as.cor;

public class RegionalManagerPower extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 30000;
	}

	@Override
	protected String getRoleName() {
		return "Manager district";
	}
}