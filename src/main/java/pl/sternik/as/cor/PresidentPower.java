package pl.sternik.as.cor;

public class PresidentPower extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 60000;
	}

	@Override
	protected String getRoleName() {
		return "President";
	}
}