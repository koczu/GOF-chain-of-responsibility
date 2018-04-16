package pl.sternik.as.cor;

public abstract class AcceptancePower {
	protected AcceptancePower successor;

	abstract protected double getMaxAllowedAmount();

	abstract protected String getRoleName();

	public void setSuccessor(AcceptancePower successor) {
		this.successor = successor;
	}

	public void processRequest(LoanRequest request) {
		if (request.getAmount() < this.getMaxAllowedAmount()) {
			System.out.println(this.getRoleName() + " accepting price: " + request.getAmount() + " loan: "
					+ request.getPurpose());
		} else if (successor != null) {
			successor.processRequest(request);
		} else {
			System.out.println("Too much");
		}
	}
}