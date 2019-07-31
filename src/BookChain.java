
public class BookChain extends AbsChain {
	protected String bestSeller;

	public BookChain(String chainName, String bestSeller) { 
		super(chainName);
		this.bestSeller = bestSeller;
	}

	public String getBestSeller() {
		return bestSeller;
	}

	public void setBestSeller(String bestSeller) {
		this.bestSeller = bestSeller;
	}

	@Override
	public String toString() {
		return "BookChain [bestSeller=" + bestSeller + "]";
	}
	
}
