
public class FoodChain extends AbsChain {
	protected int numSuppliers;
	public FoodChain(String chainName,int numSuppliers) {
		super(chainName);
		this.numSuppliers = numSuppliers;
		
	}
	public int getNumSuppliers() {
		return numSuppliers;
	}
	public void setNumSuppliers(int numSuppliers) {
		this.numSuppliers = numSuppliers;
	}
	@Override
	public String toString() {
		return "FoodChain [numSuppliers=" + numSuppliers + "]";
	}
	
	
	
}
