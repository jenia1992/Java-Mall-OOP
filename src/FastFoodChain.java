
public class FastFoodChain extends AbsChain {
	protected int numSuppliers;
	protected double priceDeal;
	protected double studentDiscount;
	
	public FastFoodChain(String chainName, int numSuppliers, double priceDeal, double studentDiscount) {
		super(chainName);
		this.numSuppliers = numSuppliers;
		this.priceDeal = priceDeal;
		this.studentDiscount = studentDiscount;
	}

	public int getNumSuppliers() {
		return numSuppliers;
	}

	public void setNumSuppliers(int numSuppliers) {
		this.numSuppliers = numSuppliers;
	}

	public double getPriceDeal() {
		return priceDeal;
	}

	public void setPriceDeal(double priceDeal) {
		this.priceDeal = priceDeal;
	}

	public double getStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(double studentDiscount) {
		this.studentDiscount = studentDiscount;
	}

	@Override
	public String toString() {
		return "FastFoodChain [numSuppliers=" + numSuppliers + ", priceDeal=" + priceDeal + ", studentDiscount="
				+ studentDiscount + "]";
	}
	
	
	
}
