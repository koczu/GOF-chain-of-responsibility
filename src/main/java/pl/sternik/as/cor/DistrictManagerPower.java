package pl.sternik.as.cor;

public class DistrictManagerPower extends AcceptancePower {
    
	@Override
	protected double getMaxAllowedAmount() {
		return 2000;
	}

	@Override
	protected String getRoleName() {
		return "District Director";
	}
}